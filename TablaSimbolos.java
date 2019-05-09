import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


class Simbolo {  
    String nombre;
    String tipoVariable;
    Object valor;
    Boolean tipoConstante;
    Boolean isFunction;
    
    public Simbolo(String nombre, String tipoVariable, Object valor, Boolean tipoConstante, Boolean isFunction) {
        this.nombre = nombre;       
        this.tipoVariable = tipoVariable;
        this.valor = valor;
        this.tipoConstante = tipoConstante;
        this.isFunction = isFunction;
    }

}

public class TablaSimbolos {
    static Map<String, Simbolo> tablaSimbolos = new HashMap();
    static Stack<String> lista;
    static ArrayList<Nodo> repeticiones;        
    
    public static Logger log = Logger.getLogger(TablaSimbolos.class.getName());            
    
    public TablaSimbolos() {        
        tablaSimbolos = new HashMap<String, Simbolo>();                                   
        lista = new Stack<String>();                
    }
    
    static public String verificarTipoVariable(String nombre) {
        Simbolo s = tablaSimbolos.get(nombre);
        return s.tipoVariable;
    }

    static public Boolean verificarTipoConstante(String nombre) {
        Simbolo s = tablaSimbolos.get(nombre);
        return s.tipoConstante;
    }

    static public Boolean verificarIsFunction(String nombre) {
        Simbolo s = tablaSimbolos.get(nombre);
        return s.isFunction;
    }
    
    static public String eliminar(String nombre) {             
        System.out.println("Eliminando variable: " + nombre);
        try {
            tablaSimbolos.remove(nombre);
            return nombre;
        } catch(Exception e) {
            System.out.println("Error al eliminar una variable de la tabla de simbolos");
            return nombre;
        }                
    }
            
    static public Simbolo crear(String nombre, String tipoVariable, Boolean constante, Boolean function) {        
        Simbolo simbolo = null;    
        // La variable no existe         
        if (!tablaSimbolos.containsKey(nombre)) {
            simbolo = new Simbolo(nombre, tipoVariable, null, constante, function);
            System.out.println("Agregando a tabla de simbolos con nombre: " + nombre);
            tablaSimbolos.put(nombre, simbolo);            
            //System.out.println("Variable creada exitosamente!!!");
            imprimir();               
            System.out.println("Termino de imprimir");
            return simbolo;
        } else {
            System.out.println("NO se agrego a la tabla de simbolos.");
            return null;
        }
    }
        
    static public Simbolo insertar(String nombre, Object valor, Boolean constante) {
        System.out.println("\nIngreso a insertar valor a variable.");
        Simbolo simbolo = buscar(nombre);
        //La variable existe
        if(simbolo != null)  {
            //Actualizar el valor
            simbolo.valor = valor;
            simbolo.tipoConstante = constante;
            tablaSimbolos.remove(nombre);//Elimino para actualizar
            tablaSimbolos.put(nombre, simbolo);
            
            System.out.println("Variable actualizada");
            imprimir();
            System.out.println("Saliendo de insertar de TablaSimbolos\n");
            return simbolo;
        } else
            return null;
    }
    
    static public Simbolo buscar(String nombre) {
        Simbolo n = (Simbolo)tablaSimbolos.get(nombre); 
        return n;
    }
    
    static public void imprimir() {
        System.out.println("\nIngresando a imprimir de TablaSimbolos");
        System.out.println("    Valores de la tabla de simbolos:");
        for (Simbolo s : tablaSimbolos.values())
            System.out.println(String.format("      "
                    + "| Nombre: %s | valor: %s | tipoVariable: %s | tipoConstante: %s | Function: %s",s.nombre, s.valor, s.tipoVariable, s.tipoConstante, s.isFunction));        
        System.out.println("Saliendo de imprimir en TablaSimbolos\n ");        
    }
    
}
