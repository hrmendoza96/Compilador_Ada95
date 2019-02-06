%%
%unicode
%class Lexer
%int
%standalone
%ignorecase 

/*Variables*/
espacio = [ ]
guionBajo = [_]
letras = [a-zA-Z]
numeros = [0-9]
PARDER = [)]
PARIZQ = [(]
SEMICOLON = [;]

/*Operaciones*/
DECLARACION = [:]
op_rel = "=" | "/=" | "<" | "<=" | ">" | ">="

/*Decisiones*/
BEGIN = ("begin")
ELSE = ("else")
END = ("end")
ENDIF = ("end if")
IF = ("if")
THEN = ("then")

/*Metodos predefinidos*/
GET = ("Get")
PUT_LINE = ("Put_Line")
PROCEDURE = ("Procedure")
USE = ("use")
WITH = ("with")
%%

<YYINITIAL> {

    {BEGIN} {
        System.out.println("<BEGIN>");
    }

    {op_rel} {
        System.out.println("<OPERACION RELACIONAL>");
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

    . {}
}