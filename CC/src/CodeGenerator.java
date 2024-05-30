import java.util.ArrayList;

public class CodeGenerator extends PythonDictParserBaseVisitor<String> {
    StringBuilder generatedCode = new StringBuilder();
    private SymbolTable symbolTable;

    public CodeGenerator ()
    {
        symbolTable = SymbolTable.getInstance(); // Get the singleton instance
        //symbolTable.printSymbolIsUSedOrNot();
        symbolTable.setDeclareForAllSymbols();
    }



    @Override
    public String visitProgram(PythonDictParser.ProgramContext ctx) {
        for (PythonDictParser.StatementContext stmt : ctx.statement()) {
            visit(stmt); // Visit each statement and process it
        }
        return generatedCode.toString();
    }

    @Override
public String visitStatement(PythonDictParser.StatementContext ctx) {
    if (ctx.statementWithLineComments() != null)
    {
        generatedCode.append(ctx.statementWithLineComments().getText());
       generatedCode.append("\n");
    }
    if (ctx.variable() != null) {
        return visitVariable(ctx.variable());
    } else if (ctx.dictValueAssignToKey() != null) {
        return visitDictValueAssignToKey(ctx.dictValueAssignToKey());
    } else if (ctx.dict() != null) {
        return visitDict(ctx.dict());
    } else if (ctx.forLoop() != null) {
        return visitForLoop(ctx.forLoop());
    } else if (ctx.list() != null) {
        return visitList(ctx.list());
    } else if (ctx.methodCall() != null) {
        return visitMethodCall(ctx.methodCall());
    } else if (ctx.ifCondition() != null) {
        return visitIfCondition(ctx.ifCondition());
    } else if (ctx.dictAccess() != null) {
        return visitDictAccess(ctx.dictAccess());
    } else if (ctx.expression() != null) {
        return visitExpression(ctx.expression());
    }
    // else if (ctx.variable().constructor() != null) 
    // {
    //     return visitConstructor(ctx.variable().constructor());
    // }
    else {
 // or some error handling if unexpected case occurs
    return null;
    }
}


    @Override
    public String visitVariable(PythonDictParser.VariableContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String assignmenttOperator = ctx.ASSIGN().getText();
        //System.out.println("name: " + name);
        String type = "";

        Symbol s = SymbolTable.lookup(name);
        //System.out.println("type: " + s.getType());

        //System.out.println("s: " + s);

        boolean isdeclared = s.getIsDeclare();
        //System.out.println("s: " + isdeclared);

        if (!isdeclared){
            type = s.getType();
        }

        if (s.getType().equals("Integer")) 
        {
            generatedCode.append(type).append(" ").append(name).append(" ").append(assignmenttOperator).append(" ").append(ctx.NUMERIC_LITERAL()).append(";");
            generatedCode.append(" ");
            s.setIsDeclare(true);
            
        }

        else if (s.getType().equals("String"))
        {
            generatedCode.append(type).append(" ").append(name).append(" ").append(assignmenttOperator).append(" ").append(ctx.STRING_LITERAL()).append(";");
            generatedCode.append(" ");
            s.setIsDeclare(true);
            
        }
        
        else if (s.getType().startsWith("HashMap"))
        {

            //System.out.println(s.getType());
            generatedCode.append(s.getType())
            .append(" ")
            .append(name)
            .append(" ")
            .append(assignmenttOperator)
            .append(" ")
            .append("new ")
            .append(s.getType())
            .append(";\n");

            PythonDictParser.DictContext dictCtx = ctx.dict();

            for (PythonDictParser.PairContext pair : dictCtx.pairList().pair()) {
            generatedCode.append(name)
                            .append(".put(")
                            .append(pair.key().getText())
                            .append(", ")
                            .append(pair.value().getText())
                            .append(");\n");
            }
            //generatedCode.append(" ");
            s.setIsDeclare(true);
            

        }

        else if (s.getType().startsWith("ArrayList"))
        {
            generatedCode.append(s.getType())
            .append(" ")
            .append(name)
            .append(" ")
            .append(assignmenttOperator)
            .append(" ")
            .append("new ")
            .append(s.getType())
            .append(";\n");

            PythonDictParser.ListContext listCtx = ctx.list();
            for (PythonDictParser.ValueContext value : listCtx.elementList().value()) {
                generatedCode.append(name)
                            .append(".add(")
                            .append(value.getText()) // Make sure this returns the appropriate string representation
                            .append(");\n");
    }

    generatedCode.append(" ");
    s.setIsDeclare(true);
    
        }
        else if(ctx.constructor() != null)
        {
            PythonDictParser.ConstructorContext obj = ctx.constructor();

            String id = obj.IDENTIFIER().getText();
            String args = visitArgumentList(obj.argumentList()); // Ensure you have a method to process and return comma-separated arguments
            System.out.println(obj.argumentList().getText());
            
            generatedCode.append(id)
            .append(" ")
            .append(name)
            .append(" = new ")
            .append(id)
            .append(obj.PAREN_OPEN())
            .append(obj.argumentList().getText())
            .append(obj.PAREN_CLOSE() + ";");
            return generatedCode.toString();
        }

        new ArrayList<>().add(generatedCode);
        return null; 
        
    }


