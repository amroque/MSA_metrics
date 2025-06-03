package org.cenidet;

import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        try {
            String filePath = "E:\\Documentos\\archivos\\Residencia\\repositorios residencia\\train-ticket-master\\ts-admin-order-service\\src\\main\\java\\adminorder\\service\\AdminOrderServiceImpl.java";
            //File file = new File(filePath);
            gramaticaLexer lexer = new gramaticaLexer(CharStreams.fromFileName(filePath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            gramaticaParser parser = new gramaticaParser(tokens);
            gramaticaParser.ApiGatewayContext context = parser.apiGateway();

            gramaticaVisitor visitor = new gramaticaVisitor();
            visitor.visit(context);

            List<String> methods = visitor.getMethodsList();
            List<String> variableType = visitor.getVariableTypeList();
            List<String> variables = visitor.getVariableList();
            int numMethods = visitor.getNumMethods();
            String className = visitor.getClassName();
            String apiName = visitor.getApiName();
            String errors = visitor.getErrors();

            System.out.println("Class Name: " + className);
            System.out.println("ApiName: " + apiName);

            int numM = 0;
            System.out.println("Variables: ");
            for (String variable : variables) {
                System.out.println("Variable " + (numM + 1) + ": " + variable + ". Tipo: " + variableType.get(numM));
                numM++;
            }

            numM = 1;
            System.out.println("Num. Methods: " + numMethods);
            for (String method : methods) {
                System.out.println("Método " + numM + ": " + method);
                numM++;
            }

            System.out.println("Errores:\n" + errors);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
