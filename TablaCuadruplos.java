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

    public static void gen(Object op, Object arg1, Object arg2, Object res){
        try{
            //Castear a Strings
            String operador, argumento1, argumento2, resultado;
            if(op == null){
                operador = "";
            }else{
                operador = op.toString();
            }

            if(arg1 == null){
                argumento1 = "";
            }else{
                argumento1 = arg1.toString();
            }

            if(arg2 == null){
                argumento2 =  "";
            }else{
                argumento2 = arg2.toString();
            }

            if(res == null){
                resultado = "";
            }else{
                resultado = res.toString();
            }

            //Crear Cuadruplo
            Cuadruplo cuadruplo = new Cuadruplo(operador, argumento1, argumento2, resultado);

            //Insertar Cuadruplo a Tabla de Cuadruplos
            insertarCuadruplo(cuadruplo);
        }catch(Exception e){
            System.out.println("Error en el GEN para cuadruplos");
        }
    }
}