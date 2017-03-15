/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class ListaDoble {
    private NodoDoble inicio, fin;
    
    public ListaDoble() {
        this.inicio = this.fin = null;
    }
    
    // metodo apra saber cuando la lista esta vacia
    public boolean estaVacia() {
        return this.inicio == null;
    }
    
    // metodo para agregar nodos al final
    public void agregarNodoAlFinal(int el) {
        if (!estaVacia()) {
            this.fin = new NodoDoble(el, null, fin);
            this.fin.anterior.siguiente = this.fin;
        }
        else
            this.inicio = this.fin = new NodoDoble(el);
            
    }
    
    // metodo para agregar nodo al inicio
    public void agregarNodoAlInicio(int el) {
        if (!estaVacia()) {
            this.inicio = new NodoDoble(el, this.inicio, null);
            this.inicio.siguiente.anterior = this.inicio;
        }
        else
            this.inicio = this.fin = new NodoDoble(el);
        
    }
    
    // mostrar la lista de Inicio a Fin
    public  void mostrarListaInicioFin() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = this.inicio;
            while (auxiliar != null) {
                datos += "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            
        }
    }
    
    // mostrar la lista de Fin a Inicio
    public  void mostrarListaFinInicio() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = this.fin;
            while (auxiliar != null) {
                datos += "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            
        }
    }
    
}
