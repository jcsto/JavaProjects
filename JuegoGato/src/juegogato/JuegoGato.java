/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogato;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JC
 */
public class JuegoGato extends JFrame {

    // variables globales
    JPanel panel = new JPanel();
    JButton campo[] = new XOButton[9];
    JLabel jugadorUno = new JLabel("Jugador 1");
    JLabel jugadorDos = new JLabel("Jugador 2");
    JLabel turnoJugar = new JLabel();
    ImageIcon X, O;
    byte valor = 0;
    /**
     * 0 = nada
     * 1 = X
     * 0 = O
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear instancia de la clase
        new JuegoGato();
    }
    
    public JuegoGato() {
        // titulo de la ventana
        super("Juego del Gato - Tic Tac Toe");
        // hacerlo NO redimensionable
        setResizable(false);
        // asignar tamanho de la ventana wxh, anchoxalto, en pixeles
        setSize(400, 400);
        // cierre del programa al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // GridLayout que permite una rejilla, esta sera de 3x3
        panel.setLayout(new GridLayout(4, 3));
        
        for (int i = 0; i < 9; i++) {
            // cada elemento en el arreglo sera un objeto de JButton
            campo[i] = new XOButton();
            
            /*
            // posicion del boton
            campo[i].setLayout(null);
            // asignar un tamanho a los botones
            campo[i].setPreferredSize(new Dimension(60, 60));
            */
            // agregar boton al panel
            panel.add(campo[i]);
        }
        
        // agregar los dos puntos al texto del label
        this.jugadorUno.setText(this.jugadorUno.getText() + ": ");
        this.jugadorDos.setText(this.jugadorDos.getText() + ": ");
        this.turnoJugar.setText("Turno de jugar");
        
        panel.add(this.jugadorUno);
        panel.add(this.turnoJugar);
        panel.add(this.jugadorDos);
        
        // agregar panel al programa
        add(panel);
        
        
        
        // hacer visible el frame
        setVisible(true);
    }

}
