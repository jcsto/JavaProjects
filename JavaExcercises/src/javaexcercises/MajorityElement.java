/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import java.util.ArrayList;

/**
 *
 * @author JC
 */
public class MajorityElement {
    
    /*
    Given an array of size n, find the majority element. 
    The majority element is the element that appears more than [ n/2 ] times.
    */
    
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int res = majorityElement(a);
        System.out.println("Majority Element Result: " + res);
        // SIN RESOLVER
    }
    
    public static int majorityElement(int[] nums) {
        int res = 0, aux = -1, cont = 0;
        ArrayList <Integer> lista = new ArrayList<>();
        System.out.print("Elements: ");
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    aux = nums[i];
                    cont++;
                    lista.add(aux);
                    lista.add(cont);
                }
            }
        }
        
        return res;
    }
    
}
