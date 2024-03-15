parser grammar PythonDictParser;


dict : BRACE_OPEN pairList? BRACE_CLOSE ;

pairList : pair (COMMA pair)* ;

pair : key COLON value ;

key : STRING_LITERAL | NUMERIC_LITERAL ;

list : BRACKET_OPEN elementList? BRACKET_CLOSE ;

tuple : PAREN_OPEN elementList? PAREN_CLOSE ;

elementList : value (COMMA value)* ; 

value : STRING_LITERAL | NUMERIC_LITERAL | dict | list | tuple ;