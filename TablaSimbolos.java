import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Simbolo {
    String nombre;
    String tipoVariable;
    Object valor;
    Boolean tipoConstante;
    Boolean isFunction;
    String ambito;

    public Simbolo(String nombre, String tipoVariable, Object valor, Boolean tipoConstante, Boolean isFunction, String ambito) {
        this.nombre = nombre;
        this.tipoVariable = tipoVariable;
        this.valor = valor;
        this.tipoConstante = tipoConstante;
        this.isFunction = isFunction;
        this.ambito = ambito;
    }

    public Simbolo() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipoVariable() {
        return this.tipoVariable;
    }

    public Object getValor() {
        return this.valor;
    }

    public Boolean getTipoConstante() {
        return this.tipoConstante;
    }

    public Boolean getIsFunction() {
        return this.isFunction;
    }

}

public class TablaSimbolos {
    static ArrayList<Simbolo> tablaSimbolos = new ArrayList<Simbolo>();
    // static Map<String, Simbolo> tablaSimbolos = new HashMap();
    // static Stack<String> lista;
    // static ArrayList<Nodo> repeticiones;

    public static Logger log = Logger.getLogger(TablaSimbolos.class.getName());

    // public TablaSimbolos() {
    // tablaSimbolos = new HashMap<String, Simbolo>();
    // lista = new Stack<String>();
    // }

    static public String verificarTipoVariable(String nombre) {
        Simbolo s = buscar(nombre);
        return s.tipoVariable;
    }

    static public Boolean verificarTipoConstante(String nombre) {
        Simbolo s = buscar(nombre);
        return s.tipoConstante;
    }

    static public Boolean verificarIsFunction(String nombre) {
        Simbolo s = buscar(nombre);
        return s.isFunction;
    }

    static public void setAmbito(String nombre, String ambito){
        Simbolo s = buscar(nombre);
        s.ambito  =  ambito;
        int pos = tablaSimbolos.indexOf(s);
        tablaSimbolos.set(pos, s);
    }

    static public Simbolo insertar2(String nombre, String tipoVariable, Object valor, Boolean tipoConstante, Boolean tipoFuncion, String ambito) {
        Simbolo simbolo = null;
        boolean existe = false;
        for (Simbolo s : tablaSimbolos) {
            if (s.nombre.equals(nombre)) {
                existe = true;
                break;
            }
        }
        // La variable no existe
        if (!existe) {
            simbolo = new Simbolo(nombre, tipoVariable, valor.toString(), tipoConstante, tipoFuncion, ambito);
            System.out.println("Agregando a tabla de simbolos con nombre: " + nombre);
            tablaSimbolos.add(simbolo);
            // System.out.println("Variable creada exitosamente!!!");
            imprimir();
            System.out.println("Termino de imprimir");
            return simbolo;
        } else {
            System.out.println("NO se agrego a la tabla de simbolos.");
            return null;
        }
    }

    static public String eliminar(String nombre) {
        System.out.println("Eliminando variable: " + nombre);
        try {
            Simbolo s = buscar(nombre);
            tablaSimbolos.remove(s);
            return nombre;
        } catch (Exception e) {
            System.out.println("Error al eliminar una variable de la tabla de simbolos");
            return nombre;
        }
    }

    static public Simbolo crear(String nombre, String tipoVariable, Boolean constante, Boolean function) {
        Simbolo simbolo = null;
        // Validar si existe
        boolean existe = false;
        for (Simbolo s : tablaSimbolos) {
            if (s.nombre.equals(nombre)) {
                existe = true;
                break;
            }
        }
        // La variable no existe
        if (!existe) {
            simbolo = new Simbolo(nombre, tipoVariable, null, constante, function, "");
            System.out.println("Agregando a tabla de simbolos con nombre: " + nombre);
            tablaSimbolos.add(simbolo);
            // System.out.println("Variable creada exitosamente!!!");
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
        int pos = tablaSimbolos.indexOf(simbolo);
        // La variable existe
        if (simbolo != null) {
            // Actualizar el valor
            simbolo.valor = valor;
            simbolo.tipoConstante = constante;
            //tablaSimbolos.remove(nombre);//Elimino para actualizar
            //tablaSimbolos.put(nombre, simbolo);
            tablaSimbolos.set(pos, simbolo);
            System.out.println("Variable actualizada");
            imprimir();
            System.out.println("Saliendo de insertar de TablaSimbolos\n");
            return simbolo;
        } else
            return null;
    }

    static public Simbolo buscar(String nombre) {
        // Simbolo n = (Simbolo)tablaSimbolos.get(nombre);
        // Busca si existe la variable en tabla de simbolos
        Simbolo s = null;
        for (Simbolo simbolo : tablaSimbolos) {
            if (simbolo.nombre.equals(nombre)) {
                s = simbolo;
                break;
            }
        }
        return s;
    }

    static public void imprimir() {
        System.out.println("\nIngresando a imprimir de TablaSimbolos");
        System.out.println("    Valores de la tabla de simbolos:");
        for (Simbolo s : tablaSimbolos)
            System.out.println(String.format(
                    "      " + "| Nombre: %s | valor: %s | tipoVariable: %s | tipoConstante: %s | Function: %s | Ambito: %s |",
                    s.nombre, s.valor, s.tipoVariable, s.tipoConstante, s.isFunction, s.ambito));
        System.out.println("Saliendo de imprimir en TablaSimbolos\n ");
    }

}
