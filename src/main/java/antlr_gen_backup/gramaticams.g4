grammar gramaticams;

// Reglas léxicas
ID      : [A-Za-z_] [A-Za-z_0-9]*;
INT     : [0-9]+;
WS      : [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\n\r]* -> skip;
STRING  : '"' ~["]* '"';

// Reglas sintácticas

// API Gateway
apiGateway      : package importDeclaration* apiClass;

// Package
package : 'package' namePackage=ID ('.' subPackage = ID)? ';';

// Importaciones
importDeclaration : 'import' packageName=ID ('.' subPackage=ID)? ('.*;' | ';');
// Ej. import org.springframework.http.HttpHeaders;

// Nombre de API Gateway (clase)
apiClass        : '@service' 'public' 'class' className=ID 'implements' nameApi=ID '{' operation+ '}';
// Ej. @service public class ContactsServiceImpl implements ContactsService {}

// Operaciones
operation       : methodDeclaration;

//Declaración de método
methodDeclaration
    : methodModifier* (returnType | dataType) methodName=ID '(' parameters? ')' '{' '}';
// Ej. public Response findContactsById(UUID id, HttpHeaders headers) {}

// Modificador
methodModifier  : 'public';

returnType: ID;

// Parámetros de método
parameters      : parameter (',' parameter)*;
// Ej. UUID id, HttpHeaders headers

// Parámetro
parameter       : dataType ID;

// Tipo de dato. Ejemplo usando HttpHeaders y edu.fudan.common.util.Response
dataType        : 'HttpHeaders' | 'Response' | 'UUID';

// Ignorar comentarios multilinea /* */
ML_COMMENT      : '/*' .*? '*/' -> skip;