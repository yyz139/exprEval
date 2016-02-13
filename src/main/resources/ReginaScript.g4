grammar ReginaScript;

//expressionSequence
// : singleExpression ( ',' singleExpression )*
// ;

singleExpression
 : singleExpression '[' singleExpression ']'                     #MemberIndexExpression
 | singleExpression op = '.' identifierName                             #MemberDotExpression
 | op = '+' singleExpression                                            #UnaryPlusExpression
 | op = '-' singleExpression                                            #UnaryMinusExpression
 | op = '!' singleExpression                                            #NotExpression
 | singleExpression op = ('*' | '/' | '%') singleExpression             #MultiplicativeExpression
 | singleExpression op = ('+' | '-' ) singleExpression                  #AdditiveExpression
 | singleExpression op = ('<' | '>' | '<=' | '>=' ) singleExpression    #RelationalExpression
 | singleExpression op = ('==' | '!=' ) singleExpression                #EqualityExpression
 | singleExpression op = '&&' singleExpression                          #LogicalAndExpression
 | singleExpression op = '||' singleExpression                          #LogicalOrExpression
 | singleExpression op = '?' singleExpression ':' singleExpression      #TernaryExpression
 | Identifier                                                      #IdentifierExpression
 | literal                                                  #LiteralExpression
 | '(' singleExpression ')'                                      #ParenthesizedExpression
 ;

literal
 : ( BooleanLiteral
   | StringLiteral
   )
   | numericLiteral
 ;

numericLiteral
 : DecimalLiteral
 | HexIntegerLiteral
 | OctalIntegerLiteral
 ;

identifierName
 : Identifier
 | reservedWord
 ;

reservedWord
 : keyword
 | futureReservedWord
 | BooleanLiteral
 ;

keyword
 : Data
 | UUID
 | Online
 ;

Identifier
 : IdentifierStart IdentifierPart*
 ;

BooleanLiteral
 : 'true'
 | 'false'
 ;

DecimalLiteral
 : DecimalIntegerLiteral '.' DecimalDigit* ExponentPart?
 | DecimalIntegerLiteral ExponentPart?
 ;

HexIntegerLiteral
 : '0' [xX] HexDigit+
 ;

OctalIntegerLiteral
 : '0' OctalDigit+
 ;

StringLiteral
 : '"' DoubleStringCharacter* '"'
 ;

Data
 : 'data'
 ;

UUID
 : 'uuid'
 ;

Online
 : 'online'
 ;

OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
Colon                      : ':';
Dot                        : '.';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
RightShiftArithmetic       : '>>';
LeftShiftArithmetic        : '<<';
RightShiftLogical          : '>>>';
LessThan                   : '<';
MoreThan                   : '>';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals                     : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';

fragment DoubleStringCharacter
 : ~["\\\r\n]
 | '\\' EscapeSequence
 ;

fragment EscapeSequence
 : CharacterEscapeSequence
 | '0'
 ;

fragment CharacterEscapeSequence
 : SingleEscapeCharacter
 ;

fragment SingleEscapeCharacter
 : ['"\\bfnrtv]
 ;

fragment IdentifierStart
 : [a-zA-Z]
 ;

fragment IdentifierPart
 : [0-9a-zA-Z]
 ;

fragment ExponentPart
 : [eE] [+-]? DecimalDigit+
 ;

fragment DecimalDigit
 : [0-9]
 ;

fragment HexDigit
 : [0-9a-fA-F]
 ;

fragment OctalDigit
 : [0-7]
 ;

fragment DecimalIntegerLiteral
 : '0'
 | [1-9] DecimalDigit*
 ;

futureReservedWord: '';

WS : [ \t\r\n]+ -> skip;