import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class CodigoFinal {

    public static ArrayList<String> codigoFinal = new ArrayList<String>(); //Este es el arraylist que contiene el codigo final
    public static String mensaje = "_msg";
    public static int contadorMensaje = 0;
    public static ArrayList<String> variablesDeclaradas = new ArrayList<String>();
    public static ArrayList<String> mensajesDeclarados = new ArrayList<String>();

    public CodigoFinal() {

    }

    public static void GenerarFinal(ArrayList<String> codigoIntermedio) {
        codigoFinal.add(".data");
        MetodoVariables();
        codigoFinal.add("   .text");
        codigoFinal.add("   .globl main");
        codigoFinal.add("main:");
        int index = 0;
        String temporal = "";

        for (String cadena : codigoIntermedio){
            String cadenaOriginal = cadena;
            cadena = cadena.replaceAll("\\s+", ""); // Quitar espacios en la cadena

            if (cadena.contains("=") && !cadena.contains(":") && !cadena.contains("if")) { // If para los temporales, no asignacioens
                String[] cadenaAuxiliar = cadena.split("="); // Se pone t a la izquierda y la opración a la derecha
                // Codigo Final para expresiones aritméticas sin Floats
                if (cadenaAuxiliar[1].contains("+") && !cadenaAuxiliar[1].contains(".")) {
                    String[] cadenaDividida = cadenaAuxiliar[1].split("\\+");
                    codigoFinal.add("   add $" + cadenaAuxiliar[0] + ", " + cadenaDividida[0] + ", " + cadenaDividida[1]);
                    temporal = cadenaAuxiliar[0];
                } else if (cadenaAuxiliar[1].contains("-")  && !cadenaAuxiliar[1].contains(".")) {
                    String[] cadenaDividida = cadenaAuxiliar[1].split("-");
                    codigoFinal.add("   sub $" + cadenaAuxiliar[0] + ", " + cadenaDividida[0] + ", " + cadenaDividida[1]);
                    temporal = cadenaAuxiliar[0];
                } else if (cadenaAuxiliar[1].contains("/")  && !cadenaAuxiliar[1].contains(".")) {
                    String[] cadenaDividida = cadenaAuxiliar[1].split("/");
                    codigoFinal.add("   div $" + cadenaAuxiliar[0] + ", " + cadenaDividida[0] + ", " + cadenaDividida[1]);
                    temporal = cadenaAuxiliar[0];
                } else if (cadenaAuxiliar[1].contains("*")  && !cadenaAuxiliar[1].contains(".")) {
                    String[] cadenaDividida = cadenaAuxiliar[1].split("\\*");
                    codigoFinal.add("   mul $" + cadenaAuxiliar[0] + ", " + cadenaDividida[0] + ", " + cadenaDividida[1]);
                    temporal = cadenaAuxiliar[0];
                }

            } else if (cadena.contains(":=")) { // If para asignacion de variables
                
                String[] cadenaAuxiliar = cadena.split(":="); // Variable a la izquierda y valor a la derecha
                String tipo = ""; // Para guardar el tipo de variable

                for (Simbolo simbolo : TablaSimbolos.tablaSimbolos) {
                    if (simbolo.nombre.equals(cadenaAuxiliar[0])) {
                        tipo = simbolo.tipoVariable;
                    }
                }

                if (tipo.equals("INTEGER")) {
                    if (index != 0) {
                        String cadenaAuxiliar2 = codigoIntermedio.get(index - 1);
                        if (cadenaAuxiliar2.contains("*") || cadenaAuxiliar2.contains("/") || cadenaAuxiliar2.contains("+") || cadenaAuxiliar2.contains("-") ) {
                            codigoFinal.add("   sw $" + temporal +  ", _" + cadenaAuxiliar[0]);
                        } else {
                            codigoFinal.add("   li $t0, " + cadenaAuxiliar[1]);
                            codigoFinal.add("   sw $t0, " + "_" + cadenaAuxiliar[0]);
                        }
                    } else {
                        String cadenaAuxiliar2 = codigoIntermedio.get(index);
                        if (cadenaAuxiliar2.contains("*") || cadenaAuxiliar2.contains("/") || cadenaAuxiliar2.contains("+") || cadenaAuxiliar2.contains("-") ) {
                            codigoFinal.add("   sw " + cadenaAuxiliar[1] +  ", _" + cadenaAuxiliar[0]);
                        } else {
                            codigoFinal.add("   li $t0, " + cadenaAuxiliar[1]);
                            codigoFinal.add("   sw $t0, " + "_" + cadenaAuxiliar[0]);
                        }
                    }
                } else if (tipo.equals("BOOLEAN")) {
                    if (cadenaAuxiliar[1].toLowerCase().equals("false")) {
                        codigoFinal.add("   li $t0, 0");
                        codigoFinal.add("   sw $t0, _" + cadenaAuxiliar[0]);
                    } else if (cadenaAuxiliar[1].toLowerCase().equals("true")) {
                        codigoFinal.add("   li $t0, 1");
                        codigoFinal.add("   sw $t0, _" + cadenaAuxiliar[0]);
                    }
                }
                
            } else if (cadena.contains("_etiq") && cadena.contains(":")) { // Final de generar etiqueta
                codigoFinal.add(cadena);
            } else if (cadena.contains("_etiq") && cadena.contains("goto") && cadena.contains("if")) { // final de if goto
                String[] cadenaAuxiliar = cadena.split("if");
                String[] nuevaCadena = cadenaAuxiliar[1].split("goto");
                if (nuevaCadena[0].contains(">") && !nuevaCadena[0].contains("=")) {
                    String[] cadenaFinal = nuevaCadena[0].split(">");
                    String loadWord1 = "$t0";
                    String loadWord2 = "$t1";
                    if(cadenaFinal[0].matches("-?\\d+(\\.\\d+)?")){
                        codigoFinal.add("   lw "+ loadWord1 + ", "+ cadenaFinal[0]);
                    }else{
                        codigoFinal.add("   lw "+ loadWord1 + ", _"+ cadenaFinal[0]);
                    }
                    if(variablesDeclaradas.contains(cadenaFinal[1])){
                        codigoFinal.add("   lw "+ loadWord2 + ", _"+ cadenaFinal[1]);
                    }else{
                        loadWord2 = cadenaFinal[1];
                    }
                    codigoFinal.add("   bgt " + loadWord1 + ", " + loadWord2 + ", " + nuevaCadena[1]);
                } else if (nuevaCadena[0].contains("<") && !nuevaCadena[0].contains("=")) {
                    String[] cadenaFinal = nuevaCadena[0].split("<");
                    String loadWord1 = "$t0";
                    String loadWord2 = "$t1";
                    if(cadenaFinal[0].matches("-?\\d+(\\.\\d+)?")){
                        codigoFinal.add("   lw "+ loadWord1 + ", "+ cadenaFinal[0]);
                    }else{
                        codigoFinal.add("   lw "+ loadWord1 + ", _"+ cadenaFinal[0]);
                    }
                    if(variablesDeclaradas.contains(cadenaFinal[1])){
                        codigoFinal.add("   lw "+ loadWord2 + ", _"+ cadenaFinal[1]);
                    }else{
                        loadWord2 = cadenaFinal[1];
                    }
                    codigoFinal.add("   blt " + loadWord1 + ", " + loadWord2 + ", " + nuevaCadena[1]);
                } else if (nuevaCadena[0].contains(">=")) {
                    String[] cadenaFinal = nuevaCadena[0].split(">=");
                    String loadWord1 = "$t0";
                    String loadWord2 = "$t1";
                    if(cadenaFinal[0].matches("-?\\d+(\\.\\d+)?")){
                        codigoFinal.add("   lw "+ loadWord1 + ", "+ cadenaFinal[0]);
                    }else{
                        codigoFinal.add("   lw "+ loadWord1 + ", _"+ cadenaFinal[0]);
                    }
                    if(variablesDeclaradas.contains(cadenaFinal[1])){
                        codigoFinal.add("   lw "+ loadWord2 + ", _"+ cadenaFinal[1]);
                    }else{
                        loadWord2 = cadenaFinal[1];
                    }
                    codigoFinal.add("   bge " + loadWord1 + ", " + loadWord2 + ", " + nuevaCadena[1]);
                } else if (nuevaCadena[0].contains("<=")) {
                    String[] cadenaFinal = nuevaCadena[0].split("<=");
                    String loadWord1 = "$t0";
                    String loadWord2 = "$t1";
                    if(cadenaFinal[0].matches("-?\\d+(\\.\\d+)?")){
                        codigoFinal.add("   lw "+ loadWord1 + ", "+ cadenaFinal[0]);
                    }else{
                        codigoFinal.add("   lw "+ loadWord1 + ", _"+ cadenaFinal[0]);
                    }
                    if(variablesDeclaradas.contains(cadenaFinal[1])){
                        codigoFinal.add("   lw "+ loadWord2 + ", _"+ cadenaFinal[1]);
                    }else{
                        loadWord2 = cadenaFinal[1];
                    }
                    codigoFinal.add("   ble " + loadWord1 + ", " + loadWord2 + ", " + nuevaCadena[1]);
                } else if (nuevaCadena[0].contains("=")) {
                    String[] cadenaFinal = nuevaCadena[0].split("=");
                    String loadWord1 = "$t0";
                    String loadWord2 = "$t1";
                    if(cadenaFinal[0].matches("-?\\d+(\\.\\d+)?")){
                        codigoFinal.add("   lw "+ loadWord1 + ", "+ cadenaFinal[0]);
                    }else{
                        codigoFinal.add("   lw "+ loadWord1 + ", _"+ cadenaFinal[0]);
                    }
                    if(variablesDeclaradas.contains(cadenaFinal[1])){
                        codigoFinal.add("   lw "+ loadWord2 + ", _"+ cadenaFinal[1]);
                    }else{
                        loadWord2 = cadenaFinal[1];
                    }
                    codigoFinal.add("   beq " + loadWord1 + ", " + loadWord2 + ", " + nuevaCadena[1]);
                }
            } else if (cadena.contains("_etiq") && cadena.contains("goto") && !cadena.contains("if")) {
                String[] nuevaCadena = cadena.split("goto");
                codigoFinal.add("   b " + nuevaCadena[1]);
            } else if (!cadena.contains("_etiq") && cadena.contains("goto") && !cadena.contains("if") && cadena.contains("exit")) {
                String[] nuevaCadena = cadena.split("goto");
                codigoFinal.add("   b _" + nuevaCadena[1]);
            } else if (cadena.contains("PUT")) {
                String[] cadenaNueva = cadenaOriginal.split("PUT");
                for (String mensaje : mensajesDeclarados) {
                    int i = 0;    
                    if (mensaje.equals(cadenaNueva[1])) {
                        codigoFinal.add("   li $v0, 4");
                        codigoFinal.add("   la $a0, _msg" + mensajesDeclarados.indexOf(mensaje));
                        codigoFinal.add("   syscall");
                        i = 1;
                    } else {
                        for (Simbolo simbolo : TablaSimbolos.tablaSimbolos) {
                            String nombre = "   "+simbolo.nombre;
                            if (nombre.equals(cadenaNueva[1])) {
                                nombre = nombre.replace("   ", "");
                                if (simbolo.tipoVariable.equals("INTEGER")) {
                                    codigoFinal.add("   li $v0, 1");
                                    codigoFinal.add("   lw $a0, _" + nombre);
                                    codigoFinal.add("   syscall");
                                    i = 1;
                                } else if (simbolo.tipoVariable.equals("BOOLEAN")) {
                                    codigoFinal.add("   li $v0, 1");  // considero boolean entero por eso li 1
                                    codigoFinal.add("   lw $a0, _" + nombre); 
                                    codigoFinal.add("   syscall");
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i == 1) {
                        break;
                    }
                }
            } else if (cadena.contains("GET")) {
                String[] cadenaNueva = cadena.split("GET");
                for (Simbolo simbolo : TablaSimbolos.tablaSimbolos) {
                    String nombre = simbolo.nombre;
                    if (nombre.equals(cadenaNueva[1])) {
                        nombre = nombre.replace("   ", "");
                        if (simbolo.tipoVariable.equals("INTEGER")) {
                            codigoFinal.add("   li $v0, 5");
                            codigoFinal.add("   syscall");
                            codigoFinal.add("   sw $v0, _" + nombre);
                        } else if (simbolo.tipoVariable.equals("BOOLEAN")) {
                            codigoFinal.add("   li $v0, 5"); //Considero boolean entero por eso li 1
                            codigoFinal.add("   syscall");
                            codigoFinal.add("   sw $v0, _" + nombre); 
                        }
                    }
                }

                
            }
            index++;
        }

        codigoFinal.add("_exit:");
        codigoFinal.add("   li $v0, 10");
        codigoFinal.add("   syscall");


        System.out.println("\n Codigo Final:");
        System.out.println("============================================================:");
        for (String cadena : codigoFinal) {
            System.out.println(cadena);
        }
        System.out.println("============================================================:");

        File archivo = new File("./Test.asm");
        generarArchivo(archivo, codigoFinal);
    }

    public static void generarArchivo(File archivo, ArrayList<String> codigo){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (String cadena : codigo) {
                bw.write(cadena);
                bw.write("\n");
            }
            bw.flush();
            System.out.println("Archivo Test.asm Generado Exitosamente");
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
        
    }

    public static void MetodoVariables() {

        for (String cadena : TablaCuadruplos.codigoIntermedio){
            String cadenaOriginal = cadena;            
            cadena = cadena.replaceAll("\\s+", ""); //Se le quita los espacios a la cadena

            if (cadena.contains(":=")) {
                String[] cadenaAuxiliar = cadena.split(":=");
                for (Simbolo s : TablaSimbolos.tablaSimbolos) {
                    if (cadenaAuxiliar[0].equals(s.nombre) && !variablesDeclaradas.contains(cadenaAuxiliar[0])) {
                        if (s.tipoVariable.equals("INTEGER")){
                            codigoFinal.add("   _" + cadenaAuxiliar[0] + ": .word 0");
                            variablesDeclaradas.add(cadenaAuxiliar[0]);
                        } else if (s.tipoVariable.equals("BOOLEAN")) {
                            codigoFinal.add("   _" + cadenaAuxiliar[0] + ": .word 0");
                            variablesDeclaradas.add(cadenaAuxiliar[0]);
                        } else if (s.tipoVariable.equals("STRINGTYPE")){
                            codigoFinal.add("   _" + cadenaAuxiliar[0] + ": .space 100");
                            variablesDeclaradas.add(cadenaAuxiliar[0]);
                        }
                    }  
                }
            } else if (cadena.contains("PUT") && cadena.contains("\"")) {
                String[] originalDividida = cadenaOriginal.split("PUT");
                codigoFinal.add("   " + mensaje + contadorMensaje + ": .asciiz " + originalDividida[1]);
                contadorMensaje++;
                mensajesDeclarados.add(originalDividida[1]);
            }
        } //FINAL DEL FOR RECORRER TABLA SIMBOLOS
    }
}