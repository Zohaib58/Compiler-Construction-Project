import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

class SemanticAnalyzer extends PythonDictParserBaseVisitor<Void> {
    private SymbolTable symbolTable;
    private boolean hasErrors = false;

    public SemanticAnalyzer() {
        symbolTable = SymbolTable.getInstance(); // Get the singleton instance
    }

    public boolean hasErrors () {
        return this.hasErrors;
    }

    @Override
    public Void visitVariable(PythonDictParser.VariableContext ctx) { 
        String name = ctx.IDENTIFIER().getText();
        int lineNumber = ctx.getStart().getLine();
        String type = "unknown";  // Default to unknown type

        if (ctx.STRING_LITERAL() != null) {
                type = inferLiteralType(ctx.STRING_LITERAL().getText());  // Java equivalent of string
            } else if (ctx.NUMERIC_LITERAL() != null) {
                type = inferLiteralType(ctx.NUMERIC_LITERAL().getText());
            } else if (ctx.dict() != null) {
                type = inferDictType(ctx.dict());
                }
            else if (ctx.list() != null) {
                type = inferListType(ctx.list());
                }

        boolean isDeclared = SymbolTable.lookup(name) != null;
        boolean isSame = true;

        if(isDeclared)
        {
            if(type == "dict")
            {
                isSame = dictTypeCheck(isDeclared, name, type);
            }

            else {
                isSame = typeCheck(name, type);
            }
        }

        else if(!isDeclared || !isSame)
        {
            SymbolTable.define(name, type, lineNumber, true);
        }

        // // String dictType[] = new String[3];
        // // boolean isDictTypeSame = true;    
        // if (ctx.STRING_LITERAL() != null) {
        //     type = inferLiteralType(ctx.STRING_LITERAL().getText());  // Java equivalent of string
        //     isSame = typeCheck(declared, name, type);
        // } else if (ctx.NUMERIC_LITERAL() != null) {
        //     type = inferLiteralType(ctx.NUMERIC_LITERAL().getText());
        //     isSame = typeCheck(declared, name, type);
        // } else if (ctx.dict() != null) {
        //     type = inferDictType(ctx.dict());
        //     isSame = dictTypeCheck(declared, name, type);
        //     }
        // else if (ctx.list() != null) {
        //     type = inferListType(ctx.list());
        //     isSame = false;
        //     }
        
        // // Define the variable in the symbol table with the inferred type
        // if (!isSame)
        // {
        //     SymbolTable.define(name, type, lineNumber, true);
        // }
        
        // Continue visiting children nodes
        return visitChildren(ctx);
    }

    @Override
    public Void visitMethodCall(PythonDictParser.MethodCallContext ctx) {
    String dictName = ctx.IDENTIFIER().getText();
    Symbol dictSymbol = SymbolTable.lookup(dictName);

    if (dictSymbol == null) {
        System.out.println("Error: Dictionary not declared: " + dictName);
        this.hasErrors = true;
        return null;
    }

    if (!dictSymbol.type.startsWith("HashMap")) {
        System.out.println("Error: Identifier is not a hashmap: " + dictName);
        this.hasErrors = true;
        return null;
    }

    String methodName = ctx.methodName().getText();
    List arguments = ctx.argumentList();

    System.out.println("61: " + ctx.argumentList(61));

    System.out.println("dictName: " + dictName);
    
    System.out.println("dictSymbol: " + dictSymbol);
    
    System.out.println("methodName: " + methodName);
    
    System.out.println("arguments: " + arguments);


    switch (methodName) {
        case "get":
            if (arguments.size() > 1) {
                System.err.println("Error: Too many arguments for 'get' method.");
                this.hasErrors = true;
            } else if (arguments.size() < 1) {
                System.err.println("Error: Too few arguments for 'get' method.");
                this.hasErrors = true;
            }
            // else if (arguments.get(0).expression().size() == 1) {
            //     String valueType = extractValueTypeFromHashMap(dictSymbol.getType());
            //     // Assuming you have a way to get the variable name where the result is stored:
            //     String resultVarName = getResultVarName(ctx.parent);
            //     symbolTable.define(resultVarName, valueType, ctx.getStart().getLine(), true);
            // }
            break;

        case "keys":
            // 'keys' method should not have any arguments
            if (!arguments.isEmpty()) {
                System.err.println("Error: 'keys' method does not take arguments.");
                this.hasErrors = true;
            }
            break;

        case "values":
            // 'values' method should not have any arguments
            if (!arguments.isEmpty()) {
                System.err.println("Error: 'values' method does not take arguments.");
                this.hasErrors = true;
            }
            break;

        case "items":
            // 'items' method should not have any arguments
            if (!arguments.isEmpty()) {
                System.err.println("Error: 'items' method does not take arguments.");
                this.hasErrors = true;
            }
            break;
        case "pop":

            // 'pop' usually takes one optional argument (the key)
            if (arguments.size() > 1) {
                System.err.println("Error: Too many arguments for 'pop' method.");
                this.hasErrors = true;
            }
            break;
        case "update":

            // 'update' should take exactly one argument, another dictionary
            if (arguments.size() != 1) {
                System.err.println("Error: 'update' method requires exactly one argument.");
                this.hasErrors = true;
            }
            break;

        default:
            System.err.println("Semantic Error: Unknown method name: " + methodName);
            this.hasErrors = true;
            break;
    }
    
    return null;
}
    
