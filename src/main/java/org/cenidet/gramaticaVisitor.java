package org.cenidet;

import antlr.*;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class gramaticaVisitor extends gramaticaBaseVisitor<Void> implements Serializable {
    private int numMethods = 0;
    private int numMethodsPost = 0;
    private int numMethodsPut = 0;
    private int numMethodsDelete = 0;
    private int numMethodsGet = 0;
    private int numParams = 0;
    private int numReturns = 0;
    private String packageName = "";
    private String apiName = "";
    private String className = "";
    private String errors = "";
    private final List<String> importsList = new ArrayList<>();
    private final List<String> methodsList = new ArrayList<>();
    private final  List<String> variableTypeList = new ArrayList<>();
    private final List<String> variableList = new ArrayList<>();
    private final List<List<String>> parameters = new ArrayList<>();
    private final List<List<String>> returns = new ArrayList<>();

    public gramaticaVisitor() {}

    @Override
    public Void visitExtendedClass(gramaticaParser.ExtendedClassContext ctx) {
        if(ctx.ID() != null) {
            this.apiName = ctx.ID().get(0).getText();
        }
        return null;
    }

    @Override
    public Void visitClassName(gramaticaParser.ClassNameContext ctx) {
        if(ctx.ID() != null) {
            this.className = ctx.ID().getText();
        }
        return null;
    }

    @Override
    public Void visitVariableDataType(gramaticaParser.VariableDataTypeContext ctx) {
        if(ctx.ID() != null) {
            String variableDataType = ctx.ID().toString();
            variableTypeList.add(variableDataType);
        }
        return super.visitVariableDataType(ctx);
    }

    @Override
    public Void visitVariable(gramaticaParser.VariableContext ctx) {
        if(ctx.ID() != null) {
            String variableName = ctx.ID().getText();
            variableList.add(variableName);
        }
        return super.visitVariable(ctx);
    }

    @Override
    public Void visitMethodDeclaration(gramaticaParser.MethodDeclarationContext ctx) {
        if(ctx.methodName() != null) {
            String method = ctx.methodName().getText();
            List<gramaticaParser.ParameterContext> parameters = ctx.parameter();
            gramaticaParser.MethodBodyContext methodBody = ctx.methodBody();
            methodsList.add(method);

            List<String> params = new ArrayList<>();
            if(parameters != null){
                for (gramaticaParser.ParameterContext param : parameters) {
                    params.add(param.dataType().getText() + " " + param.paramName.getText());
                    numParams++;
                }
            } else {
                params.add("No hay parámetros");
            }
            this.parameters.add(params);

            List<String> returns = new ArrayList<>();
            if(methodBody != null) {
                List<gramaticaParser.TryCatchSectContext> tryBlockList = methodBody.tryCatchSect();
                List<gramaticaParser.ReturnSectContext> subReturn = methodBody.returnSect();
                if(subReturn != null) {
                    for(gramaticaParser.ReturnSectContext ret : subReturn) {
                        returns.add(ret.returnBlock().getText());
                        numReturns++;
                    }
                } else {
                    returns.add("No hay parámetros de salida");
                }
                if(tryBlockList != null) {
                    for(gramaticaParser.TryCatchSectContext ret2 : tryBlockList) {
                        gramaticaParser.TryBlockContext t = ret2.tryBlock();
                        List<gramaticaParser.ReturnSectContext> rt = t.returnSect();
                        List<gramaticaParser.CatchSectContext> c = ret2.catchSect();
                        for (gramaticaParser.CatchSectContext c2 : c) {
                            gramaticaParser.CatchBlockContext c3 = c2.catchBlock();
                            List<gramaticaParser.ReturnSectContext> r2= c3.returnSect();
                            if(r2 != null) {
                                for(gramaticaParser.ReturnSectContext ret : r2) {
                                    returns.add(ret.returnBlock().getText());
                                    numReturns++;
                                }
                            }
                        }
                        if(rt != null) {
                            for (gramaticaParser.ReturnSectContext ret : rt) {
                                returns.add(ret.returnBlock().getText());
                                numReturns++;
                            }
                        }
                    }
                }
            }
            this.returns.add(returns);

            if(method.toLowerCase().startsWith("get") || method.toLowerCase().startsWith("find"))
                numMethodsGet++;
            else if(method.toLowerCase().startsWith("create") || method.toLowerCase().startsWith("add"))
                numMethodsPost++;
            else if(method.toLowerCase().startsWith("update"))
                numMethodsPut++;
            else if(method.toLowerCase().startsWith("delete"))
                numMethodsDelete++;

            numMethods++;
        }
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Void visitPackage(gramaticaParser.PackageContext ctx) {
        if(ctx.packageName() != null) {
            this.packageName = ctx.packageName().getText();
        }
        return null;
    }

    @Override
    public Void visitImportName(gramaticaParser.ImportNameContext ctx) {
        if(ctx.importID() != null) {
            String importName = ctx.importID().getText();
            importsList.add(importName);
        }
        return super.visitImportName(ctx);
    }

    @Override
    public Void visitErrorNode(ErrorNode node) {
        if(node.getText() != null)
            this.errors += node.getText() + "\n";
        return super.visitErrorNode(node);
    }

    public int getNumMethods() {
        return numMethods;
    }
    public int getNumMethodsPost() {
        return numMethodsPost;
    }
    public int getNumMethodsPut() {
        return numMethodsPut;
    }
    public int getNumMethodsDelete() {
        return numMethodsDelete;
    }
    public int getNumMethodsGet() {
        return numMethodsGet;
    }
    public int getNumParams() {
        return numParams;
    }
    public int getNumReturns() {
        return numReturns;
    }
    public String getApiName() {
        return apiName;
    }

    public String getClassName() {
        return className;
    }
    public String getPackageName() {
        return packageName;
    }
    public List<String> getVariableTypeList() {
        return variableTypeList;
    }
    public List<String> getVariableList() {
        return variableList;
    }
    public List<String> getMethodsList() {
        return methodsList;
    }
    public List<String> getImportsList() {
        return importsList;
    }
    public List<List<String>> getParameters() {
        return parameters;
    }
    public List<List<String>> getReturns() {
        return returns;
    }
    public String getErrors() {
        return errors;
    }
}
