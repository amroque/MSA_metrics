grammar gramaticawzuul;

// Reglas léxicas
ID              : [a-zA-Z_] [a-zA-Z_0-9]*;
INT             : [0-9]+;
WS              : [ \t\r\n]+ -> skip;
COMMENT         : '//' ~[\r\n]* -> skip;
STRING          : '"' ~["]* '"';

// Ignorar comentarios multilinea /* */
ML_COMMENT: '/*' .*? '*/' -> skip;

// Reglas sintácticas

// API Gateway
apiGateway : package? importDeclaration* apiClass;

// Package
package : 'package' namePackage=ID ('.' subPackage = ID)? ';';

// Importaciones
importDeclaration : 'import' packageName=ID ('.' subImport=ID)*? ('.*;' | ';');
// Ej. import org.springframework.http.HttpHeaders;

// Nombre de API Gateway (clase)
apiClass
    : '@Service' 'public' 'class' className=ID 'implements' nameApi=ID '{' memberDeclaration* '}'
    | '@SpringBootApplication' 'public' 'class' className=ID '{' memberDeclaration* '}'
    | '@service' 'public' 'class' className=ID 'extends' nameApi=ID '{' memberDeclaration* '}';
// Ej. @service public class ContactsServiceImpl implements ContactsService {}

// Partes de una clase
memberDeclaration
    : variableDeclaration
    | methodDeclaration;

// Variables globales ********************************
variableDeclaration
    : '@Autowired'? modifier* dataType=ID variable '[]'? value*? (',' variable '[]'? value?)* ';'
    | '@Autowired'? modifier* dataType=ID '[]' variable (',' variable)* ';';

variable : variableName=ID?;

value : '=' .*?;

// ****************************************************

// Operaciones ****************************************
operations : methodDeclaration;

//Declaración de método
methodDeclaration
    : anotation*? modifier* returnType methodName=ID '(' parameters? ')' '{' methodBody '}';
// Ej. public Response findContactsById(UUID id, HttpHeaders headers) {}

// Anotaciones
anotation : '@Bean' | '@Override' | '@LoadBalanced';

// Modificador
modifier : 'public' | 'private' | 'protected' | 'static' | 'final' | 'abstract' | 'synchronized' | 'native';

returnType : ID;

// Parámetros de método
parameters : parameter (',' parameter)*;
// Ej. UUID id, HttpHeaders headers

// Parámetro
parameter
    : dataType=ID paramName=ID
    | dataType=ID '[]' paramName=ID
    | dataType=ID paramName=ID '[]';

methodBody: .*?;
// ****************************************************