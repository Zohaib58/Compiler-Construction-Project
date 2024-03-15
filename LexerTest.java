import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class LexerTest {
    public static void main(String[] args) throws Exception {
        CharStream cs = CharStreams.fromFileName("PythonDict.py");
        PythonDictLexer lexer = new PythonDictLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        for (Token token : tokens.getTokens()) {
            System.out.println(token.toString());
        }
    }
}
