class Condicion {

    public Condicion() {

    }

    public static Nodo MetodoAnd(Nodo hijo1, String operador, Nodo M, Nodo hijo2){
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("condicion", Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoAnd = new Nodo("AND", operador, Temporales.cont);
        Temporales.cont++;


        /*Se añaden los hijos*/
        nodo.AddHijo(hijo1);
        nodo.AddHijo(nodoAnd);
        nodo.AddHijo(hijo2);

        Backpatching.completa(hijo1.listaVerdadera, M.lineaCuadruplo);
        nodo.listaVerdadera = hijo2.listaVerdadera;
        nodo.listaFalsa = Backpatching.fusion(hijo1.listaFalsa, hijo2.listaFalsa);

        return nodo;


    }

    public static Nodo MetodoOr(){
        Nodo nodo = new Nodo();
        return nodo;
    }

}