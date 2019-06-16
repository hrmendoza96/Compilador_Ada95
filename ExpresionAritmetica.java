import java.util.*;

class ExpresionAritmetica {

    //Constructor Vacio
    public ExpresionAritmetica() {

    }

    public static Nodo MetodoSuma(Nodo aux, String n2, Nodo aux2, int tempNum, int cont) {
        String operacion = "";
        String resultado = "";
        String tipo = "";
        String tempVar = "t";

        if(aux.getValue() != null && aux2.getValue() != null){
            if (n2.equals("+")) {
                if (aux.getTipo().equals("INTEGER") && aux2.getTipo().equals("INTEGER")) {
                // Debemos averiguar si el valor es un id, función o simplemente un número
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    // Nuestros dos valores a operar,
                    int cant1 = 0;
                    int cant2 = 0;
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant1 = Integer.parseInt(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Integer.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant2 = Integer.parseInt(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Integer.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    int auxi = cant1 + cant2;
                    resultado = auxi + "";
                    operacion = "SUMA";
                    tipo = "INTEGER";
                    tempVar = "t";

                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("+", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("+", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("+",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                } else if (aux.getTipo().equals("INTEGER") && aux2.getTipo().equals("FLOAT")) {
                    // Debemos averiguar si el valor es un id, función o simplemente un número
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    // Nuestros dos valores a operar
                    int cant1 = 0;
                    float cant2 = 0;
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant1 = Integer.parseInt(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Integer.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    /* Se asigna el texto a un float. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant2 = Float.parseFloat(aux2.getValue());
                    } catch (NumberFormatException e) {                                           
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    float auxi = (float) cant1 + cant2;
                    resultado = auxi + "";
                    operacion = "SUMA";
                    tipo = "FLOAT";
                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("+", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+aux",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("+", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("+",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                } else if (aux.getTipo().equals("FLOAT") && aux2.getTipo().equals("INTEGER")) {
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    float cant1 = 0;
                    int cant2 = 0;
                    try {
                        cant1 = Float.parseFloat(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    try {
                        cant2 = Integer.parseInt(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Integer.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    float auxi = (float) cant1 + cant2;
                    resultado = auxi + "";
                    operacion = "SUMA";
                    tipo = "FLOAT";
                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("+", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("+", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("+",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                } else if (aux.getTipo().equals("FLOAT") && aux2.getTipo().equals("FLOAT")) {
                    // Debemos averiguar si el valor es un id, función o simplemente un número
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    // Nuestros dos valores a operar
                    float cant1 = 0;
                    float cant2 = 0;
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant1 = Float.parseFloat(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    /* Se asigna el texto a un float. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant2 = Float.parseFloat(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    float auxi = (float) cant1 + cant2;
                    resultado = auxi + "";
                    operacion = "SUMA";
                    tipo = "FLOAT";
                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("+", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("+", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("+",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("+",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                }           
            } else if (n2.equals("-")) {
                if (aux.getTipo().equals("INTEGER") && aux2.getTipo().equals("INTEGER")) {
                // Debemos averiguar si el valor es un id, función o simplemente un número
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    // Nuestros dos valores a operar
                    int cant1 = 0;
                    int cant2 = 0;
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant1 = Integer.parseInt(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            if (identificador.valor != null) {
                                cant1 = Integer.valueOf((String)identificador.valor);
                            } else {
                                //System.out.println("El valor 1 es nulo en la resta.");
                            }
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant2 = Integer.parseInt(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            if (identificador.valor != null) {
                                cant2 = Integer.valueOf((String)identificador.valor);
                            } else {
                                System.out.println("El valor 2 es nulo en la resta 2.");
                            }
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    
                    if (cant1 != 0 && cant2 != 0) {
                        int auxi = cant1 - cant2;
                        resultado = auxi + "";
                        operacion = "RESTA";
                        tipo = "INTEGER";
                    } else {
                        System.out.println("Hay algun valor nulo en la resta.");
                    }

                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("-", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("-", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("-",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                
                } else if (aux.getTipo().equals("INTEGER") && aux2.getTipo().equals("FLOAT")) {
                    // Debemos averiguar si el valor es un id, función o simplemente un número
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    // Nuestros dos valores a operar
                    int cant1 = 0;
                    float cant2 = 0;
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant1 = Integer.parseInt(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Integer.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    /* Se asigna el texto a un float. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant2 = Float.parseFloat(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    float auxi = (float) cant1 - cant2;
                    resultado = auxi + "";
                    operacion = "RESTA";
                    tipo = "FLOAT";
                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("-", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("-", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("-",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                } else if (aux.getTipo().equals("FLOAT") && aux2.getTipo().equals("INTEGER")) {
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    float cant1 = 0;
                    int cant2 = 0;
                    try {
                        cant1 = Float.parseFloat(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    try {
                        cant2 = Integer.parseInt(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Integer.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    float auxi = (float) cant1 - cant2;
                    resultado = auxi + "";
                    operacion = "RESTA";
                    tipo = "FLOAT";
                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("-", cant1+"", cant2+"",tempVar);
                        System.out.println("Agregando temporal: " + tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("-", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("-",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                } else if (aux.getTipo().equals("FLOAT") && aux2.getTipo().equals("FLOAT")) {
                    // Debemos averiguar si el valor es un id, función o simplemente un número
                    String valor1 = aux.getValue();
                    String valor2 = aux2.getValue();
                    // Nuestros dos valores a operar
                    float cant1 = 0;
                    float cant2 = 0;
                    /* Se asigna el texto a un entero. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant1 = Float.parseFloat(valor1);
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant1 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    /* Se asigna el texto a un float. Si esto falla, significa
                    que estamos lidiando con un identificador.*/
                    try {
                        cant2 = Float.parseFloat(aux2.getValue());
                    } catch (NumberFormatException e) {
                        Simbolo identificador = null;
                        identificador = TablaSimbolos.buscar(aux2.getValue());
                        if(identificador != null ){ //Significa que la variable ya existe
                            cant2 = Float.valueOf((String)identificador.valor);
                        }else{
                            System.out.println("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                            ErroresSemanticos.add("Error: Variable \""+ aux.value +"\" no ha sido declarada.");
                        }
                    }
                    float auxi = (float) cant1 - cant2;
                    resultado = auxi + "";
                    operacion = "RESTA";
                    tipo = "FLOAT";
                    if (tempNum == 0) {
                        tempVar = tempVar + tempNum + "";
                        tempNum++;
                        TablaCuadruplos.gen("-", cant1+"", cant2+"",tempVar);
                    } else {
                        tempVar = tempVar + tempNum + "";
                        if (aux.temporal != null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",aux.temporal,aux2.temporal,tempVar);
                        } else if (aux.temporal != null && aux2.temporal == null) {
                            TablaCuadruplos.gen("-", aux.temporal, cant2+"",tempVar);
                        } else if (aux.temporal == null && aux2.temporal != null) {
                            TablaCuadruplos.gen("-",cant1+"",aux2.temporal,tempVar);
                        } else {
                            TablaCuadruplos.gen("-",cant1+"",cant2+"",tempVar);
                        }
                        tempNum++;
                    }
                }          
            }

        }else{
            //System.out.println("Error: Valor de funcion aun retorna nulo.");
            //ErroresSemanticos.add("Error: Valor de funcion aun retorna nulo.");
        }

        Nodo nodo = new Nodo(operacion,resultado,cont,tipo);
        nodo.temporal = tempVar;
        nodo.AddHijo(aux);
        nodo.AddHijo(aux2);
        return nodo;

    } // FINAL DEL MÉTODO OPSUMA











}