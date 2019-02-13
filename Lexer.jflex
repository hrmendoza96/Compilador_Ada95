%%
%unicode
%class Lexer
%int
%standalone
%ignorecase 

/*Variables*/
signosPuntuacion = ","|";"|"."|":"|"'"|"!"|"?"|"¡"|"¿"|"_"|"-"|"{"|"}"|"["|"]"
signosEspeciales = "@" | "#" | "$" | "%" | "^" | "&" | "*" 
espacios = [" "\t\r\n]
guionBajo = [_]
guionesComentario = "--"
letras = [a-zA-Z] 
numeros = [0-9]
PARDER = [)]
PARIZQ = [(]
SEMICOLON = [;]
COMENTARIO = {guionesComentario}({letras} | {numeros} | " " | {signosPuntuacion} | {signosEspeciales} | {OPREL} | {PARDER} | {PARIZQ})*
NEWLINE = "\n"

/*Operaciones*/
DECLARACION = [:]
OPREL = "=" | "/=" | "<" | "<=" | ">" | ">="
AND = ("and")
OR = ("OR")
XOR = ("XOR")
NOT = ("NOT")
OPSUMA = "+" | "-"
OPMULTIPLICACION = "*" | "/"
MOD = ("mod")
/*EXPONENTES = {ASTERISCO}{ASTERISCO}*/


/*Decisiones*/
BEGIN = ("begin")
ELSE = ("else")
END = ("end")
ENDIF = ("end if")
IF = ("if")
THEN = ("then")
ELSIF = ("elsif")

/*Palabras Reservadas*/
GET = ("Get")
PUT_LINE = ("Put_Line")
PROCEDURE = ("Procedure")
USE = ("use")
WITH = ("with")
IS = ("is")

ABORT = ("abort")
ABS = ("abs")
ABSTRACT = ("abstract")
ACCEPT = ("accept")
ACCESS = ("access")
ALIASED = ("aliased")
ALL = ("all")
ARRAY = ("array")
AT = ("at")
BODY = ("body")
CASE = ("case")
CONSTANT = ("constant")
DECLARE = ("declare")
DELAY = ("delay")
DELTA = ("delta")
DIGITS = ("digits")
DO = ("do")
ENTRY = ("entry")
EXCEPTION = ("exception")
EXIT = ("exit")
FUNCTION = ("function")
GENERIC = ("generic")
GOTO = ("goto")
IN = ("in")
INTERFACE = ("interface")
LIMITED = ("limited")
NEW = ("new")
NULL = ("null")
OF = ("of")
OTHERS = ("others")
OUT = "OUT"
OVERRIDING = ("overriding")
PACKAGE = ("package")
PRAGMA = ("pragma")
PRIVATE = ("private")
PROTECTED = ("protected")
RAISE = ("raise")
RANGE = ("range")
RECORD = ("record")
REM = ("rem")
RENAMES = ("renames")
REQUEUE = ("requeue")
RETURN = ("return")
REVERSE = ("reverse")
SELECT = ("select")
SEPARATE = ("separate")
STRINGTYPE = ("String")
SUBTYPE = ("subtype")
SYNCHRONIZED = ("synchronized")
TAGGED = ("tagged")
TASK = ("task")
TERMINATE = ("terminate")
TYPE = ("type")
UNTIL = ("until")
WHEN = ("when")

/*For, While, Loop*/
FOR = ("for")
WHILE = ("while")
LOOP = ("loop")

/*Numeros*/
NUM = {numeros}+

/*Tipos*/
INTEGER = ("integer")
FLOAT = ("float")
BOOLEAN = ("boolean")
CHARACTER = ("character")


/*Strings y Chars*/
STRING ="\""({letras} | {numeros} | {espacios} | {signosPuntuacion} | {signosEspeciales} | {OPREL} | {PARDER} | {PARIZQ})*"\"" 
CHAR = "\'"({letras} | {numeros} | {espacios} | {signosPuntuacion} | {signosEspeciales} | {OPREL} | {PARDER} | {PARIZQ})"\'" 

/*Identificador*/
ID = {letras}+({guionBajo}({letras}|{numeros})+)*

/*Imports*/
IMPORT = "Ada."{letras}+({guionBajo}({letras}|{numeros})+)*{SEMICOLON}*


%%

<YYINITIAL> {

    {ABORT} {
        System.out.println("<ABORT>");
    }

    {ABS} {
        System.out.println("<ABS>");
    }
    {ABSTRACT} {
        System.out.println("<ABSTRACT>");
    }

    {ACCEPT} {
        System.out.println("<ACCEPT>");
    }

    {ACCESS} {
        System.out.println("<ACCESS>");
    }

    {ALIASED} {
        System.out.println("<ALIASED>");
    }

    {ALL} {
        System.out.println("<ALL>");
    }
    {ARRAY} {
        System.out.println("<ARRAY>");
    }

    {AT} {
        System.out.println("<AT>");
    }

    {BODY} {
        System.out.println("<BODY>");
    }

    {CASE} {
        System.out.println("<CASE>");
    }

    {CONSTANT} {
        System.out.println("<CONSTANT>");
    }

    {DECLARE} {
        System.out.println("<DECLARE>");
    }

    {DELAY} {
        System.out.println("<DELAY>");
    }

    {DELTA} {
        System.out.println("<DELTA>");
    }

    {DIGITS} {
        System.out.println("<DIGITS>");
    }

    {DO} {
        System.out.println("<DO>");
    }

    {ENTRY} {
        System.out.println("<ENTRY>");
    }

    {EXCEPTION} {
        System.out.println("<EXCEPTION>");
    }

    {EXIT} {
        System.out.println("<EXIT>");
    }
    
    {FUNCTION} {
        System.out.println("<FUNCTION>");
    } 

    {GENERIC} {
        System.out.println("<GENERIC>");
    }

    {GOTO} {
        System.out.println("<GOTO>");
    }

    {IN} {
        System.out.println("<IN>");
    }

    {INTEGER} {
        System.out.println("<INTEGER>");
    }

    {FLOAT} {
        System.out.println("<FLOAT>");
    }

    {BOOLEAN} {
        System.out.println("<BOOLEAN>");
    }

    {CHARACTER} {
        System.out.println("<CHARACTER>");
    }

    {INTERFACE} {
        System.out.println("<INTERFACE>");
    }

    {LIMITED} {
        System.out.println("<LIMITED>");
    }

    {MOD} {
        System.out.println("<MOD>");
    }

    {NEW} {
        System.out.println("<NEW>");
    }

    {NEWLINE} {
        System.out.println("<NEWLINE>");
    }

    {NULL} {
        System.out.println("<NULL>");
    }

    {OF} {
        System.out.println("<OF>");
    }

    {OTHERS} {
        System.out.println("<OTHERS>");
    }

    {OUT} {
        System.out.println("<OUT>");
    }

    {OVERRIDING} {
        System.out.println("<OVERRIDING>");
    }

    {PACKAGE} {
        System.out.println("<PACKAGE>");
    }

    {PRAGMA} {
        System.out.println("<PRAGMA>");
    }

    {PRIVATE} {
        System.out.println("<PRIVATE>");
    }

    {PROTECTED} {
        System.out.println("<PROTECTED>");
    }

    {RAISE} {
        System.out.println("<RAISE>");
    }
    
    {RANGE} {
        System.out.println("<RANGE>");
    }

    {RECORD} {
        System.out.println("<RECORD>");
    }

    {REM} {
        System.out.println("<REM>");
    }

    {RENAMES} {
        System.out.println("<RENAMES>");
    }

    {REQUEUE} {
        System.out.println("<REQUEUE>");
    }

    {RETURN} {
        System.out.println("<RETURN>");
    }

    {REVERSE} {
        System.out.println("<REVERSE>");
    }

    {SELECT} {
        System.out.println("<SELECT>");
    }

    {SEPARATE} {
        System.out.println("<SEPARATE>");
    }

    {SUBTYPE} {
        System.out.println("<SUBTYPE>");
    }
    
    {SYNCHRONIZED} {
        System.out.println("<SYNCHRONIZED>");
    }

    {TAGGED} {
        System.out.println("<TAGGED>");
    }
    
    {TASK} {
        System.out.println("<TASK>");
    }

    {TERMINATE} {
        System.out.println("<TERMINATE>");
    }

    {TYPE} {
        System.out.println("<TYPE>");
    } 

    {UNTIL} {
        System.out.println("<UNTIL>");
    }

    {FOR} {
        System.out.println("<FOR>");
    }

    {WHILE} {
        System.out.println("<WHILE>");
    }

    {LOOP} {
        System.out.println("<LOOP>");
    }

    {XOR} {
        System.out.println("XOR");
    }

    {NOT} {
        System.out.println("<NOT>");
    }

    {OR} {
        System.out.println("<OR>");
    }

    {AND} {
        System.out.println("<AND>");
    }

    {OPSUMA} {
        System.out.println("<OPSUMA>");
    }

    {OPMULTIPLICACION} {
        System.out.println("<OPMULTIPLICACION>");
    }

    {COMENTARIO} {
        System.out.println("<COMENTARIO, \""+yytext()+"\">");
    }

    {IMPORT} {
        System.out.println("<IMPORT, \""+yytext()+"\">");
    }

    {IS} {
        System.out.println("<IS>");
    }

    {BEGIN} {
        System.out.println("<BEGIN>");
    }

    {OPREL} {
        System.out.println("<OPERADOR RELACIONAL, \""+yytext()+"\">");
    }

    {DECLARACION} {
        System.out.println("<DECLARACION>");
    }

    {IF} {
        System.out.println("<IF>");
    }

    {ELSIF} {
        System.out.println("<ELSIF>");
    }

    {ELSE} {
        System.out.println("<ELSE>");
    }

    {END} {
        System.out.println("<END>");
    }

    {ENDIF} {
        System.out.println("<ENDIF>");
    }

    {GET} {
        System.out.println("<GET>");
    }
    
    
    {PARDER} {
        System.out.println("<PARDER>");
    }
    
    {PARIZQ} {
        System.out.println("<PARIZQ>");
    }
    
    {PUT_LINE} {
        System.out.println("<PUT_LINE>");
    }

    {PROCEDURE} {
        System.out.println("<PROCEDURE>");
    }

    {SEMICOLON} {
        System.out.println("<SEMICOLON>");
    }

    {signosEspeciales} {
        System.out.println("<SIGNO ESPECIAL, " + yytext() + ">");
    }

    {signosPuntuacion} {
        System.out.println("<SIGNO PUNTUACION, " + yytext() + ">");
    }

    {THEN} {
        System.out.println("<THEN>");
    }

    {USE} {
        System.out.println("<USE>");
    }

    {WHEN} {
        System.out.println("<WHEN>");
    }

    {WITH} {
        System.out.println("<WITH>");
    }

    {NUM} {
        System.out.println("<NUM, \""+yytext()+"\">");
    }

    {STRINGTYPE} {
        System.out.println("<STRING>");
    }

    {ID} {
        System.out.println("<ID, \""+yytext()+"\">");
    }

    {STRING} {
        System.out.println("<STRING, "+yytext()+">");
    }

    {CHAR} {
        System.out.println("<CHAR, "+yytext()+">");
    }

    {espacios} {}

    . {
        System.out.println("-----------ERROR: [\""+yytext()+"\"]");
    }
}