// Generated from PythonDictLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonDictLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BRACE_OPEN=1, BRACE_CLOSE=2, BRACKET_OPEN=3, BRACKET_CLOSE=4, PAREN_OPEN=5, 
		PAREN_CLOSE=6, ASSIGN=7, IN=8, COLON=9, COMMA=10, DOT=11, SEMICOLON=12, 
		FOR=13, IF=14, ELSE=15, ELIF=16, ADD=17, SUBTRACT=18, DIVIDE=19, MULTIPLY=20, 
		EQUALS_TO=21, NOT_EQUALS_TO=22, LESS_THAN=23, LESS_THAN_EQUALS_TO=24, 
		GREATER_THAN=25, GREATER_THAN_EQUALS_TO=26, GET_METHOD=27, KEYS_METHOD=28, 
		VALUES_METHOD=29, ITEMS_METHOD=30, POP_METHOD=31, UPDATE_METHOD=32, PRINT=33, 
		IDENTIFIER=34, STRING_LITERAL=35, NUMERIC_LITERAL=36, BOOLEAN_LITERAL=37, 
		WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "PAREN_OPEN", 
			"PAREN_CLOSE", "ASSIGN", "IN", "COLON", "COMMA", "DOT", "SEMICOLON", 
			"FOR", "IF", "ELSE", "ELIF", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", 
			"EQUALS_TO", "NOT_EQUALS_TO", "LESS_THAN", "LESS_THAN_EQUALS_TO", "GREATER_THAN", 
			"GREATER_THAN_EQUALS_TO", "GET_METHOD", "KEYS_METHOD", "VALUES_METHOD", 
			"ITEMS_METHOD", "POP_METHOD", "UPDATE_METHOD", "PRINT", "IDENTIFIER", 
			"STRING_LITERAL", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'in'", "':'", 
			"','", "'.'", "';'", "'for'", "'if'", "'else'", "'elif'", "'+'", "'-'", 
			"'/'", "'*'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'get'", 
			"'keys'", "'values'", "'items'", "'pop'", "'update'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "PAREN_OPEN", 
			"PAREN_CLOSE", "ASSIGN", "IN", "COLON", "COMMA", "DOT", "SEMICOLON", 
			"FOR", "IF", "ELSE", "ELIF", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", 
			"EQUALS_TO", "NOT_EQUALS_TO", "LESS_THAN", "LESS_THAN_EQUALS_TO", "GREATER_THAN", 
			"GREATER_THAN_EQUALS_TO", "GET_METHOD", "KEYS_METHOD", "VALUES_METHOD", 
			"ITEMS_METHOD", "POP_METHOD", "UPDATE_METHOD", "PRINT", "IDENTIFIER", 
			"STRING_LITERAL", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PythonDictLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonDictLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000&\u00f2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001!\u0001!\u0005!\u00b9\b!\n!\f!\u00bc\t!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u00c2\b\"\n\"\f\"\u00c5\t\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u00cc\b\"\n\"\f\"\u00cf\t\"\u0001"+
		"\"\u0003\"\u00d2\b\"\u0001#\u0004#\u00d5\b#\u000b#\f#\u00d6\u0001#\u0001"+
		"#\u0004#\u00db\b#\u000b#\f#\u00dc\u0003#\u00df\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u00ea\b$\u0001%\u0004"+
		"%\u00ed\b%\u000b%\f%\u00ee\u0001%\u0001%\u0000\u0000&\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&\u0001\u0000\u0006\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\"+
		"\\\u0001\u000009\u0003\u0000\t\n\r\r  \u00fc\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0001M"+
		"\u0001\u0000\u0000\u0000\u0003O\u0001\u0000\u0000\u0000\u0005Q\u0001\u0000"+
		"\u0000\u0000\u0007S\u0001\u0000\u0000\u0000\tU\u0001\u0000\u0000\u0000"+
		"\u000bW\u0001\u0000\u0000\u0000\rY\u0001\u0000\u0000\u0000\u000f[\u0001"+
		"\u0000\u0000\u0000\u0011^\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000"+
		"\u0000\u0015b\u0001\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019"+
		"f\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dm\u0001"+
		"\u0000\u0000\u0000\u001fr\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000"+
		"\u0000#y\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000\u0000\'}\u0001\u0000"+
		"\u0000\u0000)\u007f\u0001\u0000\u0000\u0000+\u0082\u0001\u0000\u0000\u0000"+
		"-\u0085\u0001\u0000\u0000\u0000/\u0087\u0001\u0000\u0000\u00001\u008a"+
		"\u0001\u0000\u0000\u00003\u008c\u0001\u0000\u0000\u00005\u008f\u0001\u0000"+
		"\u0000\u00007\u0093\u0001\u0000\u0000\u00009\u0098\u0001\u0000\u0000\u0000"+
		";\u009f\u0001\u0000\u0000\u0000=\u00a5\u0001\u0000\u0000\u0000?\u00a9"+
		"\u0001\u0000\u0000\u0000A\u00b0\u0001\u0000\u0000\u0000C\u00b6\u0001\u0000"+
		"\u0000\u0000E\u00d1\u0001\u0000\u0000\u0000G\u00d4\u0001\u0000\u0000\u0000"+
		"I\u00e9\u0001\u0000\u0000\u0000K\u00ec\u0001\u0000\u0000\u0000MN\u0005"+
		"{\u0000\u0000N\u0002\u0001\u0000\u0000\u0000OP\u0005}\u0000\u0000P\u0004"+
		"\u0001\u0000\u0000\u0000QR\u0005[\u0000\u0000R\u0006\u0001\u0000\u0000"+
		"\u0000ST\u0005]\u0000\u0000T\b\u0001\u0000\u0000\u0000UV\u0005(\u0000"+
		"\u0000V\n\u0001\u0000\u0000\u0000WX\u0005)\u0000\u0000X\f\u0001\u0000"+
		"\u0000\u0000YZ\u0005=\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005"+
		"i\u0000\u0000\\]\u0005n\u0000\u0000]\u0010\u0001\u0000\u0000\u0000^_\u0005"+
		":\u0000\u0000_\u0012\u0001\u0000\u0000\u0000`a\u0005,\u0000\u0000a\u0014"+
		"\u0001\u0000\u0000\u0000bc\u0005.\u0000\u0000c\u0016\u0001\u0000\u0000"+
		"\u0000de\u0005;\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0005f\u0000"+
		"\u0000gh\u0005o\u0000\u0000hi\u0005r\u0000\u0000i\u001a\u0001\u0000\u0000"+
		"\u0000jk\u0005i\u0000\u0000kl\u0005f\u0000\u0000l\u001c\u0001\u0000\u0000"+
		"\u0000mn\u0005e\u0000\u0000no\u0005l\u0000\u0000op\u0005s\u0000\u0000"+
		"pq\u0005e\u0000\u0000q\u001e\u0001\u0000\u0000\u0000rs\u0005e\u0000\u0000"+
		"st\u0005l\u0000\u0000tu\u0005i\u0000\u0000uv\u0005f\u0000\u0000v \u0001"+
		"\u0000\u0000\u0000wx\u0005+\u0000\u0000x\"\u0001\u0000\u0000\u0000yz\u0005"+
		"-\u0000\u0000z$\u0001\u0000\u0000\u0000{|\u0005/\u0000\u0000|&\u0001\u0000"+
		"\u0000\u0000}~\u0005*\u0000\u0000~(\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005=\u0000\u0000\u0080\u0081\u0005=\u0000\u0000\u0081*\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005!\u0000\u0000\u0083\u0084\u0005=\u0000\u0000"+
		"\u0084,\u0001\u0000\u0000\u0000\u0085\u0086\u0005<\u0000\u0000\u0086."+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u0089\u0005"+
		"=\u0000\u0000\u00890\u0001\u0000\u0000\u0000\u008a\u008b\u0005>\u0000"+
		"\u0000\u008b2\u0001\u0000\u0000\u0000\u008c\u008d\u0005>\u0000\u0000\u008d"+
		"\u008e\u0005=\u0000\u0000\u008e4\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"g\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005t\u0000"+
		"\u0000\u00926\u0001\u0000\u0000\u0000\u0093\u0094\u0005k\u0000\u0000\u0094"+
		"\u0095\u0005e\u0000\u0000\u0095\u0096\u0005y\u0000\u0000\u0096\u0097\u0005"+
		"s\u0000\u0000\u00978\u0001\u0000\u0000\u0000\u0098\u0099\u0005v\u0000"+
		"\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005l\u0000\u0000\u009b"+
		"\u009c\u0005u\u0000\u0000\u009c\u009d\u0005e\u0000\u0000\u009d\u009e\u0005"+
		"s\u0000\u0000\u009e:\u0001\u0000\u0000\u0000\u009f\u00a0\u0005i\u0000"+
		"\u0000\u00a0\u00a1\u0005t\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2"+
		"\u00a3\u0005m\u0000\u0000\u00a3\u00a4\u0005s\u0000\u0000\u00a4<\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005p\u0000\u0000\u00a6\u00a7\u0005o\u0000"+
		"\u0000\u00a7\u00a8\u0005p\u0000\u0000\u00a8>\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005u\u0000\u0000\u00aa\u00ab\u0005p\u0000\u0000\u00ab\u00ac\u0005"+
		"d\u0000\u0000\u00ac\u00ad\u0005a\u0000\u0000\u00ad\u00ae\u0005t\u0000"+
		"\u0000\u00ae\u00af\u0005e\u0000\u0000\u00af@\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005p\u0000\u0000\u00b1\u00b2\u0005r\u0000\u0000\u00b2\u00b3\u0005"+
		"i\u0000\u0000\u00b3\u00b4\u0005n\u0000\u0000\u00b4\u00b5\u0005t\u0000"+
		"\u0000\u00b5B\u0001\u0000\u0000\u0000\u00b6\u00ba\u0007\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0007\u0001\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bbD\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c3\u0005\"\u0000\u0000\u00be\u00c2"+
		"\b\u0002\u0000\u0000\u00bf\u00c0\u0005\\\u0000\u0000\u00c0\u00c2\t\u0000"+
		"\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00d2\u0005\"\u0000"+
		"\u0000\u00c7\u00cd\u0005\'\u0000\u0000\u00c8\u00cc\b\u0003\u0000\u0000"+
		"\u00c9\u00ca\u0005\\\u0000\u0000\u00ca\u00cc\t\u0000\u0000\u0000\u00cb"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\'\u0000\u0000\u00d1\u00bd"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c7\u0001\u0000\u0000\u0000\u00d2F\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0007\u0004\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00de\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0005.\u0000\u0000\u00d9\u00db\u0007\u0004"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00dfH\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005T\u0000\u0000\u00e1\u00e2\u0005r\u0000\u0000\u00e2"+
		"\u00e3\u0005u\u0000\u0000\u00e3\u00ea\u0005e\u0000\u0000\u00e4\u00e5\u0005"+
		"F\u0000\u0000\u00e5\u00e6\u0005a\u0000\u0000\u00e6\u00e7\u0005l\u0000"+
		"\u0000\u00e7\u00e8\u0005s\u0000\u0000\u00e8\u00ea\u0005e\u0000\u0000\u00e9"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00ea"+
		"J\u0001\u0000\u0000\u0000\u00eb\u00ed\u0007\u0005\u0000\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0006%\u0000\u0000\u00f1L\u0001\u0000"+
		"\u0000\u0000\f\u0000\u00ba\u00c1\u00c3\u00cb\u00cd\u00d1\u00d6\u00dc\u00de"+
		"\u00e9\u00ee\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}