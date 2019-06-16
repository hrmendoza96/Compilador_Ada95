import java.util.*;

class While {

    public While() {

    }

    public static Nodo MetodoWhile(Nodo hijo1, Nodo hijo2, Nodo hijo3, int cont) {
        /*Se crea el nodo prinicipal*/
        Nodo nodo = new Nodo("ciclo_while", cont);

        /*Se añaden los hijos*/
        nodo.AddHijo(hijo1);
        nodo.AddHijo(hijo2);
        nodo.AddHijo(hijo3);

        String tempEtiq = "_etiq"+Temporales.contEtiq;

        TablaCuadruplos.gen("ETIQ","","",tempEtiq);
        Temporales.contEtiq++;
        tempEtiq = "_etiq";
        tempEtiq = tempEtiq + Temporales.contEtiq;

        TablaCuadruplos.gen("IF"+hijo1.auxValores,hijo1.arg1,hijo1.arg2,tempEtiq);
        Temporales.contEtiq++;
        tempEtiq = "_etiq";
        tempEtiq = tempEtiq + Temporales.contEtiq;

        TablaCuadruplos.gen("GOTO","","",tempEtiq);

        tempEtiq = "_etiq";
        tempEtiq = tempEtiq +(Temporales.contEtiq-=1);
        TablaCuadruplos.gen("ETIQ","","",tempEtiq);

        return nodo;
    }

}