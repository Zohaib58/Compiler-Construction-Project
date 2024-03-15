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
		PAREN_CLOSE=6, ASSIGN=7, COLON=8, COMMA=9, FOR=10, IF=11, ELSE=12, ELIF=13, 
		IDENTIFIER=14, STRING_LITERAL=15, NUMERIC_LITERAL=16, GET_METHOD=17, KEYS_METHOD=18, 
		VALUES_METHOD=19, ITEMS_METHOD=20, POP_METHOD=21, UPDATE_METHOD=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "PAREN_OPEN", 
			"PAREN_CLOSE", "ASSIGN", "COLON", "COMMA", "FOR", "IF", "ELSE", "ELIF", 
			"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL", "GET_METHOD", "KEYS_METHOD", 
			"VALUES_METHOD", "ITEMS_METHOD", "POP_METHOD", "UPDATE_METHOD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "':'", "','", 
			"'for'", "'if'", "'else'", "'elif'", null, null, null, "'get'", "'keys'", 
			"'values'", "'items'", "'pop'", "'update'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "PAREN_OPEN", 
			"PAREN_CLOSE", "ASSIGN", "COLON", "COMMA", "FOR", "IF", "ELSE", "ELIF", 
			"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL", "GET_METHOD", "KEYS_METHOD", 
			"VALUES_METHOD", "ITEMS_METHOD", "POP_METHOD", "UPDATE_METHOD", "WS"
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
		"\u0004\u0000\u0017\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005"+
		"\rU\b\r\n\r\f\rX\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e^\b\u000e\n\u000e\f\u000ea\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000eh\b\u000e\n\u000e\f\u000ek\t"+
		"\u000e\u0001\u000e\u0003\u000en\b\u000e\u0001\u000f\u0004\u000fq\b\u000f"+
		"\u000b\u000f\f\u000fr\u0001\u000f\u0001\u000f\u0004\u000fw\b\u000f\u000b"+
		"\u000f\f\u000fx\u0003\u000f{\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0004\u0016\u009f\b\u0016\u000b\u0016\f\u0016\u00a0\u0001"+
		"\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0006\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00ad\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001"+
		"\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000"+
		"\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001"+
		"\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000"+
		"\u0000\u0013A\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017"+
		"H\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bR\u0001"+
		"\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000"+
		"\u0000!|\u0001\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0085"+
		"\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000)\u0092\u0001"+
		"\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-\u009e\u0001\u0000\u0000"+
		"\u0000/0\u0005{\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005}\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u000034\u0005[\u0000\u00004\u0006\u0001"+
		"\u0000\u0000\u000056\u0005]\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005"+
		"(\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\f\u0001"+
		"\u0000\u0000\u0000;<\u0005=\u0000\u0000<\u000e\u0001\u0000\u0000\u0000"+
		"=>\u0005:\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005,\u0000\u0000"+
		"@\u0012\u0001\u0000\u0000\u0000AB\u0005f\u0000\u0000BC\u0005o\u0000\u0000"+
		"CD\u0005r\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0005i\u0000\u0000"+
		"FG\u0005f\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HI\u0005e\u0000\u0000"+
		"IJ\u0005l\u0000\u0000JK\u0005s\u0000\u0000KL\u0005e\u0000\u0000L\u0018"+
		"\u0001\u0000\u0000\u0000MN\u0005e\u0000\u0000NO\u0005l\u0000\u0000OP\u0005"+
		"i\u0000\u0000PQ\u0005f\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000RV\u0007"+
		"\u0000\u0000\u0000SU\u0007\u0001\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W\u001c\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y_\u0005"+
		"\"\u0000\u0000Z^\b\u0002\u0000\u0000[\\\u0005\\\u0000\u0000\\^\t\u0000"+
		"\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bn\u0005\"\u0000\u0000"+
		"ci\u0005\'\u0000\u0000dh\b\u0003\u0000\u0000ef\u0005\\\u0000\u0000fh\t"+
		"\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0005\'\u0000"+
		"\u0000mY\u0001\u0000\u0000\u0000mc\u0001\u0000\u0000\u0000n\u001e\u0001"+
		"\u0000\u0000\u0000oq\u0007\u0004\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sz\u0001\u0000\u0000\u0000tv\u0005.\u0000\u0000uw\u0007\u0004\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zt\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{ \u0001\u0000\u0000\u0000"+
		"|}\u0005g\u0000\u0000}~\u0005e\u0000\u0000~\u007f\u0005t\u0000\u0000\u007f"+
		"\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005k\u0000\u0000\u0081\u0082"+
		"\u0005e\u0000\u0000\u0082\u0083\u0005y\u0000\u0000\u0083\u0084\u0005s"+
		"\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u0086\u0005v\u0000\u0000"+
		"\u0086\u0087\u0005a\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088\u0089"+
		"\u0005u\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005s"+
		"\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c\u008d\u0005i\u0000\u0000"+
		"\u008d\u008e\u0005t\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090"+
		"\u0005m\u0000\u0000\u0090\u0091\u0005s\u0000\u0000\u0091(\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005p\u0000\u0000\u0093\u0094\u0005o\u0000\u0000"+
		"\u0094\u0095\u0005p\u0000\u0000\u0095*\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005u\u0000\u0000\u0097\u0098\u0005p\u0000\u0000\u0098\u0099\u0005d"+
		"\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005t\u0000\u0000"+
		"\u009b\u009c\u0005e\u0000\u0000\u009c,\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0007\u0005\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0006\u0016\u0000\u0000\u00a3.\u0001\u0000\u0000\u0000\u000b\u0000V]"+
		"_gimrxz\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}