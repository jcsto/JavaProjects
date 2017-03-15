/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int x = Integer.parseInt(JOptionPane.showInputDialog("Que numero desea buscar del array?"));
        int res = BinarySearch.binarySearch(a, a.length, x);
        
        if (res == -1)
            JOptionPane.showMessageDialog(null, "Elemento no encontrado");
        else
            JOptionPane.showMessageDialog(null, "Elemento encontrado en la posicion " + res + " del array.");
    }
    
    public static int binarySearch(int[] array, int longitud, int elemento) {
        int low = 0, high = longitud - 1, result = -1;
        
        while (low <= high) {
            
            int mid = ((low + high) / 2);
            if (elemento == array[mid]) {
                result = mid;
                low = mid + 1;
            }
            else if (elemento < array[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return result;
    }
    
}
