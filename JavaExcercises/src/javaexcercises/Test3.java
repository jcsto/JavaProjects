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
public class Test3 {
    
    public static void main(String[] args) {
        int[] a = {10,7,7,8,8,25,25};
        int p = 0, aux = 0;
        a = selectionSort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            aux = 0;
            for (int j = 1; j < a.length - 1; j++) {
                System.out.println(occurrencesOfNumber(a, a.length, a[j], true) + " - " + a[i] + "=" + a[j]);
                if (a[i] == a[j]) {
                    aux++;
                }
                else {
                    p = a[i];
                    break;
                }
            }
            
            if (aux == 0) {
                break;
            }
        }
        
        System.out.println("Res: " + p);
    }
    
    private static int[] selectionSort(int[] a, int n) { // need to do n-2 passes
        
        for (int i = 0; i < n - 1; i++) // ith position: elements from i untill n-1 are candidates
        {
                int iMin = i;
                for (int j = i+1; j < n; j++)
                {
                        if (a[j] < a[iMin])
                        iMin = j; // update the index of the minimum element
                }
                int temp = a[i];
                a[i] = a[iMin];
                a[iMin] = temp;
        }
        
        return a;
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
    
}
