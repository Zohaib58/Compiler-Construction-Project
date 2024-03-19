import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserTest {
    public static void main(String[] args) throws Exception {
        // Assuming you have a string input for testing
        String input = "{[]}";
        CharStream charStream = CharStreams.fromString(input);

        // Create a lexer that feeds off of the input CharStream
        PythonDictLexer lexer = new PythonDictLexer(charStream);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        PythonDictParser parser = new PythonDictParser(tokens);

        // Begin parsing at the 'dict' rule (the entry point of your parser grammar)
        ParseTree tree = parser.dict();

        // Print LISP-style tree
        System.out.println(tree.toStringTree(parser));

        // Alternatively, if you want to visualize the tree in a GUI
        // Uncomment the following lines:
        // JFrame frame = new JFrame("Parse Tree");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.add(new JScrollPane(new JTree(tree)));
        // frame.pack();
        // frame.setVisible(true);
    }
}
