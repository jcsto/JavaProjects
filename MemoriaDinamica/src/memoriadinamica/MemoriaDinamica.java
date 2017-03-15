/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriadinamica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class MemoriaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ARRAY LIST
        
        // Crear objeto de tipo ArrayList
        ArrayList <String> cadenas = new ArrayList<>();
        String frase, respuesta;
        do {
            frase = JOptionPane.showInputDialog("Ingresa la frase: ");
            // agregar frase a la lista
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog("Deseas ingresar otra frase? \nSI\nNO");
            respuesta = respuesta.toUpperCase();
        } while(respuesta.equals("SI"));
        
        // mostrar contenido de cadenas
        // Usar un foreach de JAVA
        // var local    : lista a recorrer
        System.out.println("Las cadenas almacenadas son: ");
        for (String res : cadenas) {
            System.out.println("Cadena: " + res);
        }
        
        // metodo set(posicion, nuevo valor)
        cadenas.set(1, "Cadena modificada con el metodo set()");
        
        // otra forma de realizarlo
        System.out.println("\n---------Otra forma de realizar la impresion.-------\n");
        // metodo size() para obtener tamanho de la lista
        for (int i = 0; i < cadenas.size(); i++) {
            // metodo get() para obtener el valor de la lista en la posicion especificada
            System.out.println("Cadena: " + cadenas.get(i));
        }
        
        // eliminar un valor en el indice especificado 
        // con el metodo remove(posicion)
        cadenas.remove(1);
        int i = 0;
        // otra forma de realizarlo
        System.out.println("\n---------Otra forma de realizar la impresion.-------\n");
        while (i < cadenas.size()) {
            System.out.println("Cadena: " + cadenas.get(i));
            // incrementar la variable i, sino se cicla
            i++;
        }
        
        // LAMBDA FUNCTION
        System.out.println("LAMBDA FUNCTION");
        System.out.println("Las cadenas almacenadas son: ");
        
        for (String res : cadenas) {
            System.out.println("Cadena: " + res);
        }
        /*
          array.forEach((varX){
              // CODE HERE
          });
        */
        cadenas.forEach((res) -> {
            System.out.println("Cadena: " + res);
        });
        
    }
    
}