    public boolean typeCheck (String name, String type)
    {
            Symbol s = SymbolTable.lookup(name);
            String typeSecondDeclare = s.getType();
            if (typeSecondDeclare != type)
            {
                System.out.println("The type does not match");
                this.hasErrors = true;
                return false;
            }         
        return true;  
    }

    public boolean dictTypeCheck (boolean declared, String name, String type)
    {
        boolean result = false;
        if (declared == true) {

            // Find the starting index of the keyType
            int keyTypeStartIndex = type.indexOf("<") + 1;
            // Find the ending index of the keyType
            int keyTypeEndIndex = type.indexOf(",");

            // Extract the keyType substring
            String keyType = type.substring(keyTypeStartIndex, keyTypeEndIndex).trim();

            // Find the starting index of the valueType
            int valueTypeStartIndex = keyTypeEndIndex + 1;
            // Find the ending index of the valueType
            int valueTypeEndIndex = type.indexOf(">");

            // Extract the valueType substring
            String valueType = type.substring(valueTypeStartIndex, valueTypeEndIndex).trim();

            Symbol s = SymbolTable.lookup(name);
            String typee = s.getType();

            // Find the starting index of the keyType
            int keyTypeStartIndexOfOld = typee.indexOf("<") + 1;
            // Find the ending index of the keyType
            int keyTypeEndIndexOfOld = typee.indexOf(",");

            // Extract the keyType substring
            String keyTypeOfOld = typee.substring(keyTypeStartIndex, keyTypeEndIndex).trim();

            // Find the starting index of the valueType
            int valueTypeStartIndexOfOld = keyTypeEndIndex + 1;
            // Find the ending index of the valueType
            int valueTypeEndIndexOfOld = typee.indexOf(">");

            // Extract the valueType substring
            String valueTypeOfOld = typee.substring(valueTypeStartIndex, valueTypeEndIndex).trim();

            if (keyType != keyTypeOfOld)
            {
                if (keyType != "Object" && keyTypeOfOld != "Object")
                {
                    System.out.println("The type does not match");
                    result = false;
                    this.hasErrors = true;
                    return result;
                }
                
            }
            if (valueType != valueTypeOfOld)
            {
                if (valueType != "Object" && valueTypeOfOld != "Object")
                {
                    System.out.println("The type does not match");
                    result = false;
                    this.hasErrors = true;
                    return result;
                }
            }           
        }
        return result;
    }
    
    public String inferDictType(PythonDictParser.DictContext dictCtx){
        Set<String> keyTypes = new HashSet<>();
        Set<String> valueTypes = new HashSet<>();

        //String[] result = new String [3];

        for (PythonDictParser.PairContext pair : dictCtx.pairList().pair())
        {
            if (pair.key() != null)
            {
                keyTypes.add(inferLiteralType(pair.key().getText()));
            }
            if (pair.value() != null)
            {
                valueTypes.add(inferLiteralType(pair.value().getText()));
            }
        }
        String keyType = generaliseTypes(keyTypes);
        String valueType = generaliseTypes(valueTypes);

        // result[0] = "HashMap<" + keyType + ", " + valueType + ">";
        // result[1] = keyType;
        // result[2] = valueType;

        return "HashMap<" + keyType + ", " + valueType + ">";
    }

