import java.util.*;

class Backpatching {

    int lineaCuadruplos;

    public Backpatching() {

    }   
    
    public static ArrayList<Integer> crearLista(int indice){
        ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
        nuevaLista.add(indice);
        return nuevaLista;
    } 

    public static ArrayList<Integer> fusiona(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
        for (int i = 0; i < lista1.size(); i++) {
            nuevaLista.add(lista1.get(i));
        }

        for (int i = 0; i < lista2.size(); i++) {
            nuevaLista.add(lista2.get(i));
        }

        return nuevaLista;
    }

    public static void completa(ArrayList<Integer> lista, int etiqueta){
        for (Integer indice : lista) {
            TablaCuadruplos.asignarEtiqueta(indice, etiqueta);
        }
    }
    



}