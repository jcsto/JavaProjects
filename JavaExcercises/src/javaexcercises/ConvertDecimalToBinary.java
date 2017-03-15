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
public class ConvertDecimalToBinary {
    
    public static void main(String[] args) {
        String res = convertDecToBin(156);
        System.out.println("Result:" + res);
    }
    
    public static String convertDecToBin(int n) {
        int res, cos;
        StringBuilder cad = new StringBuilder(""), aux;
        
        while (n > 1) {
            System.out.print(n + ", ");
            n /= 2;
            n = Math.round(n);
            res = n % 2;
            cad.append(res);
            System.out.println("" + cad.toString());
        }
        aux = new StringBuilder(cad.reverse());
        
        return aux.toString();
    }
    
}
