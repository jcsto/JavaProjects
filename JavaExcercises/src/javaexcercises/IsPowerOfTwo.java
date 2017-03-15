/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

/**
 *
 * @author JC
 */
public class IsPowerOfTwo {
    
    public static void main(String[] args) {
        boolean flag = isPowerOfTwo(0);
        System.out.println("Resultado: " + 0 + " = " + flag);
        /*
         * Para encontrar cualquier logaritmo de X base, hacer:
         * Math.log(n) / Math.log(base), donde N es el numero que se quiere calcular, y base la propia base
         * Ejemplo: Log base 2 ==> Math.log(n) / Math.log(2);
         *          Log base 3 ==> Math.log(n) / Math.log(3);
         * y asi con las demas bases
        */
    }
    
    public static boolean isPowerOfTwo(int n) {
        boolean flag = false;
        double d = Math.log(n) / Math.log(2);
        
        if (!Double.isInfinite(d)) {
            double exponent = Math.round(d);
            // elevamos el exponente con la base de 2
            double result = Math.pow(2, exponent);
            if (result == n)
                flag = true;
        }
        
        return flag;
    }
    
    public static boolean isPowerOfThree(int n) {
        boolean flag = false;
        double d = Math.log(n) / Math.log(3);
        
        if (!Double.isInfinite(d)) {
            double exponent = Math.round(d);
            // elevamos el exponente con la base de 3
            double result = Math.pow(3, exponent);
            if (result == n)
                flag = true;
        }
        
        return flag;
    }
    
}
