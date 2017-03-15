/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author JC
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        /*
         * CODE TO EVALUATE
         * ...
         */
        double endTime   = System.currentTimeMillis();
        double totalTime = endTime - startTime;
        //System.out.println(totalTime);
        int[] a = {1,0,2,5,4,3};
        
        /****** SELECTION SORT *******/
        int[] selection = selectionSort(a, a.length);
        System.out.println("Selection Sort: ");
        for (int i : selection) {
            System.out.print("" + i + ", ");
        }
        System.out.println();
        
        /****** BUBBLE SORT *******/
        int[] burbuja = SortingAlgorithms.bubbleSort(a);
        System.out.println("Bubble Sort: ");
        for (int i : burbuja) {
            System.out.print("" + i + ", ");
        }
        System.out.println();
        
        /****** INSERTION SORT *******/
        int[] insertion = insertionSort(a, a.length);
        System.out.println("Insertion Sort: ");
        for (int i : insertion) {
            System.out.print("" + i + ", ");
        }
        System.out.println();
        
    }
    
/*
 * Selection Sort Algorithm
 *
 * LEFT HAND --> UNSORTED ARRAY 'A'
 * RIGHT HAND --> SORTED ARRAY 'B'
 *
 */
 
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
    
    private static int[] bubbleSort(int[] a) {
        int aux;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                // mediante un arreglo
                if (a[j] > a[j+1]) {
                    aux = a[j];
                    //a[j] = a[j+1];
                    //a[j+1] = aux;
                }
            }
        }
        return a;
    }
    
    private static int[] insertionSort(int[] a, int n) {
        int value, hole;
        
        for (int i = 1; i < n; i++) {
            value = a[i];
            hole = i;
            while (hole > 0 && a[hole-1] > value) {
                a[hole] = a[hole-1];
                hole--;
            }
            a[hole] = value;
        }
        return a;
    }
    
}
