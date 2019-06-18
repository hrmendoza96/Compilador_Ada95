class Loop {

    public Loop() {

    }

    public static Nodo MetodoLoop(Nodo hijo1, Nodo hijo2) {
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_loop", Temporales.cont);
        Temporales.cont++;

        /*Se añaden los hijos*/
        nodo.AddHijo(hijo1);
        nodo.AddHijo(hijo2);

        
        
        return nodo;
    }

}