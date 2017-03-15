/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemultidimensionalarray;

/**
 *
 * @author JC
 */
public class ExampleMultidimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1 dimension array
        int[] arreglo = {1, 2, 3, 4};
        System.out.println("Value of position 0 (first column) of the array is:" + arreglo[0]);
        
        // multi-dimensional array
        int[][] biArray = {
            {1, 2, 3}, // an array in the position 0 of the father array 
            {4, 5, 6}, // an array in the position 1
            {100, 1}   // an array in the position 2
        };
        System.out.println("Value of first column and first row is: " + biArray[0][0]);
        
        // array of strings with 2 rows and 3 columns
        String [][] text = new String[2][3];
        text[0][2] = "Hola";
        System.out.println("Value of row 0 and column 2 is: " + text[0][2]);
        
        // see all the values of an array
        System.out.println("{");
        for (int row = 0; row < biArray.length; row++) {
            System.out.print("{");
            for (int col = 0; col < biArray[row].length; col++) {
                System.out.print(biArray[row][col] + ", ");
            }
            System.out.print("}, ");
        }
        System.out.println("\n}");
        
        // an array without column specification
        String[][] words = new String[2][];
        System.out.println("Value: " + words[0]);
        
        words[1] = new String[4];
        words[1][1] = "adios";
        System.out.println("Value: " + words[1][1]);
        
    }
    
}
