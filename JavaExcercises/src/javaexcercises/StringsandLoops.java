/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author JC
 */
public class StringsandLoops {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = scan.nextInt();
        String cad = "";
        System.out.println(cont);
        
        while (scan.hasNextLine()) {
            cad = scan.nextLine();
            String  res1 = "", res2 = "";
            
            if (!cad.isEmpty()) {
                for (int i = 0; i < cad.length(); i++) {
                    if ((i % 2 == 0) || i ==0) {
                        res1 += cad.charAt(i);
                    }
                    else {
                        res2 += cad.charAt(i);
                    }
                }
                System.out.println(res1 + " " + res2);
            }
        }
        scan.close();
    }
}
