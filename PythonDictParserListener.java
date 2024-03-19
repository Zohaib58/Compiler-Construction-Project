// Generated from PythonDictParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonDictParser}.
 */
public interface PythonDictParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(PythonDictParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(PythonDictParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#pairList}.
	 * @param ctx the parse tree
	 */
	void enterPairList(PythonDictParser.PairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#pairList}.
	 * @param ctx the parse tree
	 */
	void exitPairList(PythonDictParser.PairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(PythonDictParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(PythonDictParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(PythonDictParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(PythonDictParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PythonDictParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PythonDictParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(PythonDictParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(PythonDictParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(PythonDictParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(PythonDictParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonDictParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonDictParser.ValueContext ctx);
}