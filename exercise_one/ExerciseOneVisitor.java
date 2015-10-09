// Generated from ExerciseOne.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExerciseOneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExerciseOneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExerciseOneParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ExerciseOneParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newline}
	 * labeled alternative in {@link ExerciseOneParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(ExerciseOneParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bas}
	 * labeled alternative in {@link ExerciseOneParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBas(ExerciseOneParser.BasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pars}
	 * labeled alternative in {@link ExerciseOneParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(ExerciseOneParser.ParsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dep}
	 * labeled alternative in {@link ExerciseOneParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDep(ExerciseOneParser.DepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExerciseOneParser#basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasico(ExerciseOneParser.BasicoContext ctx);
}