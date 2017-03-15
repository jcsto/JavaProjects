/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdaesfera;

/**
 *
 * @author JC
 */
public class TDAEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Esfera esf = new Esfera(3);
        
        System.out.println("Radio:" + esf.getRadio());
        System.out.println("Diametro:" + esf.getDiametro());
        System.out.println("Circunferencia:" + esf.getCircunferencia());
        System.out.println("Area:" + esf.getArea());
        System.out.println("Volumen:" + esf.getVolumen());
    }
    
}
