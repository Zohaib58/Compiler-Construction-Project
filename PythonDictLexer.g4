lexer grammar PythonDictLexer;

// Tokens for braces used for dictionaries and blocks
BRACE_OPEN : '{' ;
BRACE_CLOSE : '}' ;
KEY_START : '[' ;
KEY_END : ']' ;
ASSIGN : '=' ;
COLON : ':' ;
COMMA : ',' ;

// Tokens for control flow
FOR : 'for' ;
IF : 'if' ;
ELSE : 'else' ;
ELIF : 'elif' ;

// Token for identifiers (variables, keys)
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;

// Token for string literals, supporting both single and double quotes
STRING_LITERAL : '"' ( ~["\\] | '\\' . )* '"' | '\'' ( ~['\\] | '\\' . )* '\'' ;

// Token for numeric literals (integers and floating-point numbers)
NUMERIC_LITERAL : [0-9]+ ('.' [0-9]+)? ;

// Tokens for dictionary methods
GET_METHOD : 'get' ;
KEYS_METHOD : 'keys' ;
VALUES_METHOD : 'values' ;
ITEMS_METHOD : 'items' ;
POP_METHOD : 'pop' ;
UPDATE_METHOD : 'update' ;

// Skipping whitespaces and newlines
WS : [ \t\r\n]+ -> skip ;