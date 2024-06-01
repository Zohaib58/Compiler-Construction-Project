import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Paths;

public class ParserTest {
    public static void main(String[] args) throws Exception {
        
        // Hardcode the file path relative to the current working directory
       // String filePath = "test/putValueInEmptyDic.txt";      //Semantic Error
       //String filePath = "test/emptyFile.txt";                //Semantic Error
       //String filePath = "test/putValueInEmptyList.txt";      //Semantic Error
       //String filePath = "test/isUsed.txt";                   //Exception
       //String filePath = "test/ListInsideDictByName.txt";     //Semantic Error
       //String filePath = "test/constructor.txt";              //Code Wrong Generation
       //String filePath = "test/commentsBetweenLine.txt";      //Semantic Error
       //String filePath = "test/commentsStartEnd.txt";         //Code Gen Error, wrong positioning





        String filePath = "test/variableConstructor.txt"; // Assuming test.txt is in the same directory
        //String filePath = "test/ifElifElse.txt";

        //String filePath = "test/dictionaryMaking.txt";
        //String filePath = "test/emptyList.txt";
        
        //String filePath = "test/ifElifElse.txt";


       //String filePath = "test/dictMethods.txt";

       //String filePath = "test/dictMethods.txt";
       //String filePath = "test/arrayMaking.txt";
       //String filePath = "test/dictionaryMaking.txt";
        //String filePath =  "test/recursiveCheck.txt";
        //String filePath = "test/visitVariableDict&Array.txt";

       //String filePath = "test/arrInsideDict.txt";
       //String filePath = "test/constructor.txt";

        // Create a CharStream that reads from the file
        CharStream charStream = CharStreams.fromPath(Paths.get(filePath));

        // Create a lexer that feeds off of the input CharStream
        PythonDictLexer lexer = new PythonDictLexer(charStream);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        PythonDictParser parser = new PythonDictParser(tokens);

        // Begin parsing at the 'program' rule (the entry point of your parser grammar)
        ParseTree tree = parser.program();

        // Check for syntax errors
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Syntax errors found, compilation stopped.");
            return; // Exit if there are syntax errors
        }

        System.out.println(tree.toStringTree(parser)); // Optionally print the parse tree

        // Instantiate your SemanticAnalyzer
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();

        // Visit the tree using the semantic analyzer to perform semantic checks
        semanticAnalyzer.visit(tree);

        if (semanticAnalyzer.hasErrors()) {
            System.out.println("Semantic errors detected, stopping compilation.");
            return; // Stop further processing if errors exist
        }

        // If no errors, proceed with code generation
        CodeGenerator codeGenerator = new CodeGenerator();
        String generatedCode = codeGenerator.visit(tree);

        // Output or save the generated code
        System.out.println();
        System.out.println("Generated Code:");
        System.out.println(generatedCode);
    }
}