    public String inferListType(PythonDictParser.ListContext listCtx) {
        Set<String> elementTypes = new HashSet<>();
    
        if (listCtx.elementList() != null) { // Check if elementList exists
            for (PythonDictParser.ValueContext element : listCtx.elementList().value()) {
                elementTypes.add(inferValueType(element)); // Assuming you have a method to infer the type based on ValueContext
            }
        }
    
        String generalizedType = generaliseTypes(elementTypes);
    
        return "ArrayList<" + generalizedType + ">";
    }
    
    public String inferValueType(PythonDictParser.ValueContext valueCtx) {
        // This method will determine the type based on the specific kind of value
        // For example, it could be a STRING_LITERAL, NUMERIC_LITERAL, etc.
        if (valueCtx.STRING_LITERAL() != null) {
            return "String";
        } else if (valueCtx.NUMERIC_LITERAL() != null) {
            return inferLiteralType(valueCtx.NUMERIC_LITERAL().getText());
        }
        // Add other conditions based on your grammar definitions
        return "unknown"; // Default return if none of the conditions match
    }
    
    public String generaliseTypes(Set<String> types)
    {
        if (types.contains("unknown"))
        {
            return "unknown";
        }
        if (types.size() == 1) {
            return types.iterator().next();  // If all types are the same, use that type
        }
        return "Object";  // If there are mixed types, generalize to Object
    }

    public String inferLiteralType(String literal) {
        if (literal.matches("-?\\d+")) return "Integer";    // Regex for integer
        if (literal.matches("-?\\d*\\.\\d+([eE][-+]?\\d+)?")) return "Float"; // Regex for floating-point
        if (literal.matches("\"([^\"\\\\]|\\\\.)*\"|'([^'\\\\]|\\\\.)*'")) {
            // This code will execute if the literal matches the regex for a string enclosed in either double or single quotes.
            return "String"; // Check for quotes for strings
        }
        
        if ("true".equalsIgnoreCase(literal) || "false".equalsIgnoreCase(literal)) return "boolean"; // Check for boolean values
    // Add more types as necessary
        // Add more types as necessary
        return "unknown";
    }    

    @Override
    public Void visitForLoop(PythonDictParser.ForLoopContext ctx) {
        // First, ensure the iterable is indeed iterable
        String loopVariable = ctx.IDENTIFIER().getText();
        int lineNumber = ctx.getStart().getLine();

        String iterableId = ctx.iterable().getText();
        Symbol iterableSymbol = SymbolTable.lookup(iterableId);

        if (iterableSymbol != null && !iterableSymbol.type.startsWith("HashMap")) 
        {
            System.err.println("Semantic Error: Non-iterable or non-existing identifier used in for-loop at line " + lineNumber);
            this.hasErrors = true;
            return null;
        }

       String keyType = extractKeyType(iterableSymbol.type);

       if (keyType == null)
       {
           System.err.println("Semantic Error: Unable to determine key type for hashmap");
           this.hasErrors = true;
       }

        // Enter scope for the loop
        enterScope();

        // Define the loop variable in the scope
        SymbolTable.define(loopVariable, keyType, lineNumber, true);

        // Visit all statements within the loop
        for (PythonDictParser.StatementContext statement : ctx.statement()) {
            visitStatement(statement);
        }

        // Exit the loop scope
        exitScope();
        return visitChildren(ctx);
    }
 
    public String extractKeyType(String hashMapType)
    {
        int start = hashMapType.indexOf("<") + 1;
        int comma = hashMapType.indexOf(",");

        if (start > 0 && comma > start) {
            return hashMapType.substring(start, comma).trim();
        }
        return null;

    }
    
