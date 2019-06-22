class Loop {

    public Loop() {

    }

    public static Nodo MetodoLoop(Nodo S, Nodo m1, Nodo m2, Nodo E) { //NOTA: S es codigo y E es condicion 
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_loop", Temporales.cont);
        Temporales.cont++;

        /*Se añaden los hijos*/
        nodo.AddHijo(S);
        nodo.AddHijo(E);

        Backpatching.completa(E.listaFalsa, m1.lineaCuadruplo);
        nodo.listaSiguiente = E.listaVerdadera;
        Backpatching.completa(S.listaSiguiente, m2.lineaCuadruplo);


        return nodo;
    }

}