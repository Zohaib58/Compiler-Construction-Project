import java.util.*;

public class SymbolTable {
    private static Stack<Map<String, Symbol>> scopeStack = new Stack<>();
    private static int currentScopeLevel = 0; // Tracks the current scope level

    // Static variable instance of type SymbolTable
    private static SymbolTable instance = null;

    // Private constructor to restrict instantiation from other classes
    private SymbolTable() {
        enterScope(); // Initialize the global scope
    }

    // Global access point to get the instance of the SymbolTable
    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable(); // Create new instance if none exists
        }
        return instance;
    }

    public static void enterScope() {
        scopeStack.push(new HashMap<>());
        currentScopeLevel++;
    }

    public static void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
            currentScopeLevel--;
        }
    }

    public static void define(String name, String type, int lineNumber, boolean isDeclare) {
        Map<String, Symbol> currentScope = scopeStack.peek();
        if (currentScope.containsKey(name)) {
            System.err.println("Redefinition of symbol '" + name);
        } else {
            Symbol sym = new Symbol(name, type, currentScopeLevel, lineNumber, isDeclare);
            currentScope.put(name, sym);
        }
    }

    public static Symbol lookup(String name) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            if (scopeStack.get(i).containsKey(name)) {
                return scopeStack.get(i).get(name);
            }
        }
        System.err.println("Symbol '" + name + "' not defined yet.");
        return null;
    }
    
    private static void handleError(String message) {
        System.err.println(message);
    } 


    // Method to set isDeclare to true for all symbols in all scopes
    public static void setDeclareForAllSymbols() {
        for (Map<String, Symbol> scope : scopeStack) {
            for (Symbol symbol : scope.values()) {
                symbol.setIsDeclare(false);
            }
        }
    }

    // Method to set isDeclare to true for all symbols in all scopes
    public static void setDeclareTrueSymbol(Symbol symbol) {
        if (symbol != null)
        {
            symbol.setIsDeclare(true);
        }

        else {
            System.out.println("Null symbol ref provided");
        }
    }
}
