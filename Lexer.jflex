import java_cup.runtime.*;

%%

%cup
%unicode
%class Lexer
%int
%line
%column
%standalone
%ignorecase 
%eofval{
	return new Symbol(sym.EOF,new String("Fin del archivo"));
%eofval}

// Caracteres
letras = [a-zA-Z] 
numeros = [0-9]
espacios = \t|" "|\f|\r|\n
signosEspeciales = ","|";"|"."|":"|"'"|"!"|"?"|"¡"|"¿"|"_"|"-"|"{"|"}"|"["|"]"|"@"|"#"|"$"|"%"|"^"|"&"|"*" 
guionBajo = "_"
signoNegativo = "-"
guionesComentario = "--"
punto = "."

// Delimitadores
ASIGNACION = ":="
DECLARACION = ":"
OPREL = "="|"/="|"<"|"<="|">"|">="
OPMULTIPLICACION = "*" | "/"
OPSUMA = "+" | "-"
PARIZQ = "("
PARDER = ")"
SEMICOLON = ";"
COMA = ","
CAJA = "<>"
DOSPUNTOS = ".."

// Identificador
ID = {letras}+({guionBajo}({letras}|{numeros})+)*

// Para los numeros
NUM= ({signoNegativo}|""){numeros}+(({punto}{numeros}+)|"")
//MOD = ("mod")
//EXPONENTES = "**"

// Para los comentarios
COMENTARIO = {guionesComentario}({letras}|{numeros}|" "|{signosEspeciales}|{OPREL}|{PARDER}|{PARIZQ})*

// Para los Strings y Chars
STRING ="\""({letras}|{numeros}|{espacios}|{signosEspeciales}|{OPREL}|{PARDER}|{PARIZQ})*"\"" 
CHAR = "\'"({letras}|{numeros}|" "|{signosEspeciales}|"="|">"|"<"|{PARDER}|{PARIZQ})"\'" 

// Tipos de variables
BOOLEAN = ("boolean")
CHARACTER = ("character")
FLOAT = ("float")
INTEGER = ("integer")

// Operaciones
AND = ("and")
OR = ("OR")
XOR = ("XOR")


// Decisiones
BEGIN = ("begin")
ELSE = ("else")
END = ("end")
IF = ("if")
THEN = ("then")
ELSIF = ("elsif")

// Palabras Reservadas
ARRAY = ("array")
CONSTANT = ("constant")
EXIT = ("exit")
FUNCTION = ("function")
GET = ("Get")
PUT = ("put")
IN = ("in")
IS = ("is")
NULL = ("null")
OUT = ("OUT")
RANGE = ("range")
PROCEDURE = ("Procedure")
PUT_LINE = ("Put_Line")
RETURN = ("return")
STRINGTYPE = ("String")
TRUE = ("true")
FALSE = ("false")
WHEN = ("when")
OF = ("of")

// For, While y Loop
FOR = ("for")
WHILE = ("while")
LOOP = ("loop")

%%

