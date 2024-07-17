grammar AntlrProject;

//Parser


s: immport* statement;

statement:(variable|experssion|BREAK|if|while|dowhile|for|switchcase|class|arrow|function|exception|call|STRINGVALUE (DOUBLE_PLUS| DOUBLE_MINUS) )*;


immport:
        IMPORT (DOUBLE_COLON|COLON COLON) FROM LPAREN (STRINGVALUE DOT STRINGVALUE  |STRINGVALUE  DOT STRINGVALUE  COMMA STRINGVALUE  DOT STRINGVALUE ) RPAREN|
        REQUIRE LPAREN (STRINGVALUE |STRINGVALUE COMMA STRINGVALUE)  RPAREN;


experssion:
              LPAREN experssion? RPAREN| experssion LPAREN experssion RPAREN |experssion DOUBLE_STAR experssion|TILDE experssion|( PLUS| MINUS) experssion|
              experssion (DOUBLE_PLUS| DOUBLE_MINUS) |(DOUBLE_PLUS| DOUBLE_MINUS) experssion |experssion(STAR | SLASH | DOUBLE_SLASH | PERCENT) experssion|experssion( PLUS| MINUS) experssion|experssion (LEFT_SHIFT|RIGHT_SHIFT)experssion|
              experssion(AMPERSAND|PIPE|CARET) experssion|experssion(DOUBLE_EQUAL|NOT_EQUAL)experssion|experssion(SMALLER|GREATER|SMALLEREQ|GREATEREQ)experssion|THIS DOT experssion|experssion experssion|EX_MARK experssion|experssion(AND | OR)experssion|
              experssion(EQUALS|EQPLUS|EQMINUS|STAR_EQUAL|SLASH_EQUAL)experssion|INTVALUE|FLOATVALUE|TRUE|FALSE|STRINGVALUE;


variable:
        (PUBLIC|PRIVATE)? CONST? (INT|FLOAT|BOOL|STRING) (STRINGVALUE (COMMA| ))+ (SMALLEREQ)? (experssion(COMMA| ))*;

array:
    (PUBLIC|PRIVATE)? CONST? (INT|FLOAT|BOOL|STRING) STRINGVALUE NEW LBRACK RBRACK SMALLEREQ (INT|FLOAT|BOOL|STRING) LBRACK INTVALUE RBRACK|
    (PUBLIC|PRIVATE)? CONST? (INT|FLOAT|BOOL|STRING) STRINGVALUE LBRACK RBRACK SMALLEREQ LBRACK (experssion(COMMA| ))* RBRACK
    ;



 if:
    IF LBRACK experssion RBRACK

    THEN

    statement?
    BREAK?(RETURN experssion)?

    ELSE?

    statement?
    BREAK?(RETURN experssion)?

    FI

    ;

while:
    WHILE LBRACK experssion RBRACK
    DO
    statement
    BREAK? (RETURN experssion)?
    DONE
    ;

dowhile:
    DO
    statement
    BREAK?(RETURN experssion)?
    ASLONGAS LBRACK experssion RBRACK;

for:
    FOR DOUBLE_LPAREN ((INT|FLOAT|BOOL|STRING) (STRINGVALUE (COMMA| ))+ EQUALS (experssion(COMMA| ))*)? SEMI experssion SEMI (experssion(COMMA| ))* DOUBLE_RPAREN

    DO

    statement

    BREAK?(RETURN experssion)?

    DONE

    ;

switchcase:
        CASE experssion (WHEN WORD statement)+
        (ELSE statement)?
         END ;


function:
        STRINGVALUE ARROW PRIVACY? FUNCTION LPAREN ((INT|FLOAT|BOOL|STRING|ARRAY) COLON STRINGVALUE (COMMA| ))* RPAREN COLON
        statement
        END
        ;

call:
    ATSIGN (STRINGVALUE|WORD) LPAREN ((WORD COMMA (STRINGVALUE)?(COMMA| ))*) RPAREN;

