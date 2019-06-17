class ExpresionBooleana {

    public ExpresionBooleana() {

    }

    public static Nodo MetodoExpresionBooleana(Nodo hijo1, String oprel, Nodo hijo2) {
       /*Se crea el nodo prinicipal*/
       Nodo nodo = new Nodo("expresion_booleana", Temporales.cont);
       Temporales.cont++;

       /*Nuevo Nodo: TERMINAL*/
       Nodo nodoOPREL = new Nodo("OPREL", oprel, Temporales.cont);
       Temporales.cont++;

       /*Se añaden los hijos*/
       nodo.AddHijo(hijo1);
       nodo.AddHijo(nodoOPREL);
       nodo.AddHijo(hijo2);
       nodo.arg1 = hijo1.value;
       nodo.arg2 = hijo2.value;
       nodo.auxValores = oprel;

       nodo.listaVerdadera = Backpatching.crearLista(TablaCuadruplos.tablaCuadruplos.size());
       nodo.listaFalsa = Backpatching.crearLista(TablaCuadruplos.tablaCuadruplos.size() + 1);

       TablaCuadruplos.gen("if"+oprel,nodo.arg1,nodo.arg2,"");
       TablaCuadruplos.gen("GOTO","","","");

        return nodo;
    }

}