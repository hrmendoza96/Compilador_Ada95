import java.util.*;

class While {

    public While() {

    }

    public static Nodo MetodoWhile(Nodo hijo1) {
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_while", Temporales.cont);
        Temporales.cont++;

        /*Se añaden los hijos*/
        nodo.AddHijo(hijo1);

        String tempEtiq = "_etiq"+Temporales.contEtiq;
        TablaCuadruplos.gen("IF"+hijo1.auxValores,hijo1.arg1,hijo1.arg2,tempEtiq);
        Temporales.contEtiq++;
        tempEtiq = "_etiq";
        tempEtiq = tempEtiq + Temporales.contEtiq;

        TablaCuadruplos.gen("GOTO","","",tempEtiq);

        tempEtiq = "_etiq";
        tempEtiq = tempEtiq +(Temporales.contEtiq-=1);
        TablaCuadruplos.gen("ETIQ","","",tempEtiq);
        Temporales.contEtiq++;

        return nodo;
    }
/* Producciones error de while, causan problema
    | WHILE condicion:child1 error codigo:child2 salir_ciclo:child3 SEMICOLON END LOOP SEMICOLON
    | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 error END LOOP SEMICOLON
    | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 SEMICOLON error LOOP SEMICOLON
    | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 SEMICOLON END error SEMICOLON
    | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 SEMICOLON END LOOP error
*/
}