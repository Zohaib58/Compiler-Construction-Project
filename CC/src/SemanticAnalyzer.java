class SemanticAnalyzer {
    private SymbolTable symbolTable;

    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
    }

    public void visitVariableDeclaration(String name, String value, int lineNumber) {
        String type = inferLiteralType(value);
        symbolTable.define(name, type, lineNumber);
    }
    

    public String inferLiteralType(String literal) {
        if (literal.matches("-?\\d+")) return "integer";    // Regex for integer
        if (literal.matches("-?\\d*\\.\\d+([eE][-+]?\\d+)?")) return "float"; // Regex for floating-point
        if (literal.startsWith("\"") && literal.endsWith("\"")) return "string"; // Check for quotes for strings
        if ("true".equalsIgnoreCase(literal) || "false".equalsIgnoreCase(literal)) return "boolean"; // Check for boolean values
    // Add more types as necessary
        // Add more types as necessary
        return "unknown";
    }    

    public void verifyLiteralExpression(String literal, String operation, int lineNumber) {
        String type = inferLiteralType(literal);
    
        // Let's say we're doing an operation with a known variable
        String identifier = "x"; // Example variable
        Symbol sym = symbolTable.lookup(identifier);
        if (sym == null) {
            System.err.println("Error: Variable '" + identifier + "' used before declaration at line " + lineNumber);
            return;
        }
    
        if (!checkTypeCompatibility(sym.type, type, operation)) {
            System.err.println("Type Error: Incompatible types for operation '" + operation + "' between " + sym.type + " and " + type + " at line " + lineNumber);
        } else {
            System.out.println("Valid operation between " + sym.type + " and " + type);
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
                if ("+".equals(operation) && "string".equals(type1) && "string".equals(type2)) {
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

    public String inferExpressionType(String operand1, String operand2, String operation) {
        
        switch (operation) {
            case "+":
                if ("integer".equals(operand1) && "integer".equals(operand2)) {
                    return "integer";
                } else if ("float".equals(operand1) || "float".equals(operand2)) {
                    return "float";
                } else if ("string".equals(operand1) && "string".equals(operand2)) {
                    return "string";
                }
                break;
            case "-":
            case "*":
            case "/":
                if ("integer".equals(operand1) && "integer".equals(operand2)) {
                    return "integer";
                } else if ("float".equals(operand1) || "float".equals(operand2)) {
                    return "float";
                }
                break;
        }
        return "unknown"; // or throw an exception or similar error handling
    }


    public void verifyExpression(String identifier1, String identifier2, String operation, int lineNumber) {
        Symbol sym1 = symbolTable.lookup(identifier1);
        Symbol sym2 = symbolTable.lookup(identifier2);

        if (sym1 == null || sym2 == null) {
            System.err.println("Error: One or more variables used before declaration at line " + lineNumber);
            return;
        }

        String resultType = inferExpressionType(sym1.type, sym2.type, operation);
        if ("unknown".equals(resultType)) {
            System.err.println("Type Error: Incompatible types for operation '" + operation + "' at line " + lineNumber);
        } else {
            System.out.println("Operation result type: " + resultType);
        }
    }

    public void verifyOperation(String identifier, String type2, String operation, int lineNumber) {
        Symbol sym = symbolTable.lookup(identifier);
        if (sym == null) {
            System.err.println("Error: Variable '" + identifier + "' used before declaration at line " + lineNumber);
            return;
        }

        if (!checkTypeCompatibility(sym.type, type2, operation)) {
            System.err.println("Type Error: Incompatible types for operation '" + operation + "' between " + sym.type + " and " + type2 + " at line " + lineNumber);
        }
    }

    public void verifyCondition(String identifier, int lineNumber) {
        Symbol sym = symbolTable.lookup(identifier);
        if (sym == null) {
            System.err.println("Error: Variable '" + identifier + "' used in condition before declaration at line " + lineNumber);
            return;
        }

        if (!"boolean".equals(sym.type)) {
            System.err.println("Type Error: Condition expression not boolean at line " + lineNumber);
        }
    }

    public void enterScope() {
        symbolTable.enterScope();
    }

    public void exitScope() {
        symbolTable.exitScope();
    }
}
