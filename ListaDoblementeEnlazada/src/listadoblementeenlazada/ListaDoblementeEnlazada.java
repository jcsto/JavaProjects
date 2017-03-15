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
public class ListaDoblementeEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDoble lista = new ListaDoble();
        int op = 0, elemento;
        
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Agregar un Nodo al Inicio \n" +
                        "2. Agregar un Nodo al Final \n" +
                        "3. Mostrar la Lista de Inicio a Fin \n" +
                        "4. Mostrar la Lista de Fin a Inicio \n" +
                        "5. Salir\n" +
                        "Que deseas Hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE
                ));
                
                switch(op) {
                    case 1:
                        // agregar elemento al inicio
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del Nodo", 
                                "Agregando Nodo al Inicio", JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarNodoAlInicio(elemento);
                        break;
                    case 2:
                        // agregar elemento al final
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del Nodo", 
                                "Agregando Nodo al Final", JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarNodoAlFinal(elemento);
                        break;
                    case 3:
                        // mostrar lista de inicio a fin
                        if ( !lista.estaVacia() ) {
                            lista.mostrarListaInicioFin();
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos", "Lista Vacia", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        // mostrar lista de fin a inicio
                        if ( !lista.estaVacia() ) {
                            lista.mostrarListaFinInicio();
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos", "Lista Vacia", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        // salir
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", 
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu", "Error en opcion", 
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                        
            }catch(NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
            
        }while (op != 5);
        
    }
    
}
