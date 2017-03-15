/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author JC
 */
public class PrintReverseArray {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = n - 1; i > -1; i--){
            arr[i] = in.nextInt();
        }
        for (Integer res : arr) {
            System.out.print(res + " ");
        }
        in.close();
    }
    
}
