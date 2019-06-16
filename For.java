class For {

    public For() {

    }

    public static Nodo MetodoFor(Nodo hijo1, String n1, String n3, String n5) {
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_for", Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoId = new Nodo("ID", n1.toString(), Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoNum = new Nodo("NUM", n3.toString(), Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoNum2 = new Nodo("NUM",n5.toString(), Temporales.cont);
        Temporales.cont++;
        
        TablaCuadruplos.gen(":=",n3,"",n1);

        String tempEtiq = "_etiq"+Temporales.contEtiq;

        // Condicion etiq0
        TablaCuadruplos.gen("ETIQ","","",tempEtiq);
        Temporales.contEtiq++;
        tempEtiq = "_etiq";
        tempEtiq = tempEtiq + Temporales.contEtiq;

        // Condicion como tal y salta al codigo
        TablaCuadruplos.gen("IF<=",n1,n5,tempEtiq);

        Temporales.contEtiq++;
        tempEtiq = "_etiq";
        tempEtiq = tempEtiq + Temporales.contEtiq;

        // Salta fuera del loop
        TablaCuadruplos.gen("GOTO","","",tempEtiq);

        // Etiqueta del codigo
        tempEtiq = "_etiq";
        tempEtiq = tempEtiq +(Temporales.contEtiq-=1);
        TablaCuadruplos.gen("ETIQ","","",tempEtiq);

        /*Se añaden los hijos*/
        nodo.AddHijo(nodoId);
        nodo.AddHijo(nodoNum);
        nodo.AddHijo(nodoNum2);
        nodo.AddHijo(hijo1);

        return nodo;
    }

}