class:
    (PUBLIC|PRIVATE) CLASS STRINGVALUE INHERITED FROM (STRINGVALUE(COMMA| ))+
    CONSTRUCTOR STRINGVALUE ARROW FUNCTION LPAREN ((INT|FLOAT|BOOL|STRING|ARRAY)  (STRINGVALUE (COMMA| ))*) RPAREN COLON

    statement

    END


    END_CLASS

    ;

arrow:
     (PUBLIC|PRIVATE)? STRINGVALUE  STRINGVALUE ARROW NEW STRINGVALUE LBRACK (STRINGVALUE (COMMA| ))+ RBRACK;

exception:
    TRY COLON
        statement
    EXCEPT (STRINGVALUE (COMMA| ))+ COLON
    statement
    ;





//LETTERS & DIGITS
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];



//Lexer
//Key Words

WS: [ \t\r\n] -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip;

PUBLIC: 'public';
PRIVATE:'private';
IMPORT :'import';
REQUIRE:'require';
FROM : 'from';
FOR : 'for';
AS :'as';
CONST:'const';
IN:'in';
OF :'of';
WHILE : 'while';
DO : 'do';
IF:'If';
ELSE:'else';
RETURN:'return';
SWITCH:'switch';
MATCH:'match';
CASE:'case';
BREAK:'break';
DEFAULT:'default';
CLASS:'class';
CONSTRUCTOR:'constructor';
THIS:'this';
FUNCTION: 'function';
TRY:'try';
EXCEPT:'except';
FI:'Fi';
INT:'int';
FLOAT:'float';
BOOL:'bool';
STRING:'string';
TRUE:'true';
FALSE:'false';
NEW:'new';
THEN:'Then';
DONE:'done';
ASLONGAS:'as_long_as';
SEMI:';';
WHEN:'when';
END:'end';
INHERITED:'Inherited';
END_CLASS:'end_class';





//Character
ATSIGN: '@';
DOLLAR:'$';
QUESTIONMARK:'?';
ARROW:'<-';
HASHTAG:'#';

//Operators
LPAREN : '(';
RPAREN : ')';
DOUBLE_LPAREN:'((';
DOUBLE_RPAREN:'))';



CARET: '^';


DOUBLE_PLUS: '++' ;
DOUBLE_MINUS: '--' ;


LEFT_SHIFT: '<<';
RIGHT_SHIFT: '>>';


PLUS: '+' ;
MINUS: '-' ;
SLASH: '/' ;
DOUBLE_SLASH: '//' ;
PERCENT: '%' ;
DOUBLE_STAR: '**' ;
STAR : '*';


AMPERSAND: '&';
AND: '&&';
PIPE: '|';
OR: '||';
EX_MARK: '!';


SMALLER: '<' ;
GREATER: '>' ;
SMALLEREQ:'<=';
GREATEREQ:'>=' ;
NOT_EQUAL: '!=' | '<>' ;
DOUBLE_EQUAL:'==';
EQPLUS:'+=';
EQMINUS:'-=';
STAR_EQUAL:'*=';
SLASH_EQUAL:'/=';
EQUALS: '=' ;

COMMA : ',';
DOT : '.';
COLON:':';
DOUBLE_COLON:'::';
UNDERSCORE: '_' ;
DOUBLEQ: '"';


LBRACK : '[';
RBRACK :']';
LCURLY : '{';
RCURLY : '}';
TILDE: '~' ;


//var types
STRINGVALUE:LETTER (LETTER | DIGIT | DOLLAR | UNDERSCORE)*;

INTVALUE: DIGIT+ ;

FLOATVALUE: DIGIT+ DOT? DIGIT+;

WORD:DOUBLEQ (LETTER| DIGIT|'*'|'@'|'#'|'%'|'&'|'.'|'’'|' '|'<'|'<='|'!'|'?')+ DOUBLEQ;

ARRAY:(INT|FLOAT|BOOL|STRING) LBRACK RBRACK;