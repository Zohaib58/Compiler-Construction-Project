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
            Symbol sym = new Symbol(name, type, currentScopeLevel, lineNumber, isDeclare, false);
            currentScope.put(name, sym);
        }
    }

    public static Symbol lookup(String name) {
        Symbol s =  null;
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            if (scopeStack.get(i).containsKey(name)) {
                s = scopeStack.get(i).get(name);
                if (s.isDeclare & !s.isUsed)
                {
                    s.setIsUSed();
                }
                return s;
            }
        }
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
        public static void checkIsUsed() {
            for (Map<String, Symbol> scope : scopeStack) {
                for (Symbol symbol : scope.values()) {
                    System.out.println(symbol.getName() + ": " + symbol.getIsUsed());
                }
            }
        }

    
        public static void removeUnusedSymbols() {
            for (Map<String, Symbol> scope : scopeStack) {
                Iterator<Map.Entry<String, Symbol>> it = scope.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Symbol> entry = it.next();
                    if (!entry.getValue().getIsUsed()) {
                        it.remove(); // Safely remove the entry using iterator
                    }
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
