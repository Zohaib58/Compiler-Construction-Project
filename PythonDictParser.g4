parser grammar PythonDictParser;
options { tokenVocab=PythonDictLexer; }

program : (statement separator?)+ ;

statement : variable | dictValueAssignToKey | dict | forLoop | list | methodCall | ifCondition;

separator : SEMICOLON ;

variable : IDENTIFIER ASSIGN (constructor | STRING_LITERAL | NUMERIC_LITERAL | dict | list | tuple) ;

dictValueAssignToKey : IDENTIFIER BRACKET_OPEN key BRACKET_CLOSE ASSIGN value ;

dict : BRACE_OPEN pairList? BRACE_CLOSE ;

pairList : pair (COMMA pair)* ;

pair : key COLON value ;

key : constructor | STRING_LITERAL | NUMERIC_LITERAL ;

value : constructor | STRING_LITERAL | NUMERIC_LITERAL | dict | list | tuple ;

constructor : IDENTIFIER PAREN_OPEN argumentList? PAREN_CLOSE ;

argumentList : expression (COMMA expression)* ;

list : BRACKET_OPEN elementList? BRACKET_CLOSE ;

tuple : PAREN_OPEN elementList? PAREN_CLOSE ;

elementList : value (COMMA value)* ; 


forLoop : FOR IDENTIFIER IN iterable BRACE_OPEN statement+ BRACE_CLOSE ;

iterable : IDENTIFIER | list | dict | tuple ; 


methodCall : IDENTIFIER DOT methodName  PAREN_OPEN PAREN_CLOSE ;

methodName :  GET_METHOD | KEYS_METHOD | VALUES_METHOD | ITEMS_METHOD | POP_METHOD | UPDATE_METHOD ;

ifCondition : IF ifElifBlocks ; 

ifElifBlocks : PAREN_OPEN condition PAREN_CLOSE BRACE_OPEN statement+ BRACE_CLOSE (ELIF ifElifBlocks)* (ELSE BRACE_OPEN statement+ BRACE_CLOSE)? ;

condition : expression (EQUALS_TO | NOT_EQUALS_TO | LESS_THAN | LESS_THAN_EQUALS_TO | GREATER_THAN | GREATER_THAN_EQUALS_TO) expression ; 

expression : STRING_LITERAL | NUMERIC_LITERAL | BOOLEAN_LITERAL | IDENTIFIER | methodCall | list | tuple | dict
    	     expression (MULTIPLY | DIVIDE) expression    // Multiplication and division | expression (ADD | SUBTRACT) expression    // Addition and subtraction
    	     | expression (EQUALS_TO | NOT_EQUALS_TO | LESS_THAN | LESS_THAN_EQUALS_TO | GREATER_THAN | GREATER_THAN_EQUALS_TO) expression  // Comparisons
    	     | PAREN_OPEN expression PAREN_CLOSE                    // Grouping
    // Add rules for arithmetic operations, etc.
    ;


