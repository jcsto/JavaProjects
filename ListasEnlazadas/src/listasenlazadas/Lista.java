/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author JC
 */
public class Lista {
    
    protected Nodo inicio, fin; // punteros para saber donde esta el inicio y el fin
    
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    //metodo para saber si la lista esta vacia
    public boolean isEmpty() {
        if (this.inicio == null)
            return true;
        
        return false;
    }
    
    //metodo para agregar un nodo al incio de la Lista
    public void agregarNodoAlInicio(int elemento) {
        // creando al nodo
        this.inicio = new Nodo(elemento, this.inicio);
        if (this.fin == null) {
            this.fin = this.inicio;
        }
    }
    
    // metodo para agregar al final de la lista
    public void agregarNodoAlFinal(int elemento) {
        if (!isEmpty()) {
            this.fin.siguiente = new Nodo(elemento);
            this.fin = this.fin.siguiente;
        }else{
            this.inicio = this.fin = new Nodo(elemento);
        }
    }
    
    // metodo para eliminar nodo del inicio
    public int eliminaNodoInicio() {
        int elemento = this.inicio.dato;
        
        if (this.inicio == this.fin)
            this.inicio = this.fin = null;
        else {
            this.inicio = this.inicio.siguiente;
        }
        return elemento;
    }
    
    // metodo para eliminar nodo del final
    public int eliminaNodoFinal() {
        int elemento = this.fin.dato;
        
        if (this.inicio == this.fin)
            this.inicio = this.fin = null;
        else {
            Nodo temporal = this.inicio;
            while (temporal.siguiente != this.fin) {
                temporal = temporal.siguiente;
            }
            this.fin = temporal;
            this.fin.siguiente = null;
        }
        return elemento;
    }
    
    // metodo para eliminar nodo del final
    public void eliminaNodoEspecifico(int elemento) {
        
        if (!isEmpty()) {
            if (this.inicio == this.fin && elemento == this.inicio.dato)
                this.inicio = this.fin = null;
            else {
                if (elemento == this.inicio.dato) {
                    this.inicio = this.inicio.siguiente;
                }
                else {
                    Nodo anterior = this.inicio;
                    Nodo temporal = this.inicio.siguiente;
                    while (temporal != null && temporal.dato != elemento) {
                        anterior = anterior.siguiente;
                        temporal = temporal.siguiente;
                    }
                    if (temporal != null) {
                        anterior.siguiente = temporal.siguiente;
                        
                        if (temporal == this.fin)
                            this.fin = anterior;
                    }
                }
            }
        }
        
    }
    
    // obtener tamanho de la Lista (cuantos nodos)
    public int obtenerTamanhoLista() {
        int i = 1;
        Nodo temporal = this.inicio;
        while (temporal != this.fin) {
            temporal = temporal.siguiente;
            i++;
        }
        return i;
    }
    
    // vaciar la Lista de nodos
    public void vaciarLista() {
//        while (this.inicio != this.fin) {
//            //this.inicio = null;
//            this.inicio = this.inicio.siguiente;
//        }
        this.fin = null;
        this.inicio = null;
    }
    
    // metodo BURBUJA con 2 opciones redundantes: ArrayList, int[]
    private int[] metodoBurbuja (ArrayList list) {
        int[] arreglo = new int[list.size()];
        int aux, k = 0;
        ArrayList<Integer> kop = new ArrayList<>();
        kop = list;
        
        // usando arreglo: a, que tiene los valores
        /* 
        for (int i = 2; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                // mediante un arreglo
                if (a[j] > a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        */
        /****************************/
        // MEDIANTE ArrayList
        for (Integer op : kop) {
            arreglo[k] = op;
            k++;
        }
        // ordenamiento burbuja
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                // mediante un ArrayList
                if (arreglo[j] < arreglo[i]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        // vaciar los ArrayList
        kop.clear();
        list.clear();
        
        return arreglo;
    }
    
    // ordenar la Lista mediante el valor de los nodos
    public void ordernarLista() {
        // crear lista dinamica para almacenar N elementos
        ArrayList<Integer> arreglo = new ArrayList<>();
        while (this.inicio.siguiente != null) {
            // agregar el dato del nodo de la Lista al ArrayList
            arreglo.add(this.inicio.dato);
            // pasar al siguiente dato
            this.inicio = this.inicio.siguiente;
        }
        // agregar el ultimo valor que se excluye en el ciclo
        arreglo.add(this.fin.dato);
        
        // llamar al metodo de ordenamiento Burbuja
        int[] arrayOrdenado = metodoBurbuja(arreglo);
        
        // ordenar el arreglo por Java
        Collections.sort(arreglo);
        // vaciar la lista de nodos
        vaciarLista();
        // foreach con ArrayList
//        for (Integer integer : arreglo) {
//            // crear nodos de la lista nuevamente con los valores ordenados
//            agregarNodoAlInicio(integer);
//        }
        // vaciar ArrayList
        arreglo.clear();
        
        /*****************************************************/
        
        for (Integer integer : arrayOrdenado) {
            // crear nodos de la lista nuevamente con los valores ordenados
            agregarNodoAlInicio(integer);
        }
        
    }
    
    // verificar si el elemento esta en la lista
    public boolean estaEnLaLista(int elemento) {
        Nodo temporal = this.inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }
    
    //metodo para mostrar los datos
    public void mostrarLista() {
        Nodo recorrer = this.inicio;
        
        while (recorrer != null) {            
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
            
        }
        System.out.println("\n");
    }
    
}
