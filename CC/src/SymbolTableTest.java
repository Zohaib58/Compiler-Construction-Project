public class SymbolTableTest {

    public static void main(String[] args) {
        testVariableDeclarationAndLookup();
        testScopeManagement();
        // Add more test methods as needed
    }

    public static void testVariableDeclarationAndLookup() {
        SymbolTable symbolTable = new SymbolTable();

        System.out.println("Test: Variable Declaration and Lookup");
        
        symbolTable.define("x", "int", 1); // Define variable 'x' of type 'int' at line 1
        Symbol x = symbolTable.lookup("x");
        
        if (x != null && "int".equals(x.type)) {
            System.out.println("Success: Variable 'x' found with type 'int'.");
        } else {
            System.out.println("Error: Variable 'x' not found or incorrect type.");
        }
    }

    public static void testScopeManagement() {
        SymbolTable symbolTable = new SymbolTable();
        
        System.out.println("Test: Scope Management");
        
        // Global scope
        symbolTable.define("x", "int", 1); // Global 'x'
        
        // Enter new scope
        symbolTable.enterScope();
        symbolTable.define("x", "string", 2); // Local 'x' shadows global 'x'
        
        Symbol x = symbolTable.lookup("x");
        if ("string".equals(x.type)) {
            System.out.println("Success: Local variable 'x' found with type 'string'.");
        } else {
            System.out.println("Error: Incorrect handling of scope.");
        }
        
        // Exit scope, should revert to global 'x'
        symbolTable.exitScope();
        x = symbolTable.lookup("x");
        if ("int".equals(x.type)) {
            System.out.println("Success: Back to global variable 'x' with type 'int'.");
        } else {
            System.out.println("Error: Incorrect scope management.");
        }
    }
}
