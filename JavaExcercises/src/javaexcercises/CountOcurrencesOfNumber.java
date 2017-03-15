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
public class CountOcurrencesOfNumber {
    
    public static void main(String[] args) {
        int[] a = {1,1,3,3,5,5,5,5,5,9,9,11};
        int x = Integer.parseInt(JOptionPane.showInputDialog("Numero que desea buscar"));
        int res = CountOcurrencesOfNumber.occurrencesOfNumber(a, a.length, x, true);
        
        if (res == -1)
            System.out.println("Elemento no encontrado");
        else {
            int lastIndex = CountOcurrencesOfNumber.occurrencesOfNumber(a, a.length, x, false);
            System.out.println("El numero " + x + " tiene " + (lastIndex - res + 1) + " ocurrencias.");
        }
    }
    
    public static int occurrencesOfNumber(int[] array, int n, int x, boolean searchFirst) {
        int low = 0, high = n - 1, result = -1;
        // Binary Search Modified
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (x == array[mid]) {
                result = mid;
                if (searchFirst)
                    high = mid - 1; // sigue buscando a la izquierda
                else
                    low = mid + 1; // sigue buscando a la derecha
            }
            else if (x < array[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }
    
    /*
    * WORST SOLUTION
    *
    for (int i = 0; i < n; i++) {
        if (array[i] == x) {
            count++;
        }
        else if (array[i] > x)
            break;
    }
    */
    
}
