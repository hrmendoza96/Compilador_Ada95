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

/*Operaciones*/
DECLARACION = [:]
OPREL = "=" | "/=" | "<" | "<=" | ">" | ">="
AND = ("and")
OR = ("OR")
XOR = ("XOR")
NOT = ("NOT")
SUMA = "+"
RESTA = "-"
MULTIPLICACION = "*"
DIVISION = "/"
/*EXPONENTES = {ASTERISCO}{ASTERISCO}*/


/*Decisiones*/
BEGIN = ("begin")
ELSE = ("else")
END = ("end")
ENDIF = ("end if")
IF = ("if")
THEN = ("then")

/*Palabras Reservadas*/
GET = ("Get")
PUT_LINE = ("Put_Line")
PROCEDURE = ("Procedure")
USE = ("use")
WITH = ("with")
IS = ("is")

/*Numeros*/
NUM = {numeros}+

/*Strings y Chars*/
STRING ="\""({letras} | {numeros} | {espacios} | {signosPuntuacion} | {signosEspeciales} | {OPREL} | {PARDER} | {PARIZQ})*"\"" 
CHAR = "\'"({letras} | {numeros} | {espacios} | {signosPuntuacion} | {signosEspeciales} | {OPREL} | {PARDER} | {PARIZQ})"\'" 

/*Identificador*/
ID = {letras}+({guionBajo}({letras}|{numeros})+)*

/*Imports*/
IMPORT = "Ada."{letras}+({guionBajo}({letras}|{numeros})+)*{SEMICOLON}*


%%

<YYINITIAL> {

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

    {DIVISION} {
        System.out.println("<DIVISION>");
    }

    {RESTA} {
        System.out.println("<RESTA>");
    }

    {SUMA} {
        System.out.println("<SUMA>");
    }

    {MULTIPLICACION} {
        System.out.println("<MULTIPLICACION>");
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

    {THEN} {
        System.out.println("<THEN>");
    }

    {USE} {
        System.out.println("<USE>");
    }

    {WITH} {
        System.out.println("<WITH>");
    }

    {NUM} {
        System.out.println("<NUM, \""+yytext()+"\">");
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