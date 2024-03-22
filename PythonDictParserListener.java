// Generated from PythonDictParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonDictParser}.
 */
public interface PythonDictParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonDictParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonDictParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonDictParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonDictParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(PythonDictParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(PythonDictParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PythonDictParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PythonDictParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#dictValueAssignToKey}.
	 * @param ctx the parse tree
	 */
	void enterDictValueAssignToKey(PythonDictParser.DictValueAssignToKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#dictValueAssignToKey}.
	 * @param ctx the parse tree
	 */
	void exitDictValueAssignToKey(PythonDictParser.DictValueAssignToKeyContext ctx);
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
	 * Enter a parse tree produced by {@link PythonDictParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonDictParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonDictParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link PythonDictParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PythonDictParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PythonDictParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable(PythonDictParser.IterableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable(PythonDictParser.IterableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(PythonDictParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(PythonDictParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(PythonDictParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(PythonDictParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonDictParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonDictParser.ExpressionContext ctx);
}