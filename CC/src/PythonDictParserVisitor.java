// Generated from grammar/PythonDictParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonDictParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonDictParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonDictParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonDictParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator(PythonDictParser.SeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PythonDictParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#dictValueAssignToKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictValueAssignToKey(PythonDictParser.DictValueAssignToKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(PythonDictParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#pairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairList(PythonDictParser.PairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(PythonDictParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(PythonDictParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PythonDictParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(PythonDictParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PythonDictParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PythonDictParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(PythonDictParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(PythonDictParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable(PythonDictParser.IterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(PythonDictParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(PythonDictParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(PythonDictParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(PythonDictParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(PythonDictParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(PythonDictParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PythonDictParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PythonDictParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonDictParser#dictAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAccess(PythonDictParser.DictAccessContext ctx);
}