    @Override
    public String visitForLoop(PythonDictParser.ForLoopContext ctx) {
        // Logic to generate code for a for-loop
        String iterableName = ctx.iterable().getText();
        Symbol iterableSymbol = SymbolTable.lookup(iterableName); 

        if (iterableSymbol == null || !iterableSymbol.getType().startsWith("HashMap")) {
            System.err.println("Error: The variable '" + iterableName + "' is not declared as a HashMap.");
            return null;
        }

        Symbol s = SymbolTable.lookup(iterableName);
        String keyType = extractKeyType(s.getType());

        //System.out.println("key Type: " + keyType);       

        generatedCode.append("for (")
                    .append(keyType)
                    .append(" key : ")
                    .append(iterableName)
                    .append(".keySet()) {\n")
                    .append("}\n");

        

        return null;
    }

    public static String extractKeyType(String input) {
        int start = input.indexOf('<') + 1;
        int end = input.indexOf(',');
        
        if (start > 0 && end > start) {
            return input.substring(start, end).trim();
        }     
        return null; 
    }

    public static String extractValueType(String input) {
        int start = input.indexOf(',') + 1;
        int end = input.indexOf('>');
    
        if (start > 0 && end > start) {
            return input.substring(start, end).trim();
        }
        return null;
    }

    @Override
public String visitMethodCall(PythonDictParser.MethodCallContext ctx) {
    String dictName = ctx.IDENTIFIER().getText();
    Symbol dictSymbol = symbolTable.lookup(dictName);

    Symbol s = SymbolTable.lookup(dictName);
    String keyType = extractKeyType(s.getType());
    String valueType = extractValueType(s.getType());
    

    if (dictSymbol == null || !dictSymbol.getType().startsWith("HashMap")) {
        // Handle error: dictionary not declared or not a hashmap
        generatedCode.append("// Error: ").append(dictName).append(" is not declared or not a hashmap\n");
        return null;
    }

    String methodName = ctx.methodName().getText();
    switch (methodName) {
        case "get":
            // Assuming the 'get' method call includes one argument
            //String key = ctx.argumentList().get(0).expression(0);
            String key = ctx.argumentList(0).expression(0).getText();
            System.out.println("key: " + ctx.argumentList(0).expression(0).getText());
            
            generatedCode//append(dictSymbol.getType())
                .append("")
                .append(dictName)
                .append(ctx.DOT())
                .append(methodName)
                .append(ctx.PAREN_OPEN())
                .append(key)
                .append(ctx.PAREN_CLOSE())
                .append(";")
                .append("\n");
            break;


        case "keys":
        //ArrayList<String> keys = new ArrayList<>(myHashMap.keySet());

        // Code generation for 'keys' method
            generatedCode.append("ArrayList<type> variableName ")
                .append("= new ArrayList<>")
                .append(ctx.PAREN_OPEN())
                .append(dictName)
                .append(".keySet()")
                .append(ctx.PAREN_CLOSE())
                .append(";")
                .append("\n");
            break;


        case "values":
        //ArrayList<Integer> values = new ArrayList<>(myHashMap.values());

        // Code generation for 'values' method
        generatedCode.append("ArrayList<type> variableName ")
            .append("= new ArrayList<>")
            .append(ctx.PAREN_OPEN())
            .append(dictName)
            .append(".keySet()")
            .append(ctx.PAREN_CLOSE())
            .append(";")
            .append("\n");
            break;


        case "items":
       //ArrayList<Map.Entry<String, Integer>> items = new ArrayList<>(myHashMap.entrySet());

        // Code generation for 'items' method - not directly supported in Java, simulated using entrySet
            generatedCode.append("ArrayList<Map.Entry<")
            .append(keyType)
            .append(", ")
            .append(valueType)
            .append(">> ")
            .append("variableName")
            .append("= ")
            .append("= new ArrayList<>")
            .append(ctx.PAREN_OPEN())
            .append(dictName)
            .append(".keySet()")
            .append(ctx.PAREN_CLOSE())
            .append(";")
            .append("\n");

            break;

        case "pop":
            // Assuming pop method takes one key argument
            // Assuming visit method returns a String
            String popKey = visit(ctx.argumentList().get(0).expression(0));
            generatedCode.append(dictSymbol.getType())
                .append(" removedValue = ")
                .append(dictName)
                .append(".remove(")
                .append(popKey)
                .append(");\n");
            break;
        case "update":
            // Assuming update method takes one dictionary argument
            String updateDict = visit(ctx.argumentList().get(0).expression(0));
            
            generatedCode.append(dictName)
                .append(".putAll(")
                .append(updateDict)
                .append(");\n");
            break;
        default:
            generatedCode.append("// Error: Unknown method ").append(methodName).append("\n");
            break;
    }
    return null;
}

@Override
public String visitDictAccess(PythonDictParser.DictAccessContext ctx) {
    String dictName = ctx.IDENTIFIER().getText();
    String keyExpression = ctx.expression().getText(); 
    
        generatedCode//append(dictSymbol.getType())
            .append("")
            .append(dictName)
            .append(".")
            .append("get")
            .append("(")
            .append(keyExpression)
            .append(")")
            .append(";");

    return null;
}

@Override
public String visitDictValueAssignToKey (PythonDictParser.DictValueAssignToKeyContext ctx) {
    String dictName = ctx.IDENTIFIER().getText();
    String keyExpression = ctx.key().getText(); 
    String valueExpression = ctx.value().getText();
    
        generatedCode//append(dictSymbol.getType())
            .append(dictName)
            .append(".")
            .append("put")
            .append("(")
            .append(keyExpression)
            .append(", ")
            .append(valueExpression)
            .append(")")
            .append(";");

    return null;
}

@Override
public String visitIfCondition(PythonDictParser.IfConditionContext ctx) {
    StringBuilder generatedCode = new StringBuilder();
    generatedCode.append(visitIfBlock(ctx.ifBlock()));

    // Visit all elif blocks
    for (PythonDictParser.ElifBlockContext elifBlock : ctx.elifBlock()) {
        generatedCode.append(visitElifBlock(elifBlock));
    }

    // Visit else block if it exists
    if (ctx.elseBlock() != null) {
        generatedCode.append(visitElseBlock(ctx.elseBlock()));
    }

    return generatedCode.toString();
}

@Override
public String visitIfBlock(PythonDictParser.IfBlockContext ctx) {
    generatedCode.append("\n").append("if (")
                 .append(ctx.condition().getText())
                 .append(") {\n");

    for (PythonDictParser.StatementContext stmt : ctx.statement()) {
           visit(stmt); 
        
    }

    generatedCode.append("}\n");
    return generatedCode.toString();
}

@Override
public String visitElifBlock(PythonDictParser.ElifBlockContext ctx) {
    generatedCode.append("else if (")
                 .append(ctx.condition().getText())
                 .append(") {\n");

    for (PythonDictParser.StatementContext stmt : ctx.statement()) {
               
        visit(stmt); 
        
    }

    generatedCode.append("}\n");
    return generatedCode.toString();
}

@Override
public String visitElseBlock(PythonDictParser.ElseBlockContext ctx) {
    generatedCode.append("else {\n");

    for (PythonDictParser.StatementContext stmt : ctx.statement()) {
               
            visit(stmt); 
        
    }

    generatedCode.append("}\n");
    return generatedCode.toString();
}

@Override
public String visitValue(PythonDictParser.ValueContext ctx){
    if (ctx.list() != null)
    {
        return visitList(ctx.list());
    }
    return null;
}

// @Override
// public String visitConstructor(PythonDictParser.ConstructorContext ctx) {
//     String id = ctx.IDENTIFIER().getText();
//     String args = visitArgumentList(ctx.argumentList()); // Ensure you have a method to process and return comma-separated arguments
    
//     generatedCode.append(id)
//     .append(" ")
//     .append(id)
//     .append(" = new ")
//     .append(id)
//     .append(ctx.PAREN_OPEN())
//     .append(args)
//     .append(ctx.PAREN_CLOSE());
//     return generatedCode.toString();
// }


// @Override 
// public String visitList(PythonDictParser.ListContext ctx)
// {
//     ctx.generatedCode.append("new ArrayList<>().add(generatedCode)");
//     return null;

}
