// Generated from C:/Users/YEKTA-PC/IdeaProjects/untitled/src\AntlrProject.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(AntlrProjectParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AntlrProjectParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(AntlrProjectParser.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#immport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmport(AntlrProjectParser.ImmportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#experssion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperssion(AntlrProjectParser.ExperssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AntlrProjectParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AntlrProjectParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AntlrProjectParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(AntlrProjectParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(AntlrProjectParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(AntlrProjectParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#switchcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchcase(AntlrProjectParser.SwitchcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AntlrProjectParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(AntlrProjectParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AntlrProjectParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(AntlrProjectParser.ArrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(AntlrProjectParser.ExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(AntlrProjectParser.VectorContext ctx);
}