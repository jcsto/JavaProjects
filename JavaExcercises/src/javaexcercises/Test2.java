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
public class Test2 {
    
    public static void main(String[] args) {
        int[] a = {7,5,2,8,-2,25,25};
        //int[] a = {-27676,211621,904304,161270,-292822,732004,860511,-825806,-721722,536428,-927571,-287004};
        a = wiggleArrangeArray(a);
        System.out.println("\nResult: ");
        for (int i : a) {
            System.out.print(" " + i);
        }
    }
    
    static int[] wiggleArrangeArray(int[] intArr) {
        intArr = selectionSort(intArr, intArr.length);
        int[] aux = new int[intArr.length];
        int mitad = intArr.length % 2;
        int k = intArr.length - 1, p = 0;
        String s = "";
        
        for (int i = 0; i < intArr.length; i++) {
            //System.out.println(k + " = " + i + "[][] " + s);
            if ( k == i && mitad != 0) {
                s += intArr[k] + ",";
                break;
            }
            s += intArr[k] + "," + intArr[i] + ",";
            if ( k - 1 == i && mitad == 0) {
                //System.out.println("mitad = 0;");
                break;
            }
            
            k--;
            p++;
        }
        s = s.substring(0, s.length()-1);
        String[] stringArray = s.split(",");
        int[] res = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String numberAsString = stringArray[i];
            res[i] = Integer.parseInt(numberAsString);
        }
        return res;
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
    
}
