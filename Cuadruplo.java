import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Cuadruplo {
    String operador;
    String argumento1;
    String argumento2;
    String resultado;

    /**
     * Constructores/Getters/Setters
     */
    //Constructor Principal
    public Cuadruplo(String operador, String argumento1, String argumento2, String resultado) {
        this.operador = operador;
        this.argumento1 = argumento1;
        this.argumento2 = argumento2;
        this.resultado = resultado;
    }

    //Constructor Vacio
    public Cuadruplo() {

    }

    //Getters
    public String getOperador(){
        return this.operador;
    }

    public String getArgumento1(){
        return this.operador;
    }

    public String getArgumento2(){
        return this.operador;
    }

    public String getResultado(){
        return this.operador;
    }

    //Setters
    public void setOperador(String operador){
        this.operador =  operador;
    }

    public void setArgumento1(String argumento1){
        this.argumento1 =  argumento1;
    }

    public void setArgumento2(String argumento2){
        this.argumento2 =  argumento2;
    }

    public void setResultado(String resultado){
        this.resultado =  resultado;
    }

}