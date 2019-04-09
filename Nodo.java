import java.util.ArrayList;

public class Nodo {
   
    public int id;
    public String tag;
    public String value;
    public ArrayList<Nodo> children = new ArrayList<>();

    public Nodo(){
        /* Empty Constructor */
    }

    public Nodo(String tag, String value, int id){
        /* Empty Constructor */
        this.tag = tag;
        this.value = value;
        this.id = id;
    }

    
    public Nodo(String tag, int id){
        /* Empty Constructor */
        this.tag = tag;
        this.id = id;
    }

    public Nodo(String tag, String value){
        /* Empty Constructor */
        this.tag = tag;
        this.value = value;
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

    public ArrayList<Nodo> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Nodo> children) {
        this.children = children;
    }

    
}