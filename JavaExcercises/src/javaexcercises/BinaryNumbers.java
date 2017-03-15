/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import java.io.*;
import java.util.*;

/**
 *
 * @author JC
 */
public class BinaryNumbers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), k, cont = 0, aux = -1;
        String s = Integer.toBinaryString(x);
        //System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            k = i;
            if (s.charAt(i) == '1') {
                if (cont == 0) {
                    cont++;
                }
                else {
                    if (aux == cont) {
                        aux = cont;
                    }
                    else if (aux > cont) {
                        cont = aux;
                    }
                    else {
                        cont++;
                    }
                    aux = cont;
                }
                 
                //System.out.println("" + s.charAt(i));
                /*while (s.charAt(k) == '1' && k < s.length()) {
                    cont++;
                    k++;
                }*/
            }
            else {
                if ( (i + 1) == s.length())
                    break;
                else
                    cont = 0;
            }
        }
        System.out.println(cont + " - " + aux);
    }
    
}
