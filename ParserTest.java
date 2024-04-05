import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserTest {
    public static void main(String[] args) throws Exception {
        // Assuming you have a string input for testing

        // dict = {1 : 2, 3: 4, 5: 6, 7 : 8}; dict[9] = 10; lA = [1, 2, 3, 4, 5, 6, 7]; ltup = (1, 2, 3);
        //_ = 1; dict = {1 : 2, 3: 4, 5: 6, 7 : 8}; dict[9] = 10; lA = [1, 2, 3, 4, 5, 6, 7]; ltup = (1, 2, 3); for item in [1, 2, 3, 4, 5] {v = 2}; a.keys(); b = [1, 2, (3, 4), 9]; dict = {Person(9) : Alice(1, 2, 3)};  var = Khabees('Billan', [1, {1 : 4}]);  
        String input = "if (2 == 3){a = 2}elif (2!=4) {b = 4};";
        CharStream charStream = CharStreams.fromString(input);

        // Create a lexer that feeds off of the input CharStream
        PythonDictLexer lexer = new PythonDictLexer(charStream);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        PythonDictParser parser = new PythonDictParser(tokens);

        // Begin parsing at the 'dict' rule (the entry point of your parser grammar)
        ParseTree tree = parser.program();

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
