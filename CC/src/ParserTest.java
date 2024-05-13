import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class  
ParserTest {
    public static void main(String[] args) throws Exception {
        // Assuming you have a string input for testing
        String input = "List = ['Volvo', 'BMW', 'Ford', 'Mazda']";
        CharStream charStream = CharStreams.fromString(input);

        // Create a lexer that feeds off of the input CharStream
        PythonDictLexer lexer = new PythonDictLexer(charStream);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        PythonDictParser parser = new PythonDictParser(tokens);

        // Begin parsing at the 'program' rule (the entry point of your parser grammar)
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));
        // Instantiate your SemanticAnalyzer
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();

        // Visit the tree using the semantic analyzer to perform semantic checks

        semanticAnalyzer.visit(tree);

        if (semanticAnalyzer.hasErrors()) {
            System.out.println("Semantic errors detected, stopping compilation.");
            return;  // Stop further processing if errors exist
        }

        // If no errors, proceed with code generation
        CodeGenerator codeGenerator = new CodeGenerator();
        String generatedCode = codeGenerator.visit(tree);
        
        // Output or save the generated code
        System.out.println("Generated Code:");
        System.out.println(generatedCode);
    }
}

