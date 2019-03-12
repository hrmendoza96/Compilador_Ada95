%%
%unicode
%class Lexer
%int
%line
%column
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
NOT = ("NOT")
OPSUMA = "+" | "-"
OPMULTIPLICACION = "*" | "/"
MOD = ("mod")
EXPONENTES = "**"


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
PUT = ("put")
PUT_LINE = ("Put_Line")
PROCEDURE = ("Procedure")
IS = ("is")
ARRAY = ("array")
CONSTANT = ("constant")
DECLARE = ("declare")
DO = ("do")
EXIT = ("exit")
FUNCTION = ("function")
IN = ("in")
NULL = ("null")
OUT = "OUT"
PRIVATE = ("private")
PROTECTED = ("protected")
RETURN = ("return")
STRINGTYPE = ("String")

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




%%

<YYINITIAL> {
    {ARRAY} {
        System.out.println("<ARRAY>");
    }

    {CONSTANT} {
        System.out.println("<CONSTANT>");
    }

    {DECLARE} {
        System.out.println("<DECLARE>");
    }

    {DO} {
        System.out.println("<DO>");
    }

    {EXIT} {
        System.out.println("<EXIT>");
    }
    
    {FUNCTION} {
        System.out.println("<FUNCTION>");
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

    {MOD} {
        System.out.println("<MOD>");
    }


    {NEWLINE} {
        System.out.println("<NEWLINE>");
    }

    {NULL} {
        System.out.println("<NULL>");
    }
   
    {OUT} {
        System.out.println("<OUT>");
    }

    {PRIVATE} {
        System.out.println("<PRIVATE>");
    }

    {PROTECTED} {
        System.out.println("<PROTECTED>");
    }


    {RETURN} {
        System.out.println("<RETURN>");
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

    {EXPONENTES} {
        System.out.println("<EXPONENTE>");
    }

    {OPMULTIPLICACION} {
        System.out.println("<OPMULTIPLICACION>");
    }

    {COMENTARIO} {
        System.out.println("<COMENTARIO, \""+yytext()+"\">");
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

    {PUT} {
        System.out.println("<PUT>");
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

    {NUM} {
        System.out.println("<NUM, \""+yytext()+"\">");
    }

    {espacios} {}

    . {
        System.out.println("-----------ERROR: [\""+yytext()+"\"] Line:["+ yyline + "], Column:[" + yycolumn+"]");
    }
}