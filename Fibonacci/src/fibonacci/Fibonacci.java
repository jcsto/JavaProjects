/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fibonacci f = new Fibonacci();
        StringBuilder s = new StringBuilder();
        s.append(JOptionPane.showInputDialog("Escriba un numero positivo para calcular su serie Fibonacci."));
        //int x = f.fibonacciRecursivo(Integer.parseInt(s.toString()));
        //System.out.println("Sucesion Fibonacci por Recursividad de " + s.toString() + " es: " + x);
        int x = f.fibonacciCiclo(Integer.parseInt(s.toString()));
        System.out.println("Sucesion Fibonacci por Ciclode " + s.toString() + " es: " + x);
    }
    
    public int fibonacciRecursivo(int val) {
        int fib = 0;
        if ( val == 1 || val == 2)
            return 1;
        else {
            return ( fibonacciRecursivo(val - 1) + fibonacciRecursivo(val - 2) );
        }
    }
    
    public int fibonacciCiclo(int val) {
        int fibo = 0, primero = 1, segundo = 0;
        while (val > 0) {            
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            val--;
        }
        /*
        n = 4-1=3-1=2-1=1-1=0   fibo=0=1=1=2=3  primero=1=0=1=1=2  segundo=0=1=1=2=3
        
        */
        return fibo;
    }
    
}
