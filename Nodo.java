import java.util.ArrayList;

public class Nodo {
   
    public int id;
    public String tag;
    public String value;
    public String tipo;
    public String ambito;
    public String auxValores;

    public ArrayList<Nodo> children = new ArrayList<>();

    public Nodo(){
        /* Empty Constructor */
    }

    public Nodo(String tag, String value, int id, String tipo, String ambito){
        /* Empty Constructor */
        this.tag = tag;
        this.value = value;
        this.id = id;
        this.tipo = tipo;
        this.ambito = ambito;
    }
    public Nodo(String tag, String value, int id, String tipo){
        /* Empty Constructor */
        this.tag = tag;
        this.value = value;
        this.id = id;
        this.tipo = tipo;
    }

    
    public Nodo(String tag, int id, String tipo){
        /* Empty Constructor */
        this.tag = tag;
        this.id = id;
        this.tipo = tipo;
    }

    public Nodo(String tag, String value, int id) {
        this.tag = tag;
        this.value = value;
        this.id = id;
    }

    public Nodo(String tag, int id) {
        this.tag = tag;
        this.id = id;
    }

    public Nodo(String tag, String value){
        /* Empty Constructor */
        this.tag = tag;
        this.value = value;
    }
    public Nodo(String tag){
        this.tag = tag;
    }
    
    public void AddHijo(Nodo child) {
        children.add(child);
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAuxValores(String auxValores) {
        this.auxValores = auxValores;
    }

    public String getAuxValores() {
        return auxValores;
    }

    public ArrayList<Nodo> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Nodo> children) {
        this.children = children;
    }

    
}