    @Override
    public Void visitDictAccess(PythonDictParser.DictAccessContext ctx)
    {
        String dictId = ctx.IDENTIFIER().getText();
        int lineNumber = ctx.getStart().getLine();
        Symbol dictSymbol = SymbolTable.lookup(dictId);

        if (dictSymbol == null || !dictSymbol.type.startsWith("HashMap"))
        {
            System.err.println("Semantic Error: Non-existing or non-dictionary identifier used in dictionary access at line " + lineNumber);
            this.hasErrors = true;
            return null;
        }

        String keyType = extractKeyType(dictSymbol.type);
        if (keyType == null)
        {
            System.err.println("Semantic Error: Unable to determine key type for hashmap");
            this.hasErrors = true;
        }

        String key = ctx.expression().getText(); // no implementation of proper expression as of now so expression would contain key only
        //Symbol keySymbol = SymbolTable.lookup(key);
        String typeOfKey = inferLiteralType(key);

        if (typeOfKey == null || !typeOfKey.equals(keyType))
        {
            System.err.println("Semantic Error: Invalid key type used in dictionary access at line " + lineNumber);
            this.hasErrors = true;
        }

        return visitChildren(ctx);
    }
 
    @Override
    public Void visitExpression(PythonDictParser.ExpressionContext ctx) {
        String type = null; // This will hold the inferred type for logging or error handling purposes
    
        if (ctx.STRING_LITERAL() != null) {
            type = "string";
        } else if (ctx.NUMERIC_LITERAL() != null) {
            type = inferLiteralType(ctx.NUMERIC_LITERAL().getText());
        } else if (ctx.BOOLEAN_LITERAL() != null) {
            type = "boolean";
        } else if (ctx.IDENTIFIER() != null) {
            Symbol sym = SymbolTable.lookup(ctx.IDENTIFIER().getText());
            if (sym == null) {
               // error("Undefined identifier: " + ctx.IDENTIFIER().getText(), ctx);
            } else {
                type = sym.type; // Use this for any additional checks or logging
            }
        } else if (ctx.methodCall() != null) {
            visitMethodCall(ctx.methodCall());
        } else if (ctx.list() != null) {
            visitList(ctx.list());
        } else if (ctx.dict() != null) {
            visitDict(ctx.dict());
        } else if (ctx.dictAccess() != null) {
            visitDictAccess(ctx.dictAccess());
        } else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(") && ctx.getChild(2).getText().equals(")")) {
            visitExpression(ctx.expression(0));  // Handling parentheses
        } else {
            type = inferBinaryOperationType(ctx);
        }
    
        // Optionally log the type for debugging
        if (type != null) {
            System.out.println("Logs for debugging: Expression type at line " + ctx.getStart().getLine() + ": " + type);
        
        }
    
