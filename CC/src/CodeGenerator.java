import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeGenerator extends PythonDictParserBaseVisitor<String> {
    private SymbolTable symbolTable;
    StringBuilder generatedCode = new StringBuilder();

    public CodeGenerator() {
        symbolTable = SymbolTable.getInstance(); // Assuming a singleton pattern for symbol table
        symbolTable.setDeclareForAllSymbols(); // ensure
    }

    @Override
    public String visitProgram(PythonDictParser.ProgramContext ctx) {
        
        for (PythonDictParser.StatementContext stmt : ctx.statement()) {
            generatedCode.append(visitStatement(stmt)); // Process each statement and append the generatedCode
        }
        return generatedCode.toString();
    }

    
    @Override
public String visitStatement(PythonDictParser.StatementContext ctx) {
    StringBuilder statementBuilder = new StringBuilder();
    // Check the type of statement and generate the corresponding code
   
    if (ctx.variable() != null) {
        statementBuilder.append(visitVariable(ctx.variable()));
        statementBuilder.append(";"); // Variables declarations always end with a semicolon
    } else if (ctx.dictValueAssignToKey() != null) {
        statementBuilder.append(visitDictValueAssignToKey(ctx.dictValueAssignToKey()));
        statementBuilder.append(";"); // Assignment statements end with a semicolon
    } else if (ctx.dict() != null) {
        statementBuilder.append(visitDict(ctx.dict()));
        // Direct dictionary definitions within a statement context should end with a semicolon
        statementBuilder.append(";");
    } else if (ctx.forLoop() != null) {
        statementBuilder.append(visitForLoop(ctx.forLoop()));
        // Loops do not need a semicolon after the block
    } else if (ctx.list() != null) {
        statementBuilder.append(visitList(ctx.list()));
        // List declarations end with a semicolon if standalone
        statementBuilder.append(";");
    } else if (ctx.methodCall() != null) {
        statementBuilder.append(visitMethodCall(ctx.methodCall()));
        statementBuilder.append(";"); // Method calls within statements end with a semicolon
    } else if (ctx.ifCondition() != null) {
        statementBuilder.append(visitIfCondition(ctx.ifCondition()));
        // Condition blocks do not need a semicolon after the block
    } else if (ctx.dictAccess() != null) {
        statementBuilder.append(visitDictAccess(ctx.dictAccess()));
        statementBuilder.append(";"); // Dictionary access, likely a part of an expression or assignment, ends with a semicolon
    } else if (ctx.expression() != null) {
        statementBuilder.append(visitExpression(ctx.expression()));
        statementBuilder.append(";"); // Expressions in statements end with a semicolon
    }
    statementBuilder.append("\n"); // Add a newline for readability
    return statementBuilder.toString();
}

    @Override
    public String visitVariable(PythonDictParser.VariableContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol symbol = symbolTable.lookup(name);
        String type = symbol != null ? symbol.getType() : "Object";

        boolean isDeclare = symbol.getIsDeclare();

        StringBuilder variableCode = new StringBuilder();
        
        if (!isDeclare)
        {
            variableCode.append(type).append(" ").append(name).append(" = ");
            symbol.isDeclare = true;
        }
        else
        {
            variableCode.append(name).append(" = ");
        }
        
        if (ctx.STRING_LITERAL() != null) {
            variableCode.append(ctx.STRING_LITERAL().getText());
        } else if (ctx.NUMERIC_LITERAL() != null) {
            variableCode.append(ctx.NUMERIC_LITERAL().getText());
        } else if (ctx.dict() != null) {

            if (ctx.dict().pairList() != null) {
                variableCode.append(visitDict(ctx.dict()));
            } else {
                variableCode.append("new " + type);
            }
        } else if (ctx.list() != null) {
            if (ctx.list().elementList() != null) {
                variableCode.append(visitList(ctx.list()));
            } else {
                variableCode.append("new " + type);
            }
        }
        return variableCode.toString();
    }

    @Override
    public String visitDict(PythonDictParser.DictContext ctx) {

        

        StringBuilder dictBuilder = new StringBuilder("new HashMap<>() {{\n");
        ctx.pairList().pair().forEach(pair -> {
            dictBuilder.append("    put(")
                       .append(pair.key().getText())
                       .append(", ")
                       .append(visitValue(pair.value()))
                       .append(");\n");
        });
        dictBuilder.append("}}\n");
        return dictBuilder.toString();
    }

    @Override
    public String visitList(PythonDictParser.ListContext ctx) {
        StringBuilder listBuilder = new StringBuilder("new ArrayList<>() {{\n");
        ctx.elementList().value().forEach(value -> {
            listBuilder.append("    add(")
                       .append(visitValue(value))
                       .append(");\n");
        });
        listBuilder.append("}}\n");
        return listBuilder.toString();
    }


    @Override
    public String visitForLoop(PythonDictParser.ForLoopContext ctx) {
        String loopVar = ctx.IDENTIFIER().getText();
        String iterable = visit(ctx.iterable());
        StringBuilder loopBuilder = new StringBuilder("for (");
        loopBuilder.append(loopVar)
                   .append(" : ")
                   .append(iterable)
                   .append(") {\n");
        ctx.statement().forEach(stmt -> loopBuilder.append(visit(stmt)));
        loopBuilder.append("}\n");
        return loopBuilder.toString();
    }

    @Override
    public String visitIfCondition(PythonDictParser.IfConditionContext ctx) {
        StringBuilder ifBuilder = new StringBuilder();
        ifBuilder.append("if (")
                 .append(visitCondition(ctx.ifBlock().condition()))
                 .append(") {\n")
                 .append(visitStatements(ctx.ifBlock().statement()))
                 .append("}\n");
        ctx.elifBlock().forEach(elif -> ifBuilder.append("else if (")
                                               .append(visitCondition(elif.condition()))
                                               .append(") {\n")
                                               .append(visitStatements(elif.statement()))
                                               .append("}\n"));
        if (ctx.elseBlock() != null) {
            ifBuilder.append("else {\n")
                     .append(visitStatements(ctx.elseBlock().statement()))
                     .append("}\n");
        }
        return ifBuilder.toString();
    }

    private String visitStatements(List<PythonDictParser.StatementContext> statements) {
        StringBuilder statementsCode = new StringBuilder();
        statements.forEach(stmt -> statementsCode.append(visit(stmt)));
        return statementsCode.toString();
    }

    public String visitCondition(PythonDictParser.ConditionContext ctx) {
        return ctx.getText(); // Simplified, ideally should handle condition parsing properly
    }
    @Override
    public String visitMethodCall(PythonDictParser.MethodCallContext ctx) {
        String dictName = ctx.IDENTIFIER().getText();
        Symbol dictSymbol = symbolTable.lookup(dictName);
    
        if (dictSymbol == null || !dictSymbol.getType().startsWith("HashMap")) {
            System.out.println(dictName + " is not declared or not a hashmap\n");
            return null;
        }
    
        StringBuilder methodCallBuilder = new StringBuilder();
        String methodName = ctx.methodName().getText();
        switch (methodName) {
            case "get":
                String key = ctx.argumentList(0).expression(0).getText();
                methodCallBuilder.append(dictName)
                                 .append(".")
                                 .append(methodName)
                                 .append("(")
                                 .append(key)
                                 .append(")");
                break;
            case "keys":
                methodCallBuilder.append("new ArrayList<>(")
                                 .append(dictName)
                                 .append(".keySet()");
                break;
            case "values":
                methodCallBuilder.append("new ArrayList<>(")
                                 .append(dictName)
                                 .append(".values())");
                break;
            case "items":
                methodCallBuilder.append("new ArrayList<>( ")
                                 .append(dictName)
                                 .append(".entrySet())");
                break;
            case "pop":
                String popKey = visit(ctx.argumentList().get(0).expression(0));
                methodCallBuilder.append(dictName)
                                 .append(".remove(")
                                 .append(popKey)
                                 .append(")");
                break;
            case "update":
                String updateDict = visit(ctx.argumentList().get(0).expression(0));
                methodCallBuilder.append(dictName)
                                 .append(".putAll(")
                                 .append(updateDict)
                                 .append(")");
                break;
            default:
                System.out.println("// Error: Unknown method " +methodName);
                break;
        }
        return methodCallBuilder.toString();
       
    }
        @Override
    public String visitDictAccess(PythonDictParser.DictAccessContext ctx) {
        return ctx.IDENTIFIER().getText() + ".get(" + visit(ctx.expression()) + ")";
    }

    @Override
    public String visitExpression(PythonDictParser.ExpressionContext ctx) {
        // Simple recursive call for nested expressions or handling based on the specific expression types
        if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        } else if (ctx.NUMERIC_LITERAL() != null) {
            return ctx.NUMERIC_LITERAL().getText();
        } else if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText();
        } else {
            // handle more complex expressions, calls etc.
            return ctx.getText();
        }
    }

    @Override
    public String visitValue(PythonDictParser.ValueContext ctx) {
        if (ctx.dict() != null) {
            return visitDict(ctx.dict());
        } else if (ctx.list() != null) {
            return visitList(ctx.list());
        } else {
            return ctx.getText(); // Simplified handling, should cover more types
        }
    }
}
