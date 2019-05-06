import java_cup.runtime.*;
import java.util.ArrayList;

%%

%cup
%unicode
%class Lexer
%int
%line
%column
%standalone
%ignorecase 

%{
    public static ArrayList<String> ErroresLexicos = new ArrayList<String>();    
%}


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
DOSPUNTOS = ".."

// Identificador
ID = {letras}+({guionBajo}({letras}|{numeros})+)*

// Para los numeros
NUM= ({signoNegativo}|""){numeros}+(({punto}{numeros}+)|"")

// Para los comentarios
COMENTARIO = {guionesComentario}({letras}|{numeros}|" "|{signosEspeciales}|{OPREL}|{PARDER}|{PARIZQ})*

// Para los Strings
STRING ="\""({letras}|{numeros}|{espacios}|{signosEspeciales}|{OPREL}|{PARDER}|{PARIZQ})*"\"" 

// Tipos de variables
BOOLEAN = ("boolean")
FLOAT = ("float")
INTEGER = ("integer")
STRINGTYPE = ("String")

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
CONSTANT = ("constant")
EXIT = ("exit")
FUNCTION = ("function")
GET = ("Get")
PUT = ("put")
IN = ("in")
IS = ("is")
NULL = ("null")
OUT = ("OUT")
PROCEDURE = ("Procedure")
RETURN = ("return")
TRUE = ("true")
FALSE = ("false")
WHEN = ("when")

// For, While y Loop
FOR = ("for")
WHILE = ("while")
LOOP = ("loop")

%%

<YYINITIAL> {

    {PROCEDURE} { return new Symbol(sym.PROCEDURE, yycolumn, yyline, yytext()); }  
    {FUNCTION} { return new Symbol(sym.FUNCTION, yycolumn, yyline, yytext()); } 
    {RETURN} { return new Symbol(sym.RETURN, yycolumn, yyline, yytext()); }
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

    {GET} { return new Symbol(sym.GET, yycolumn, yyline, yytext()); }
    {PUT} { return new Symbol(sym.PUT, yycolumn, yyline, yytext()); }

    {INTEGER} { return new Symbol(sym.INTEGER, yycolumn, yyline, yytext()); }
    {FLOAT} { return new Symbol(sym.FLOAT, yycolumn, yyline, yytext()); }
    {BOOLEAN} { return new Symbol(sym.BOOLEAN, yycolumn, yyline, yytext()); }
    {STRINGTYPE} { return new Symbol(sym.STRINGTYPE, yycolumn, yyline, yytext()); }

    {ASIGNACION} { return new Symbol(sym.ASIGNACION, yycolumn, yyline, yytext()); }
    {DECLARACION} { return new Symbol(sym.DECLARACION, yycolumn, yyline, yytext()); }
    {OPREL} { return new Symbol(sym.OPREL, yycolumn, yyline, yytext()); }
    {OPMULTIPLICACION} { return new Symbol(sym.OPMULTIPLICACION, yycolumn, yyline, yytext()); }
    {OPSUMA} { return new Symbol(sym.OPSUMA, yycolumn, yyline, yytext()); }
    {PARDER} { return new Symbol(sym.PARDER, yycolumn, yyline, yytext()); }
    {PARIZQ} { return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext()); }
    {SEMICOLON} { return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext()); }
    {COMA} { return new Symbol(sym.COMA, yycolumn, yyline, yytext()); }
    {DOSPUNTOS} { return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext()); }
    
    {ID} { return new Symbol(sym.ID, yycolumn, yyline, new String(yytext())); }
    {STRING} { return new Symbol(sym.STRING, yycolumn, yyline, new String(yytext())); }
    {NUM} { return new Symbol(sym.NUM, yycolumn, yyline, new String(yytext())); }
    {COMENTARIO} {}
    {espacios} {}

    . { System.out.println("Error lexico : " + yytext() + " en la linea: " + (yyline+1) + " y columna " + (yycolumn+1));
        ErroresLexicos.add("Error lexico : " + yytext() + " en la linea: " + (yyline+1) + " y columna " + (yycolumn+1));
     }
}