        return null; // Return null to satisfy the Void return type
    }
    
    private void visitBinaryOperation(PythonDictParser.ExpressionContext ctx) {
        String leftType = inferExpressionType(ctx.expression(0));
        String rightType = inferExpressionType(ctx.expression(1));
        String operator = ctx.getChild(1).getText();
    
        switch (operator) {
            case "*":
            case "/":
            case "+":
            case "-":
                if (!checkTypeCompatibility(leftType, rightType, operator)) {
                   // error("Type mismatch in expression: " + leftType + " " + operator + " " + rightType, ctx);
                }
               
                break;
            case "==":
            case "!=":
            case "<":
            case "<=":
            case ">":
            case ">=":
                if (!leftType.equals(rightType)) {
                    //error("Type mismatch in comparison: " + leftType + " " + operator + " " + rightType, ctx);
                }
                break;
            default:
                //error("Unknown operator: " + operator, ctx);
        }
    }

    private String inferExpressionType(PythonDictParser.ExpressionContext ctx) {

        if (ctx.STRING_LITERAL() != null) {
            return "string";
        } else if (ctx.NUMERIC_LITERAL() != null) {
            String literal = ctx.NUMERIC_LITERAL().getText();
            // Regex to differentiate between integer and floating-point numbers
            if (literal.matches("-?\\d+")) {
                return "integer";
            } else if (literal.matches("-?\\d*\\.\\d+([eE][-+]?\\d+)?")) {
                return "float";
            }
        } else if (ctx.BOOLEAN_LITERAL() != null) {
            return "boolean";
        } else if (ctx.IDENTIFIER() != null) {
            Symbol sym = SymbolTable.lookup(ctx.IDENTIFIER().getText());
            if (sym == null) {
                error("Undefined identifier: " + ctx.IDENTIFIER().getText(), ctx);
                this.hasErrors = true;
                return "unknown";  // Consider "unknown" as a type for unresolved symbols
            }
            return sym.type; // Return the type of the identifier from the symbol table
        } else if (ctx.methodCall() != null) {
            // This presumes a method that determines the type based on the method call
            //return determineMethodCallType(ctx.methodCall());
        } else if (ctx.list() != null) {
            return "list";  // Simplified for both lists and tuples; adjust as needed
        } else if (ctx.dict() != null) {
            return "HashMap"; // Assuming dictionaries are always mapped to some form of "HashMap"
        } else if (ctx.dictAccess() != null) {
            //return inferDictAccessType(ctx.dictAccess()); // Special handling to deduce type based on dictionary access
        } else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(") && ctx.getChild(2).getText().equals(")")) {
            return inferExpressionType(ctx.expression(0));  // Recursively infer type for expressions within parentheses
        } else if (ctx.getChildCount() == 3) { // Handling binary operations
            return inferBinaryOperationType(ctx);
        }
        return "unknown"; // Default case if none of the above
    }
    
    private String inferBinaryOperationType(PythonDictParser.ExpressionContext ctx) {
        String leftType = inferExpressionType(ctx.expression(0));
        String rightType = inferExpressionType(ctx.expression(1));
        String operator = ctx.getChild(1).getText();
    
        switch (operator) {
            case "*":
            case "/":
            case "+":
            case "-":
                if (!checkTypeCompatibility(leftType, rightType, operator)) {
                    error("Type mismatch in binary operation: " + leftType + " " + operator + " " + rightType, ctx);
                    this.hasErrors = true;
                    return "unknown";
                }
                if (operator.equals("+") && leftType.equals("String") && rightType.equals("String")) {
                    return "String";
                }
                
                return (leftType.equals("float") || rightType.equals("float")) ? "float" : "integer";
            default:
                return "unknown"; // If operator not recognized
        }
    }
    
    public boolean checkTypeCompatibility(String type1, String type2, String operation) {
        switch (operation) {
            case "+":
            case "-":
            case "*":
            case "/":
                if (("integer".equals(type1) && "integer".equals(type2)) || ("float".equals(type1) && "float".equals(type2))) {
                    return true;
                }
                // Allow string concatenation using +
                if ("+".equals(operation) && "String".equals(type1) && "String".equals(type2)) {
                    return true;
                }
                break;
            case "==":
            case "!=":
            case "<":
            case "<=":
            case ">":
            case ">=":
                // Comparisons can be more flexible depending on language specifics
                return type1.equals(type2);
        }
        return false;
    }
    
    @Override
    public Void visitDict(PythonDictParser.DictContext ctx)
    {
        Set<Object> keysSeen = new HashSet<>();
        
        for (PythonDictParser.PairContext pair : ctx.pairList().pair())
        {
            String key = "";
            if (pair.key() != null)
            {
                key = evaluateKey(pair.key())+ ":" + inferLiteralType(pair.key().getText());
                
                if (keysSeen.contains(key))
                {
                    System.err.println("Semantic Error: Duplicate key in dictionary at line " + ctx.getStart().getLine());
                    this.hasErrors = true;
                }
                else
                {
                    keysSeen.add(key);
                }
            }     
        }
        return visitChildren(ctx);
    }
    
    private Object evaluateKey(PythonDictParser.KeyContext ctx) {
        if (ctx.NUMERIC_LITERAL() != null) {
            return Integer.parseInt(ctx.getText());  // or Double, based on the format
        } else if (ctx.STRING_LITERAL() != null) {
            return ctx.getText().replace("\"", "").replace("\'", "");  // stripping quotes
        } else {
            return ctx.getText();  // simple text for identifier or other expressions
        }
    }

    @Override 
    public Void visitDictValueAssignToKey(PythonDictParser.DictValueAssignToKeyContext ctx) 
    { 
        //dictValueAssignToKey : IDENTIFIER BRACKET_OPEN key BRACKET_CLOSE ASSIGN value ;
        String name = ctx.IDENTIFIER().getText();
        String key = ctx.key().getText();
        String value = ctx.value().getText();
        Symbol s = SymbolTable.lookup(name);

        if (s == null || !s.type.startsWith("HashMap"))
        {
            System.err.println("Semantic Error: Non-existing or non-dictionary identifier used in dictionary access at line ");
            this.hasErrors = true;
            return null;
        }

        String keyTypeOfDict = extractKeyType(s.getType());
        String ValTypeOfDict = extractValueTypeFromHashMap(s.getType());

        String keyType = inferLiteralType(key);
        String valType = inferLiteralType(value);

        if (!keyType.equals(keyTypeOfDict))
        {
            System.err.println("Semantic Error: Incorrect Key type");
            this.hasErrors = true;
        }

        else if (!valType.equals(ValTypeOfDict))
        {
            System.err.println("Semantic Error: Incorrect Value type");
            this.hasErrors = true;
        }

        else if(keyType.equals(keyTypeOfDict) && valType.equals(ValTypeOfDict))
        {

        }


        return visitChildren(ctx); 
    }

    private void error(String message, ParserRuleContext ctx) {
        System.err.println("Error at line " + ctx.getStart().getLine() + ": " + message);
    }

    private String extractValueTypeFromHashMap(String type) {
        int commaPos = type.indexOf(',');
        int endPos = type.indexOf('>');
        if (commaPos != -1 && endPos != -1) {
            return type.substring(commaPos + 1, endPos).trim(); // Adjust based on actual string structure
        }
        return "Object"; // Fallback type
    }
 
    public void enterScope() {
        SymbolTable.enterScope();
    }

    public void exitScope() {
        SymbolTable.exitScope();
    }


     
    // You'll need to define or adjust `inferExpressionType` to work similarly to your original type return method,
    // but adjusted to fit within the new structure where no type string is returned from visit methods.
    
    
    
    // public void verifyLiteralExpression(String literal, String operation, String identifier, int lineNumber) {
    //     String type = inferLiteralType(literal);
    //     Symbol sym = symbolTable.lookup(identifier);
    //     if (sym == null) {
    //         System.err.println("Error: Variable '" + identifier + "' used before declaration at line " + lineNumber);
    //         return;
    //     }
    
    //     if (!checkTypeCompatibility(sym.type, type, operation)) {
    //         System.err.println("Type Error: Incompatible types for operation '" + operation + "' between " + sym.type + " and " + type + " at line " + lineNumber);
    //     } else {
    //         System.out.println("Valid operation between " + sym.type + " and " + type);
    //     }
    // }
    
    

    




    // public void verifyExpression(String identifier1, String identifier2, String operation, int lineNumber) {
    //     Symbol sym1 = symbolTable.lookup(identifier1);
    //     Symbol sym2 = symbolTable.lookup(identifier2);

    //     if (sym1 == null || sym2 == null) {
    //         System.err.println("Error: One or more variables used before declaration at line " + lineNumber);
    //         return;
    //     }

    //     String resultType = inferExpressionType(sym1.type, sym2.type, operation);
    //     if ("unknown".equals(resultType)) {
    //         System.err.println("Type Error: Incompatible types for operation '" + operation + "' at line " + lineNumber);
    //     } else {
    //         System.out.println("Operation result type: " + resultType);
    //     }
    // }

    // public void verifyOperation(String identifier, String type2, String operation, int lineNumber) {
    //     Symbol sym = symbolTable.lookup(identifier);
    //     if (sym == null) {
    //         System.err.println("Error: Variable '" + identifier + "' used before declaration at line " + lineNumber);
    //         return;
    //     }

    //     if (!checkTypeCompatibility(sym.type, type2, operation)) {
    //         System.err.println("Type Error: Incompatible types for operation '" + operation + "' between " + sym.type + " and " + type2 + " at line " + lineNumber);
    //     }
    // }

    // public void verifyCondition(String identifier, int lineNumber) {
    //     Symbol sym = symbolTable.lookup(identifier);
    //     if (sym == null) {
    //         System.err.println("Error: Variable '" + identifier + "' used in condition before declaration at line " + lineNumber);
    //         return;
    //     }

    //     if (!"boolean".equals(sym.type)) {
    //         System.err.println("Type Error: Condition expression not boolean at line " + lineNumber);
    //     }
    // }

    // public void visitIfStatement(String conditionIdentifier, int lineNumber) {
    //     // Lookup the condition variable to ensure it is declared and is a boolean
    //     Symbol conditionSymbol = symbolTable.lookup(conditionIdentifier);
    //     if (conditionSymbol == null) {
    //         System.err.println("Error: Condition variable '" + conditionIdentifier + "' used before declaration at line " + lineNumber);
    //         return;
    //     }

    //     if (!"boolean".equals(conditionSymbol.type)) {
    //         System.err.println("Type Error: Condition expression not boolean at line " + lineNumber);
    //     }

    //     // Assuming entering the 'if' block
    //     enterScope();
    // }


    // public void visitForLoop(String loopVariable, String startValue, String endValue, int lineNumber) {
    //     // First, check if the start and end values are integers
    //     if (!"integer".equals(inferLiteralType(startValue)) || !"integer".equals(inferLiteralType(endValue))) {
    //         System.err.println("Type Error: Start and end values of the loop must be integers at line " + lineNumber);
    //         return;
    //     }
    
    //     // Enter new scope for the loop
    //     enterScope();
    
    //     // Define the loop variable in the new scope with type 'integer'
    //     // Assuming loop variables are declared implicitly by the loop statement
    //     symbolTable.define(loopVariable, "integer", lineNumber);
    
    //     // Assuming `exitScope()` will be called when exiting the loop block
    //     // This would typically be called from the part of the code that manages the loop body
    // }

