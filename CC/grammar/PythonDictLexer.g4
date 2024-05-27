lexer grammar PythonDictLexer;

// Tokens for braces used for dictionaries and blocks
BRACE_OPEN : '{' ;
BRACE_CLOSE : '}' ;
BRACKET_OPEN : '[' ;
BRACKET_CLOSE : ']' ;
PAREN_OPEN : '(' ;
PAREN_CLOSE : ')' ;


ASSIGN : '=' ;
IN : 'in' ;
COLON : ':' ;
COMMA : ',' ;
DOT : '.' ;
SEMICOLON : ';' ;

// Tokens for control flow
FOR : 'for' ;
IF : 'if' ;
ELSE : 'else' ;
ELIF : 'elif' ;


ADD : '+' ;
SUBTRACT : '-' ;
DIVIDE : '/' ;
MULTIPLY : '*' ;

// Token for comparison operators
EQUALS_TO : '==' ; 
NOT_EQUALS_TO : '!=' ;
LESS_THAN : '<' ;
LESS_THAN_EQUALS_TO : '<=' ;
GREATER_THAN : '>' ;
GREATER_THAN_EQUALS_TO : '>=' ;


// Tokens for dictionary methods
GET_METHOD : 'get' ;
KEYS_METHOD : 'keys' ;
VALUES_METHOD : 'values' ;
ITEMS_METHOD : 'items' ;
POP_METHOD : 'pop' ;
UPDATE_METHOD : 'update' ;


PRINT : 'print' ;



// Token for identifiers (variables, keys)
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;

// Token for string literals, supporting both single and double quotes
STRING_LITERAL : '"' ( ~["\\] | '\\' . )* '"' | '\'' ( ~['\\] | '\\' . )* '\'' ;

// Token for numeric literals (integers and floating-point numbers)
NUMERIC_LITERAL : '-'? [0-9]+ ('.' [0-9]+)? ;

BOOLEAN_LITERAL : 'True' | 'False' ;

LINE_COMMENT : '//' ~[\r\n]*;  // Emit line comments
BLOCK_COMMENT : '/*' .*? '*/'; // Emit block comments

// Skipping whitespaces and newlines
WS : [ \t\r\n]+ -> skip ;