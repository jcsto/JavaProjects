/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import java.util.Arrays;

/**
 *
 * @author JC
 */
public class MissingNumber {
    /*
     Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
        find the one that is missing from the array.
    *
    For example,
    Given nums = [0, 1, 3] return 2. 
    *
    */
    
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        int res = missingNumber(a);
        System.out.println("Missing Number Result: " + res);
    }
    
    public static int missingNumber(int[] nums) {
        int res = 0, i;
        boolean flag = false;
        Arrays.sort(nums);
        
        for (i = 0; i < nums.length; i++) {
            System.out.println("" + nums[i]);
            if (i != nums[i]) {
                res = i;
                flag = true;
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            res = i;
        }
        
        return res;
    }
    
}
