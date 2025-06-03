grammar Estructura;

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

// Archivo java
javaFile : packageDeclaration? importDeclaration* apiClass;

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

// Nombre de clase
apiClass
    : anotations* modifier* 'class' className 'implements' nameApi '{' memberDeclaration* '}'
    | anotations* 'public' 'class' className 'extends' nameApi '{' memberDeclaration* '}'
    | anotations* 'public' 'class' className '{' memberDeclaration* '}';
className : ID;
nameApi : ID ('.' ID)* ('<' ID ('.' ID)* '>')*;

// Partes de una clase
memberDeclaration
    : variableDeclaration
    | constructor
    | methodDeclaration;

// Variables globales
variableDeclaration
    : anotations*? modifier* variableDataType variable value*? (',' variable '[]'? value?)* ';'
    | anotations*? modifier* variableDataType variable (',' variable)* ';';
variableDataType: ID ('.' ID)*? ('[]'? | ('<' ID (',' ID)*? '>'))?;
variable : variableName=ID?;
value : '=' STRING | '=' .*?;

// Constructores
constructor : modifier* className '(' parameters? ')' '{' constructorBody '}';
constructorBody : (estructuraIf | estructuraFor | estructuraSwitchCase | estructuraDoWhile | estructuraTryCatch | .)*?;

//Declaración de método
methodDeclaration
    : anotations*? modifier* returnType methodName '(' (parameter(',' parameter)*)? ')' ('throws' exceptionName)? ('{' methodBody '}' | '{}');

returnType : genericName ('[]' | parameterizedName)?;
genericName : parameterizedName | ID;
parameterizedName :'<' genericName (',' genericName)*? '>';

methodName : ID;
parameters : parameter (',' parameter)*;
parameter
    : modifier*? dataType ('.' ID)*? ('[]' | '<' ID (',' ID)*? '>')? paramName=ID
    | dataType paramName=ID '[]';
dataType : ID ('.' ID)*;
exceptionName : ID;

methodBody: (estructuraIf | estructuraFor | estructuraSwitchCase | estructuraWhile | estructuraDoWhile | estructuraTryCatch | .)*?;

estructuraIf : 'if' '(' booleanExpression ')';
estructuraFor : 'for' '(' booleanExpression ')';

estructuraSwitchCase : 'switch' '(' .*? ')' '{' estructuraCase+ estructuradefault? '}' ;
estructuraCase : 'case' .*? ':' .*? 'break' ';' ;
estructuradefault :  'default' ':' todoEstructuras 'break'? ';';

estructuraWhile : 'while' '(' booleanExpression ')';

estructuraDoWhile : 'do' '{' booleanExpression '}' 'while' '(' booleanExpression ')';

estructuraTryCatch : 'try' '{' tryBlock '}' catchSect+;
tryBlock : .*?;
catchSect : 'catch' '(' booleanExpression ')' '{' catchBlock '}';
catchBlock : .*?;

booleanExpression : booleanTerm ( '||' booleanTerm )*?;
booleanTerm : booleanFactor ( '&&' booleanFactor )*?;
booleanFactor : .*? ;
todoEstructuras : .*?;