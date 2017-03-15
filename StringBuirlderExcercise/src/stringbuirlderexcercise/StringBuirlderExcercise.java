/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuirlderexcercise;

import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class StringBuirlderExcercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder sb = new StringBuilder();
        
        sb
                .append("Hola")
                .append(" ")
                .append(
                        JOptionPane.showInputDialog("Escriba un nombre")
                )
                .append(".");
        
        System.out.println("La cadena de StrinBuilder es: " + sb.toString());
        
    }
    
}
