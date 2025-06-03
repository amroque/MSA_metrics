// Generated from E:/OneDrive Personal/OneDrive/Documentos/intelli/MSA/src/main/java/antlr_grammar/gramatica.g4 by ANTLR 4.13.1
package antlr_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(gramaticaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(gramaticaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#anotations}.
	 * @param ctx the parse tree
	 */
	void enterAnotations(gramaticaParser.AnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#anotations}.
	 * @param ctx the parse tree
	 */
	void exitAnotations(gramaticaParser.AnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#anotation}.
	 * @param ctx the parse tree
	 */
	void enterAnotation(gramaticaParser.AnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#anotation}.
	 * @param ctx the parse tree
	 */
	void exitAnotation(gramaticaParser.AnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#apiGateway}.
	 * @param ctx the parse tree
	 */
	void enterApiGateway(gramaticaParser.ApiGatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#apiGateway}.
	 * @param ctx the parse tree
	 */
	void exitApiGateway(gramaticaParser.ApiGatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(gramaticaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(gramaticaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(gramaticaParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(gramaticaParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(gramaticaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(gramaticaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subPackage}.
	 * @param ctx the parse tree
	 */
	void enterSubPackage(gramaticaParser.SubPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subPackage}.
	 * @param ctx the parse tree
	 */
	void exitSubPackage(gramaticaParser.SubPackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(gramaticaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(gramaticaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(gramaticaParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(gramaticaParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#importID}.
	 * @param ctx the parse tree
	 */
	void enterImportID(gramaticaParser.ImportIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#importID}.
	 * @param ctx the parse tree
	 */
	void exitImportID(gramaticaParser.ImportIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subImport}.
	 * @param ctx the parse tree
	 */
	void enterSubImport(gramaticaParser.SubImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subImport}.
	 * @param ctx the parse tree
	 */
	void exitSubImport(gramaticaParser.SubImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#apiClass}.
	 * @param ctx the parse tree
	 */
	void enterApiClass(gramaticaParser.ApiClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#apiClass}.
	 * @param ctx the parse tree
	 */
	void exitApiClass(gramaticaParser.ApiClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(gramaticaParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(gramaticaParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#extendedClass}.
	 * @param ctx the parse tree
	 */
	void enterExtendedClass(gramaticaParser.ExtendedClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#extendedClass}.
	 * @param ctx the parse tree
	 */
	void exitExtendedClass(gramaticaParser.ExtendedClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(gramaticaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(gramaticaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variableDataType}.
	 * @param ctx the parse tree
	 */
	void enterVariableDataType(gramaticaParser.VariableDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variableDataType}.
	 * @param ctx the parse tree
	 */
	void exitVariableDataType(gramaticaParser.VariableDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(gramaticaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(gramaticaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gramaticaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gramaticaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(gramaticaParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(gramaticaParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(gramaticaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(gramaticaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(gramaticaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(gramaticaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(gramaticaParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(gramaticaParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(gramaticaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(gramaticaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(gramaticaParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(gramaticaParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(gramaticaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(gramaticaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exceptionName}.
	 * @param ctx the parse tree
	 */
	void enterExceptionName(gramaticaParser.ExceptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exceptionName}.
	 * @param ctx the parse tree
	 */
	void exitExceptionName(gramaticaParser.ExceptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(gramaticaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(gramaticaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(gramaticaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(gramaticaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tryCatchSect}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchSect(gramaticaParser.TryCatchSectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tryCatchSect}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchSect(gramaticaParser.TryCatchSectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(gramaticaParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(gramaticaParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#catchSect}.
	 * @param ctx the parse tree
	 */
	void enterCatchSect(gramaticaParser.CatchSectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#catchSect}.
	 * @param ctx the parse tree
	 */
	void exitCatchSect(gramaticaParser.CatchSectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(gramaticaParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(gramaticaParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#returnSect}.
	 * @param ctx the parse tree
	 */
	void enterReturnSect(gramaticaParser.ReturnSectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#returnSect}.
	 * @param ctx the parse tree
	 */
	void exitReturnSect(gramaticaParser.ReturnSectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(gramaticaParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(gramaticaParser.ReturnBlockContext ctx);
}