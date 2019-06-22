class For {

    public For() {

    }

    public static Nodo MetodoFor(Nodo hijo1, String id, String n3, String n5, Nodo m1, Nodo m2, Nodo n1) { //Hijo 1 es S
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_for", Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoId = new Nodo("ID", id.toString(), Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoNum = new Nodo("NUM", n3.toString(), Temporales.cont);
        Temporales.cont++;

        /*Nuevo Nodo: TERMINAL*/
        Nodo nodoNum2 = new Nodo("NUM",n5.toString(), Temporales.cont);
        Temporales.cont++;

        /*Se añaden los hijos*/
        nodo.AddHijo(nodoId);
        nodo.AddHijo(nodoNum);
        nodo.AddHijo(nodoNum2);
        nodo.AddHijo(hijo1);
            
        
        
        //Asignarle los valores que quedaron vacias en el N:chilN1 del for en el parser.cup 
        int contadorLocalIndices = 0; //Contador para saber si el indice dentro del for es 0 o 1
        for (Integer indice : n1.listaVerdadera) {
            if(contadorLocalIndices == 0){
                TablaCuadruplos.asignarArgumentos(indice, id, n3); //ID y NUM1
                contadorLocalIndices++;
            }else{
                TablaCuadruplos.asignarArgumentos(indice, id, n5); //ID y NUM2
            }
        }
        TablaCuadruplos.gen("GOTO", "", "", "_etiq" + m1.lineaCuadruplo);
        Backpatching.completa(hijo1.listaSiguiente, m1.lineaCuadruplo);
        nodo.listaSiguiente = n1.listaFalsa;

        

        return nodo;
    }

}