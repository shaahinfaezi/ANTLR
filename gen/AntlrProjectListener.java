// Generated from C:/Users/YEKTA-PC/IdeaProjects/untitled/src\AntlrProject.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrProjectParser}.
 */
public interface AntlrProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(AntlrProjectParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(AntlrProjectParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AntlrProjectParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AntlrProjectParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#class_statement}.
	 * @param ctx the parse tree
	 */
	void enterClass_statement(AntlrProjectParser.Class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#class_statement}.
	 * @param ctx the parse tree
	 */
	void exitClass_statement(AntlrProjectParser.Class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#immport}.
	 * @param ctx the parse tree
	 */
	void enterImmport(AntlrProjectParser.ImmportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#immport}.
	 * @param ctx the parse tree
	 */
	void exitImmport(AntlrProjectParser.ImmportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#experssion}.
	 * @param ctx the parse tree
	 */
	void enterExperssion(AntlrProjectParser.ExperssionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#experssion}.
	 * @param ctx the parse tree
	 */
	void exitExperssion(AntlrProjectParser.ExperssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AntlrProjectParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AntlrProjectParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AntlrProjectParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AntlrProjectParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(AntlrProjectParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(AntlrProjectParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(AntlrProjectParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(AntlrProjectParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(AntlrProjectParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(AntlrProjectParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(AntlrProjectParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(AntlrProjectParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcase(AntlrProjectParser.SwitchcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcase(AntlrProjectParser.SwitchcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AntlrProjectParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AntlrProjectParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(AntlrProjectParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(AntlrProjectParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(AntlrProjectParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(AntlrProjectParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#arrow}.
	 * @param ctx the parse tree
	 */
	void enterArrow(AntlrProjectParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#arrow}.
	 * @param ctx the parse tree
	 */
	void exitArrow(AntlrProjectParser.ArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#exception}.
	 * @param ctx the parse tree
	 */
	void enterException(AntlrProjectParser.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#exception}.
	 * @param ctx the parse tree
	 */
	void exitException(AntlrProjectParser.ExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(AntlrProjectParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(AntlrProjectParser.VectorContext ctx);
}