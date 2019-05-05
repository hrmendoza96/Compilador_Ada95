import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Simbolo {  
    String nombre;
    String tipo;
    Object valor;
    
    public Simbolo(String nombre, String tipo ,Object valor) {
        this.nombre = nombre;       
        this.tipo = tipo;
        this.valor = valor;
    }
}

public class TablaSimbolos {
    static Map<String, Simbolo> tablaSimbolos;
    static Stack<String> lista;
    static ArrayList<Nodo> repeticiones;        
    
    public static Logger log = Logger.getLogger(TablaSimbolos.class.getName());            
    
    public TablaSimbolos() {        
        tablaSimbolos = new HashMap<String, Simbolo>();                                   
        lista = new Stack<String>();                
    }
    
    static public String verificarTipo(String nombre) {
        Simbolo s = tablaSimbolos.get(nombre);
        return s.tipo;
    }
    
    static public String eliminar(String nombre) {             
        System.out.println("Eliminando variable: " + nombre);
        try
        {
            tablaSimbolos.remove(nombre);
            return nombre;
        }
        catch(Exception e)
        {
            System.out.println("Error al eliminar una variable de la tabla de simbolos");
            return nombre;
        }                
    }
            
    static public Simbolo crear(String nombre, String tipo) {        
        Simbolo simbolo = buscar(nombre);                            
        if(simbolo == null) // La variable no existe
        {
            simbolo = new Simbolo(nombre, tipo, null);
            System.out.println("Agregando a tabla de simbolos con nombre: " + nombre);
            tablaSimbolos.put(nombre, simbolo);            
            //System.out.println("Variable creada exitosamente!!!");
              
            imprimir();                
            System.out.println(" ");
            return simbolo;
        }
        else
        {
            log.log(Level.SEVERE, "Redefinición de la variable: " + nombre);
            return null; // La variable ya existía                
        }
    }
        
    static public Simbolo insertar(String nombre, Object valor) {
        System.out.println("\nIngreso a insertar valor a variable.");
        Simbolo simbolo = buscar(nombre);
        if(simbolo != null) //La variable existe
        {
            //Actualizar el valor
            simbolo.valor = valor;
            tablaSimbolos.remove(nombre);//Elimino para actualizar
            tablaSimbolos.put(nombre, simbolo);
            
            System.out.println("Variable actualizada");
            imprimir();
            System.out.println("Saliendo de insertar de TablaSimbolos\n");
            return simbolo;
        }
        else
            return null;
    }
    
    static public Simbolo buscar(String nombre) {
        return (Simbolo)tablaSimbolos.get(nombre);
    }
    
    static public void imprimir() {
        System.out.println("\nIngresando a imprimir de TablaSimbolos");
        System.out.println("    Valores de la tabla de simbolos:");
        for (Simbolo s : tablaSimbolos.values())
            System.out.println(String.format("      "
                    + "Nombre: %s, valor: %s, tipo: %s",s.nombre, s.valor, s.tipo));        
        System.out.println("Saliendo de imprimir en TablaSimbolos\n ");        
    }
    
}
