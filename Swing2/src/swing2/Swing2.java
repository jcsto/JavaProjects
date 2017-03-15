/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */
public class Swing2 extends JFrame {
    
    JPanel            panel = new JPanel();
    JLabel            label = new JLabel("Nombre: ");
    JButton           boton = new JButton("Enviar");
    JTextField nombreTxt    = new JTextField(20);
    JTextArea comentarios   = new JTextArea("Hola\njeje", 5, 20);
    String opt[] = {
        "Desayunar",
        "Almorzar",
        "Comer"
    };
    JComboBox opciones      = new JComboBox(opt);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Swing2();
    }
    
    public Swing2() {
        // titulo a la ventana (Frame)
        super("Ejercicio Swing Basico 2");
        
        // asignar tamanho de la ventana wxh, anchoxalto, en pixeles
        setSize(200, 300);
        
        // cierre del programa al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // se indica si la ventana puede redimensionarse
        setResizable(true);
        
        // CODIGO DEL FRAME
        
        // agregar un elemento al panel
        panel.add(label);
        panel.add(nombreTxt);
        panel.add(opciones);
        panel.add(comentarios);
        panel.add(boton);
        // agregar al panel al frame
        add(panel);
        
        // hace visible la ventana junto con las modificaciones hechas
        setVisible(true);
    }
    
}
