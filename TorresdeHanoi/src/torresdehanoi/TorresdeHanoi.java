/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;

/**
 *
 * @author JC
 */
public class TorresdeHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TorresdeHanoi hanoi = new TorresdeHanoi();
        hanoi.torresHanoi(3, 1, 2, 3);
        System.out.println("Juego completado.");
    }
    
    public void torresHanoi(int discos, int torreUno, int torreDos, int torreTres) {
        // caso base
        if ( discos == 1)
            System.out.println("Mover disco de torre origen " + torreUno + " a torre " + torreTres);
        else {
            torresHanoi(discos - 1, torreUno, torreTres, torreDos);
            System.out.println("Mover disco de torre origen " + torreUno + " a torre " + torreTres);
            torresHanoi(discos - 1, torreDos, torreUno, torreTres);
        }
    }
    
}