//     @Override
// public Void visitIfCondition(PythonDictParser.IfConditionContext ctx) {
//     // Visit the if-elif-else blocks
//     return visitIfElifBlocks(ctx.ifElifBlocks());
// }

// @Override
// public Void visitIfElifBlocks(PythonDictParser.IfElifBlocksContext ctx) {
//     // First, evaluate the condition (ensuring it's a boolean expression)
//     String conditionResultType = visitExpression(ctx.condition().expression(0));
//     if (!"boolean".equals(conditionResultType)) {
//         System.err.println("Type Error: Condition expression not boolean at line " + ctx.getStart().getLine());
//     }

    // Enter scope for the block
//     enterScope();

//     // Visit all statements within the current block
//     for (PythonDictParser.StatementContext statement : ctx.statement()) {
//         visitStatement(statement);
//     }

//     // Exit the current scope
//     exitScope();

//     // Handle elif and else parts similarly
//     if (ctx.elifPart() != null) {
//         visitIfElifBlocks(ctx.elifPart());
//     }
//     if (ctx.elsePart() != null) {
//         visit(ctx.elsePart());
//     }

//     return null; // Void return type for visitor methods that do not produce a value
// }

  


//     @Override
// public Void visitForLoop(PythonDictParser.ForLoopContext ctx) {
//     // First, ensure the iterable is indeed iterable
//     String iterableType = visitIterable(ctx.iterable());
//     if (!iterableType.equals("list") && !iterableType.equals("tuple") && !iterableType.equals("dict")) {
//         System.err.println("Type Error: Non-iterable used in for loop at line " + ctx.getStart().getLine());
//     }

//     // Enter scope for the loop
//     enterScope();

//     // Define the loop variable in the scope
//     String loopVariable = ctx.IDENTIFIER().getText();
//     symbolTable.define(loopVariable, "integer", ctx.getStart().getLine());

//     // Visit all statements within the loop
//     for (PythonDictParser.StatementContext statement : ctx.statement()) {
//         visitStatement(statement);
//     }

//     // Exit the loop scope
//     exitScope();

//     return null;
// }

    
    public void exitForLoop() {
        // Exiting the scope of the for loop
        exitScope();
    }

}
