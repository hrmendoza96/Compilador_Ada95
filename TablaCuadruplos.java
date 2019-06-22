import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TablaCuadruplos{
    static ArrayList<Cuadruplo> tablaCuadruplos = new ArrayList<Cuadruplo>();
    public static Logger log = Logger.getLogger(TablaCuadruplos.class.getName()); //

    public static void insertarCuadruplo(Cuadruplo cuadruplo){
        tablaCuadruplos.add(cuadruplo);
    }
    
    public static void borrarCuadruplo(Cuadruplo cuadruplo){
        tablaCuadruplos.remove(cuadruplo);
    }

    static public void asignarLinea(Integer indice, Integer etiqueta) {
        tablaCuadruplos.get(indice).setResultado("_etiq"+etiqueta);
    }

    static public void asignarArgumentos(Integer indice, String arg1, String arg2) {
        tablaCuadruplos.get(indice).argumento1 = arg1;
        tablaCuadruplos.get(indice).argumento2 = arg2;
    }



    static public void imprimir() {
        System.out.println("\nTABLA CUADRUPLOS:");
        System.out.println("============================================================:");
        for (Cuadruplo cuadruplo : tablaCuadruplos)
            System.out.println(String.format(
                    "      " + "| Indice: %d | Operador: %s | Argumento1: %s | Argumento2: %s | Resultado: %s |",
                    tablaCuadruplos.indexOf(cuadruplo) + 1, cuadruplo.operador, cuadruplo.argumento1, cuadruplo.argumento2,
                    cuadruplo.resultado));
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

    static public void imprimirIntermedio() {
        System.out.println("\nCODIGO INTERMEDIO:");
        System.out.println("============================================================:");
        for (Cuadruplo cuadruplo : tablaCuadruplos){
            String cadena = "";
            if(cuadruplo.operador.contains("*") || cuadruplo.operador.contains("/") ||cuadruplo.operador.contains("+") || cuadruplo.operador.contains("-")){
                cadena =  cuadruplo.resultado +" = "+ cuadruplo.argumento1 + " " + cuadruplo.operador+ " " + cuadruplo.argumento2;
            }else if(cuadruplo.operador.contains(":=") ){
                cadena =  cuadruplo.resultado + " " + cuadruplo.operador + " " + cuadruplo.argumento1;
            }else if(cuadruplo.operador.contains("if")){
                String temp = cuadruplo.operador.substring(2);
                cadena = "if "+ cuadruplo.argumento1 + "" + temp + "" + cuadruplo.argumento2 + " goto " + cuadruplo.resultado;
            }else if(cuadruplo.operador.contains("GOTO")){  
                if(cuadruplo.resultado != ""){
                    cadena = "goto " + cuadruplo.resultado;
                }else{
                    cadena = "goto " + "exit";
                }
            }else if(cuadruplo.operador.contains("ETIQ")){
                int validacionSiguiente = tablaCuadruplos.indexOf(cuadruplo) + 1;
                if(tablaCuadruplos.get(validacionSiguiente).operador.contains("ETIQ")){
                    System.out.print("\n");
                    cadena = cuadruplo.resultado +":\ngoto "+tablaCuadruplos.get(validacionSiguiente).resultado;
                }else{
                    System.out.print("\n");
                    cadena = cuadruplo.resultado +":";
                }
            }else{
                cadena = cuadruplo.operador+ " " + cuadruplo.argumento1 + " " + cuadruplo.argumento2 + " " + cuadruplo.resultado;
            }
            
            System.out.println(cadena);
        }
        System.out.println("============================================================:");
    }
}