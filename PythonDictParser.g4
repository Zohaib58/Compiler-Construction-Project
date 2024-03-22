parser grammar PythonDictParser;
options { tokenVocab=PythonDictLexer; }

program : (statement separator?)+ ;

statement : variable | dictValueAssignToKey | dict | forLoop | list | methodCall;

separator : SEMICOLON ;

variable : IDENTIFIER ASSIGN (STRING_LITERAL | NUMERIC_LITERAL | dict | list | tuple) ;

dictValueAssignToKey : IDENTIFIER BRACKET_OPEN key BRACKET_CLOSE ASSIGN value ;

dict : BRACE_OPEN pairList? BRACE_CLOSE ;

pairList : pair (COMMA pair)* ;

pair : key COLON value ;

key : STRING_LITERAL | NUMERIC_LITERAL ;

value : STRING_LITERAL | NUMERIC_LITERAL | dict | list | tuple ;

list : BRACKET_OPEN elementList? BRACKET_CLOSE ;

tuple : PAREN_OPEN elementList? PAREN_CLOSE ;

elementList : value (COMMA value)* ; 


forLoop : FOR IDENTIFIER IN iterable BRACE_OPEN statement+ BRACE_CLOSE ;

iterable : IDENTIFIER | list | dict | tuple ; 


methodCall : IDENTIFIER DOT methodName  PAREN_OPEN PAREN_CLOSE ;

methodName :  GET_METHOD | KEYS_METHOD | VALUES_METHOD | ITEMS_METHOD | POP_METHOD | UPDATE_METHOD ;

expression
    : STRING_LITERAL
    | NUMERIC_LITERAL
    | BOOLEAN_LITERAL
    | IDENTIFIER
    | methodCall
    | list
    | tuple
    // Add rules for arithmetic operations, etc.
    ;
