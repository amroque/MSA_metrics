// Generated from E:/OneDrive Personal/OneDrive/Documentos/intelli/MSA/src/main/java/antlr_grammar/gramatica.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(gramaticaParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#anotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnotations(gramaticaParser.AnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#anotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnotation(gramaticaParser.AnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#apiGateway}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiGateway(gramaticaParser.ApiGatewayContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(gramaticaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(gramaticaParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(gramaticaParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subPackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPackage(gramaticaParser.SubPackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(gramaticaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(gramaticaParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#importID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportID(gramaticaParser.ImportIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubImport(gramaticaParser.SubImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#apiClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiClass(gramaticaParser.ApiClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(gramaticaParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#extendedClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedClass(gramaticaParser.ExtendedClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(gramaticaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variableDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDataType(gramaticaParser.VariableDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(gramaticaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gramaticaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(gramaticaParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(gramaticaParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(gramaticaParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(gramaticaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(gramaticaParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(gramaticaParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(gramaticaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(gramaticaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exceptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionName(gramaticaParser.ExceptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(gramaticaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tryCatchSect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchSect(gramaticaParser.TryCatchSectContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(gramaticaParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#catchSect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchSect(gramaticaParser.CatchSectContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(gramaticaParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#returnSect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSect(gramaticaParser.ReturnSectContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(gramaticaParser.ReturnBlockContext ctx);
}