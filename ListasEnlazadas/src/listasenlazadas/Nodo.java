/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author JC
 */
public class Nodo {
    
    public int dato;
    public Nodo siguiente; // puntero enlace
    
    // constructor para insertar al final
    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null;
    }
    
    // constructor para insertar al Inicio
    public Nodo(int d, Nodo sig) {
        this.dato = d;
        this.siguiente = sig;
    }
}
