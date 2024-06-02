import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParserTest {
    public static void main(String[] args) throws Exception {

        
        
        //String filePath = "test/commentsStartEnd.txt"; // Assuming test.txt is in the same directory
        String filePath = "test/isUsed.txt";

        CharStream charStream = CharStreams.fromPath(Paths.get(filePath));
        PythonDictLexer lexer = new PythonDictLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonDictParser parser = new PythonDictParser(tokens);

        ParseTree tree = parser.program();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Syntax errors found, compilation stopped.");
            return;
        }

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        semanticAnalyzer.visit(tree);
        if (semanticAnalyzer.hasErrors()) {
            System.out.println("Semantic errors detected, stopping compilation.");
            return;
        }

        CodeGenerator codeGenerator = new CodeGenerator();
        String generatedCode = codeGenerator.visit(tree);

        // Construct the output filename based on the input file name and the current timestamp
        String baseName = filePath.substring(filePath.lastIndexOf('/') + 1, filePath.lastIndexOf('.'));
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String outputFileName = "output/output_" + baseName + "_" + dateTime + ".txt";

        // Output the generated code to a file
        writeToFile(generatedCode, outputFileName);
    }

    // Helper method to write a string to a file
    private static void writeToFile(String content, String pathStr) {
        Path path = Paths.get(pathStr);
        try {
            // Ensure the directory exists
            Path directory = path.getParent();
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }

            // Write content to file
            Files.writeString(path, content);
            System.out.println("Generated code written to " + pathStr);
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }
    }
}

