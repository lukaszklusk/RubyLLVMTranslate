// Generated from C:/Users/Kluch/IdeaProjects/RubyLLVMTranslate/src/main/antlr4\Ruby.g4 by ANTLR 4.8
package antlr_output;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RubyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RubyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RubyParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RubyParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(RubyParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RubyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#require_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequire_block(RubyParser.Require_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(RubyParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_body(RubyParser.Function_definition_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_header(RubyParser.Function_definition_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(RubyParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params(RubyParser.Function_definition_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params_list(RubyParser.Function_definition_params_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(RubyParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RubyParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RubyParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_call_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_param_list(RubyParser.Function_call_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_params(RubyParser.Function_call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elsif_statement(RubyParser.If_elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(RubyParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#unless_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_statement(RubyParser.Unless_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(RubyParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#while_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_expression_list(RubyParser.While_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(RubyParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#for_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expression_list(RubyParser.For_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RubyParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assignment(RubyParser.Array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition(RubyParser.Array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#array_definition_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition_elements(RubyParser.Array_definition_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#array_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_selector(RubyParser.Array_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#int_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_result(RubyParser.Int_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#float_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_result(RubyParser.Float_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#string_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_result(RubyParser.String_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(RubyParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(RubyParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#literal_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_t(RubyParser.Literal_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#float_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_t(RubyParser.Float_tContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link RubyParser#int_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(RubyParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#bool_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_t(RubyParser.Bool_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#nil_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_t(RubyParser.Nil_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(RubyParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#id_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_global(RubyParser.Id_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#id_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_function(RubyParser.Id_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(RubyParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#crlf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlf(RubyParser.CrlfContext ctx);
}