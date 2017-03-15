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
public class NUmberOf1Bits {
    
    public NUmberOf1Bits() {
        hammingWeight(100115152);
    }
    
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
    
}
