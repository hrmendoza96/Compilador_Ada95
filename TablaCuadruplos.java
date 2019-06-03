import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TablaCuadruplos{
    static ArrayList<Cuadruplo> tablaCuadruplos = new ArrayList<Cuadruplo>();
    public static Logger log = Logger.getLogger(TablaCuadruplos.class.getName()); //

    static public void insertarCuadruplo(Cuadruplo cuadruplo){
        tablaCuadruplos.add(cuadruplo);
    }
    
    static public void borrarCuadruplo(Cuadruplo cuadruplo){
        tablaCuadruplos.remove(cuadruplo);
    }

    static public void imprimir() {
        System.out.println("\nTABLA CUADRUPLOS:");
        System.out.println("============================================================:");
        for (Cuadruplo cuadruplo : tablaCuadruplos)
            System.out.println(String.format(
                    "      " + "| Operador: %s | Argumento1: %s | Argumento2: %s | Resultado: %s |",
                    cuadruplo.operador, cuadruplo.argumento1, cuadruplo.argumento2, cuadruplo.resultado));
        System.out.println("============================================================:");
    }
}