grammar gramatica;

// Reglas léxicas
ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INT : [0-9]+;
STRING : '"' ~[\r\n"]* '"';
CHAR : [\\"'&<>!?:+*{}\-|[\]/]+;
WS : [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;

// Reglas sintácticas

// Modificador
modifier : 'public' | 'private' | 'protected' | 'static' | 'final' | 'abstract' | 'synchronized' | 'native' | 'transient';
anotations : anotation;
anotation : '@' ID | '@' ID '("' .*? '")' | '@' ID '(' .*? ')';

// API Gateway
apiGateway : packageDeclaration? importDeclaration* apiClass;

// Package
packageDeclaration : 'package' package ';';
package : packageName;
packageName : ID ('.' subPackage)*?;
subPackage : ID;

// Importaciones
importDeclaration : 'import' modifier*? importName;
importName : importID;
importID : ID ('.' subImport)*? ('.*;' | ';');
subImport : ID;

// Importaciones especiales

// Nombre de API Gateway (clase)
apiClass
    : anotations* modifier* 'class' className 'implements' extendedClass '{' memberDeclaration* '}'
    | anotations* modifier* 'class' className 'extends' extendedClass '{' memberDeclaration* '}'
    | anotations* modifier* 'class' className '{' memberDeclaration* '}';
className : ID;
extendedClass : ID ('.' ID)* ('<' ID ('.' ID)* '>')*;

// Partes de una clase
memberDeclaration
    : variableDeclaration
    | constructor
    | methodDeclaration;

// Variables globales
variableDeclaration
    : anotations* modifier* variableDataType variable value? (',' variable value?)* ';';
variableDataType: ID ('.' ID)*? ('[]' | '[][]' | '<' ID (',' ID)*? '>')?;
variable : variableName = ID ('[]' | '[][]')?;
value : '=' STRING | '=' .*?;

// Constructores
constructor : modifier* className '(' parameters? ')' ('{' constructorBody '}' | '{}');
constructorBody : (.)*?;
parameters : parameter (',' parameter)*;

test : methodDeclaration*;
//Declaración de método
methodDeclaration
    : anotations* modifier* returnType methodName
    '(' (parameter(',' parameter)*)? ')' ('throws' exceptionName)?
    ('{' methodBody '}' | '{}');

returnType : ID ('.' ID)* ('[]' | '[][]' | '<' ID (',' ID)* '>')?;
methodName : ID;
exceptionName : ID;
methodBody: (tryCatchSect | returnSect | .)*?;

parameter : modifier* dataType paramName=ID ('[]' | '[][]')? ;
dataType : ID ('.' ID)* ('[]' | '[][]' | '<' ID (',' ID)* '>')?;




tryCatchSect : 'try' '{' tryBlock '}' catchSect+;
tryBlock : (returnSect | .)*?;
catchSect : 'catch' '(' .*? ')' '{' catchBlock '}';
catchBlock : (returnSect | .)*?;

returnSect : 'return' returnBlock ;
returnBlock : .*? ';';