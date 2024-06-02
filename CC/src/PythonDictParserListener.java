// Generated from grammar/PythonDictParser.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link PythonDictParser#statementWithLineComments}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithLineComments(PythonDictParser.StatementWithLineCommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#statementWithLineComments}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithLineComments(PythonDictParser.StatementWithLineCommentsContext ctx);
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
	 * Enter a parse tree produced by {@link PythonDictParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(PythonDictParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(PythonDictParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PythonDictParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PythonDictParser.ArgumentListContext ctx);
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
	 * Enter a parse tree produced by {@link PythonDictParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(PythonDictParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(PythonDictParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(PythonDictParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(PythonDictParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(PythonDictParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(PythonDictParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(PythonDictParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(PythonDictParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PythonDictParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PythonDictParser.ConditionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PythonDictParser#dictAccess}.
	 * @param ctx the parse tree
	 */
	void enterDictAccess(PythonDictParser.DictAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonDictParser#dictAccess}.
	 * @param ctx the parse tree
	 */
	void exitDictAccess(PythonDictParser.DictAccessContext ctx);
}