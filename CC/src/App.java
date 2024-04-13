public class App {
        public static void main(String[] args) {
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
    
            // Entering global scope
            analyzer.enterScope();
    
            // Declare some variables
            analyzer.visitVariableDeclaration("x", "integer", 1);
            analyzer.visitVariableDeclaration("y", "float", 2);
            analyzer.visitVariableDeclaration("flag", "boolean", 3);
    
            // Perform a valid operation
            analyzer.verifyExpression("x", "y", "+", 4);  // Assuming implicit conversion is allowed in language design
    
            // Perform an invalid operation
            analyzer.verifyOperation("x", "string", "+", 5);  // Error: incompatible types
    
            // Check a valid condition
            analyzer.verifyCondition("flag", 6);
    
            // Check an invalid condition
            analyzer.verifyCondition("x", 7);  // Error: non-boolean in condition
    
            // Exiting scope
            analyzer.exitScope();
        }
    
    
}
