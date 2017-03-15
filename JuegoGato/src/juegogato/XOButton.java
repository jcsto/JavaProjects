/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author JC
 */
class XOButton extends JButton implements ActionListener {
    
    ImageIcon X, O;
    byte valor = 0;
    /**
     * 0 = nada
     * 1 = X
     * 0 = O
     */
    
    public XOButton() {
        X = new ImageIcon(this.getClass().getResource("/Imagenes/x.png"));
        O = new ImageIcon(this.getClass().getResource("/Imagenes/o.png"));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        valor++;
        valor %= 3;
        System.out.println("" + valor);
        switch(valor) {
            case 0:
                // tres clicks detectados
                setIcon(null);
                break;
            case 1:
                // un click detectado
                setIcon(X);
                
                break;
            case 2:
                // dos clic detectados
                setIcon(O);
                
                
                break;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
