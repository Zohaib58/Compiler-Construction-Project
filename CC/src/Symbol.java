import java.util.*;

class Symbol {
    String name;
    String type;
    int scopeLevel; // Added to track the scope level of the symbol
    int lineNumber; // Added to track the line number where the symbol is declared

    public Symbol(String name, String type, int scopeLevel, int lineNumber) {
        this.name = name;
        this.type = type;
        this.scopeLevel = scopeLevel;
        this.lineNumber = lineNumber;
    }

    // Consider adding getters for new fields if needed
}

class TypeChecker {
    // Basic type compatibility check for assignment; this could be expanded for other operations.
    public static boolean isCompatibleForAssignment(String leftType, String rightType) {
        if (leftType.equals(rightType)) {
            return true; // Same types are always compatible
        }
        // Add more rules as needed
        return false;
    }
}


class SymbolTable {
    private Stack<Map<String, Symbol>> scopeStack = new Stack<>();
    private int currentScopeLevel = 0; // Added to keep track of the current scope level

    public SymbolTable() {
        enterScope(); // Initialize the global scope
    }

    public void enterScope() {
        scopeStack.push(new HashMap<>());
        currentScopeLevel++;
    }

    public void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
            currentScopeLevel--;
        }
    }

    public void define(String name, String type, int lineNumber) {
        Map<String, Symbol> currentScope = scopeStack.peek();
        if (currentScope.containsKey(name)) {
            System.err.println("Error: Redefinition of symbol '" + name + "' at line " + lineNumber);
        } else {
            Symbol sym = new Symbol(name, type, currentScopeLevel, lineNumber);
            currentScope.put(name, sym);
        }
    }

    public Symbol lookup(String name) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            if (scopeStack.get(i).containsKey(name)) {
                return scopeStack.get(i).get(name);
            }
        }
        System.err.println("Error: Symbol '" + name + "' not found.");
        return null;
    }
    
    // Implementing method to handle errors (e.g., undeclared symbols, redefinitions)
    private void handleError(String message) {
        System.err.println(message);
    }

    // New method to check the type of an assignment operation
    public void checkAssignment(String variableName, String expressionType, int lineNumber) {
        Symbol varSymbol = lookup(variableName);
        if (varSymbol == null) {
            System.err.println("Error: Undefined variable '" + variableName + "' at line " + lineNumber);
            return;
        }

        if (!TypeChecker.isCompatibleForAssignment(varSymbol.type, expressionType)) {
            System.err.println("Type Error: Cannot assign " + expressionType + " to " + varSymbol.type + " for variable '" + variableName + "' at line " + lineNumber);
        } else {
            System.out.println("Type Check Passed: " + variableName + " = <expression> at line " + lineNumber);
        }
    }
}
