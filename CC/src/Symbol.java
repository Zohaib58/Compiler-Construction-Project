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
}
