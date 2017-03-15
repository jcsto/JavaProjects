/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion = 0, el;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1-) Agregar un elemento al Inicio de la Lista\n"
                        + "2-) Agregar un elemento al Final de la Lista\n"
                        + "3-) Mostrar los datos de la Lista\n"
                        + "4-) Eliminar elemento del inicio\n"
                        + "5-) Eliminar elemento del final\n"
                        + "6-) Eliminar elemento especifico\n"
                        + "7-) Buscar un elemento\n"
                        + "8-) Obtener tamanho de la Lista\n"
                        + "9-) Ordenar Lista\n"
                        + "10-) Salir", "Menu de Opciones", 3));
                switch(opcion) {
                    case 1:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento:", "Insertando al Inicio", 3));
                            // agregar al NODO
                            lista.agregarNodoAlInicio(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 2:
                        
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento:", "Insertando al Final", 3));
                            // agregar al NODO
                            lista.agregarNodoAlFinal(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        
                        break;
                    case 3:
                        // mostrar la lista
                        lista.mostrarLista();
                        break;
                    case 4:
                        el = lista.eliminaNodoInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es " + el, "Eliminando Nodo del Inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        el = lista.eliminaNodoFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es " + el, "Eliminando Nodo del Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if (lista.isEmpty())
                            JOptionPane.showMessageDialog(null, "La lista esta vacia, no puede eliminar elementos.", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
                        else {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a Eliminar", "Eliminando nodos en especifico", JOptionPane.INFORMATION_MESSAGE));
                            boolean check = lista.estaEnLaLista(el);
                            if (check) {
                                lista.eliminaNodoEspecifico(el);
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + el, "Eliminando nodos en especifico", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "El elemento " + el + " NO esta en la lista.", "Elemento NO encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        break;
                    case 7:
                        if (lista.isEmpty())
                            JOptionPane.showMessageDialog(null, "La lista esta vacia, no puede buscar elementos.", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
                        else {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a Buscar", "Eliminando nodos en especifico", JOptionPane.INFORMATION_MESSAGE));
                            boolean check = lista.estaEnLaLista(el);
                            if (check)
                                JOptionPane.showMessageDialog(null, "El elemento " + el + " esta en la lista.", "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "El elemento " + el + " NO esta en la lista.", "Elemento NO encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 8:
                        if (lista.isEmpty())
                            JOptionPane.showMessageDialog(null, "La lista esta vacia.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null, "La Lista tiene: " + lista.obtenerTamanhoLista() + " elementos.");
                        
                        break;
                    case 9:
                        if (lista.isEmpty())
                            JOptionPane.showMessageDialog(null, "La lista esta vacia.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        else {
                            lista.ordernarLista();
                            JOptionPane.showMessageDialog(null, "La Lista se ha ordenado.");
                        }
                        
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion != 10);
    }
    
}
