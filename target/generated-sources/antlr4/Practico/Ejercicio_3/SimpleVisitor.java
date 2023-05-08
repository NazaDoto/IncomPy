// Generated from Practico\Ejercicio_3\Simple.g4 by ANTLR 4.5.1
package Practico.Ejercicio_3;

	import java.util.Map;
	import java.util.HashMap;
	import javax.swing.*;
	import java.util.Scanner;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.Dimension;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.math.*;
	import Taller.ast.*;
	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(SimpleParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(SimpleParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(SimpleParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#valorbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorbool(SimpleParser.ValorboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#repeticion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticion(SimpleParser.RepeticionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#pregunta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPregunta(SimpleParser.PreguntaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(SimpleParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#bloqueElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueElse(SimpleParser.BloqueElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(SimpleParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#oprel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprel(SimpleParser.OprelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#ingresar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngresar(SimpleParser.IngresarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SimpleParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(SimpleParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#mensaje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMensaje(SimpleParser.MensajeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#elementoMensaje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoMensaje(SimpleParser.ElementoMensajeContext ctx);
}