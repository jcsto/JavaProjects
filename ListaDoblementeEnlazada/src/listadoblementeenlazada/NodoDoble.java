/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeenlazada;

/**
 *
 * @author JC
 */
public class NodoDoble {
    
    public int dato;
    NodoDoble siguiente, anterior;
    
    public NodoDoble(int el) {
        this(el, null, null);
        /*this.dato = el;
        this.siguiente = null;
        this.anterior = null;*/
    }
    
    public NodoDoble(int el, NodoDoble sig, NodoDoble ant) {
        this.dato = el;
        this.siguiente = sig;
        this.anterior = ant;
    }
    
}
