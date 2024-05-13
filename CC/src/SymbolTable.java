import java.util.*;

public class SymbolTable {
    private static Stack<Map<String, Symbol>> scopeStack = new Stack<>();
    private static int currentScopeLevel = 0; // Added to keep track of the current scope level

    public SymbolTable() {
        enterScope(); // Initialize the global scope
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
            System.err.println("Error: Redefinition of symbol '" + name + "' at line " + lineNumber);
        } else {
            Symbol sym = new Symbol(name, type, currentScopeLevel, lineNumber, isDeclare);
            currentScope.put(name, sym);
            System.out.println("abc");
        }
    }

    public static Symbol lookup(String name) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            if (scopeStack.get(i).containsKey(name)) {
                return scopeStack.get(i).get(name);
            }
        }
        //System.err.println("Error: Symbol '" + name + "' not found.");
        return null;
    }
    
    // Implementing method to handle errors (e.g., undeclared symbols, redefinitions)
    private static void handleError(String message) {
        System.err.println(message);
    } 
}
