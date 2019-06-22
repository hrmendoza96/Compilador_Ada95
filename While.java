import java.util.*;

class While {

    public While() {

    }

    public static Nodo MetodoWhile(Nodo hijo1, Nodo M1, Nodo hijo2, Nodo M2) {
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_while", Temporales.cont);
        Temporales.cont++;

        nodo.AddHijo(hijo1);
        nodo.AddHijo(hijo2);

        Backpatching.completa(hijo1.listaVerdadera, M2.lineaCuadruplo);
        TablaCuadruplos.gen("GOTO", "", "", "_etiq"+ M1.lineaCuadruplo + "");
        Backpatching.completa(hijo2.listaSiguiente, M1.lineaCuadruplo);
        nodo.listaSiguiente = hijo1.listaFalsa;

        return nodo;
    }

}

// | WHILE error condicion:child1 LOOP M:childM2 codigo:child2 END LOOP SEMICOLON
// | WHILE condicion:child1 error codigo:child2 salir_ciclo:child3 SEMICOLON END LOOP SEMICOLON
// | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 error END LOOP SEMICOLON
// | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 SEMICOLON error LOOP SEMICOLON
// | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 SEMICOLON END error SEMICOLON
// | WHILE condicion:child1 LOOP codigo:child2 salir_ciclo:child3 SEMICOLON END LOOP error