<YYINITIAL> {

    {PROCEDURE} { return new Symbol(sym.PROCEDURE, yycolumn, yyline, yytext()); }  
    {FUNCTION} { return new Symbol(sym.FUNCTION, yycolumn, yyline, yytext()); } 
    {RETURN} { return new Symbol(sym.RETURN, yycolumn, yyline, yytext()); }
    {ARRAY} { return new Symbol(sym.ARRAY, yycolumn, yyline, yytext()); }
    {CONSTANT} { return new Symbol(sym.CONSTANT, yycolumn, yyline, yytext()); }
    {IS} { return new Symbol(sym.IS, yycolumn, yyline, yytext()); }
    {BEGIN} { return new Symbol(sym.BEGIN, yycolumn, yyline, yytext()); }
    {END} { return new Symbol(sym.END, yycolumn, yyline, yytext()); }
    {IF} { return new Symbol(sym.IF, yycolumn, yyline, yytext()); }
    {THEN} { return new Symbol(sym.THEN, yycolumn, yyline, yytext()); } 
    {ELSE} { return new Symbol(sym.ELSE, yycolumn, yyline, yytext()); }
    {ELSIF} { return new Symbol(sym.ELSIF, yycolumn, yyline, yytext()); }
    {FOR} { return new Symbol(sym.FOR, yycolumn, yyline, yytext()); }
    {IN} { return new Symbol(sym.IN, yycolumn, yyline, yytext()); }
    {OUT} { return new Symbol(sym.OUT, yycolumn, yyline, yytext()); }
    {WHILE} { return new Symbol(sym.WHILE, yycolumn, yyline, yytext()); }
    {LOOP} { return new Symbol(sym.LOOP, yycolumn, yyline, yytext()); }
    {AND} { return new Symbol(sym.AND, yycolumn, yyline, yytext()); }
    {OR} { return new Symbol(sym.OR, yycolumn, yyline, yytext()); }
    {XOR} { return new Symbol(sym.XOR, yycolumn, yyline, yytext()); }
    {FALSE} { return new Symbol(sym.FALSE, yycolumn, yyline, yytext()); }
    {TRUE} { return new Symbol(sym.TRUE, yycolumn, yyline, yytext()); }
    {EXIT} { return new Symbol(sym.EXIT, yycolumn, yyline, yytext()); }
    {WHEN} { return new Symbol(sym.WHEN, yycolumn, yyline, yytext()); }
    {NULL} { return new Symbol(sym.NULL, yycolumn, yyline, yytext()); }
    {RANGE} { return new Symbol(sym.RANGE, yycolumn, yyline, yytext()); }
    {OF} { return new Symbol(sym.OF, yycolumn, yyline, yytext()); }


    {GET} { return new Symbol(sym.GET, yycolumn, yyline, yytext()); }
    {PUT} { return new Symbol(sym.PUT, yycolumn, yyline, yytext()); }
    {PUT_LINE} { return new Symbol(sym.PUT_LINE, yycolumn, yyline, yytext()); }

    {INTEGER} { return new Symbol(sym.INTEGER, yycolumn, yyline, yytext()); }
    {FLOAT} { return new Symbol(sym.FLOAT, yycolumn, yyline, yytext()); }
    {BOOLEAN} { return new Symbol(sym.BOOLEAN, yycolumn, yyline, yytext()); }
    {CHARACTER} { return new Symbol(sym.CHARACTER, yycolumn, yyline, yytext()); }
    {STRINGTYPE} { return new Symbol(sym.STRINGTYPE, yycolumn, yyline, yytext()); }

    {ASIGNACION} { return new Symbol(sym.ASIGNACION, yycolumn, yyline, yytext()); }
    {DECLARACION} { return new Symbol(sym.DECLARACION, yycolumn, yyline, yytext()); }
    {OPREL} { return new Symbol(sym.OPREL, yycolumn, yyline, yytext()); }
    {OPMULTIPLICACION} { return new Symbol(sym.OPMULTIPLICACION, yycolumn, yyline, yytext()); }
    {OPSUMA} { return new Symbol(sym.OPSUMA, yycolumn, yyline, yytext()); }
    {PARDER} { return new Symbol(sym.PARDER, yycolumn, yyline, yytext()); }
    {PARIZQ} { return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext()); }
    {CAJA} { return new Symbol(sym.OPREL, yycolumn, yyline, yytext()); }
    {SEMICOLON} { return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext()); }
    {COMA} { return new Symbol(sym.COMA, yycolumn, yyline, yytext()); }
    {DOSPUNTOS} { return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext()); }
    
    {ID} { return new Symbol(sym.ID, yycolumn, yyline, yytext()); }
    {STRING} { return new Symbol(sym.STRING, yycolumn, yyline, yytext()); }
    {CHAR} { return new Symbol(sym.CHAR, yycolumn, yyline, yytext()); }
    {NUM} { return new Symbol(sym.NUM, yycolumn, yyline, yytext()); }
    {COMENTARIO} {}
    {espacios} {}

    . { System.out.println("-----------ERROR: [\""+yytext()+"\"] Line:["+ yyline + "], Column:[" + yycolumn+"]"); }
}