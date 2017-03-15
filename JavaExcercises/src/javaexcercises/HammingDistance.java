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
public class HammingDistance {
    
    public HammingDistance() {
        
        int res = hammingDistance(1577962638, 1727613287);
        System.out.println("Hamming Distance Result: " + res);
    }
    
    public int hammingDistance(int x, int y) {
        
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        int res = 0, mayor;
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        
        if (a.length() > b.length())
            res = operacion(b.length(), a.length(), b, a);
        else
            res = operacion(a.length(), b.length(), a, b);
        /*
         * SOLO FUNCIONA CON NUMEROS PEQUENHOS
         
        if (a.length() > b.length())
            mayor  = a.length();
        else
            mayor  = b.length();
        
        byte b1 = (byte) x;
        a = String.format("%" + mayor + "s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
    
        byte b2 = (byte) y;
        b = String.format("%" + mayor + "s", Integer.toBinaryString(b2 & 0xFF)).replace(' ', '0');
        *
        for (int i = 0; i < mayor; i++) {
            if ( a.charAt(i) != b.charAt(i))
                res++;
        }
        *
        */
        //res = x ^ y; // OPERACION XOR
        return res;
    }
     
    public int operacion(int menor, int mayor, String men, String may) {
        int res = 0;
        
        for (int i = 0; i < mayor; i++) {
            if (mayor > menor) {
                menor++;
                men = "0" + men;
            }
            if (mayor == menor)
                break;
        }
        
        for (int i = 0; i < mayor; i++) {
            if ( may.charAt(i) != men.charAt(i))
                res++;
        }
        return res;
    }
    
    
}
