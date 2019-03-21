import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main {
  static public void main(String argv[]) {    
    /* Start the parser */
    try {
      parser p = new parser(new Lexer(new FileReader(argv[0])));
     p.parse(); 
     if (Lexer.ErroresLexicos.isEmpty() && parser.ErroresSintacticos.isEmpty()) {
      Nodo root = parser.padre;
      Graficar(recorrido(root), "AST_Output");
      System.out.println("Succesful Compile.");
   } else {
       System.out.println("AST no generado por causa de error.");
   }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  private static String recorrido(Nodo raiz) {
    String cuerpo = "";
      for (Nodo child : raiz.children){
        if(!(child.tag.equals("VACIO"))){
          cuerpo += "\"" + raiz.id + ". " + raiz.tag + " = " + raiz.value + "\"->\""+ child.id +". " + child.tag  + " = " + child.value + "\"" ;
          //System.out.println("Cuerpo:"+cuerpo);
          cuerpo += recorrido(child);
        }else{
          System.out.println(raiz.tag);
        }
      }

      return cuerpo;
  }

  private static void Graficar(String cadena, String cad) {
 
      FileWriter fichero = null;
      PrintWriter pw = null;
      String nombre = cad;
      String archivo = nombre + ".dot";
      try {
          fichero = new FileWriter(archivo);
          pw = new PrintWriter(fichero);
          pw.println("digraph G {node[shape=box, style=filled, color=Gray95]; edge[color=blue];rankdir=UD \n");
          pw.println(cadena);
          pw.println("\n}");
          fichero.close();
      } catch (Exception e) {
          System.out.println(e);
      }
      try {
          String cmd = "dot -Tpng " + nombre + ".dot -o " + cad + ".png"; //Comando de apagado en linux
          Runtime.getRuntime().exec(cmd);
      } catch (IOException ioe) {
          System.out.println(ioe);
      }
  }

}