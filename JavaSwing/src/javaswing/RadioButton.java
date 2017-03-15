/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */
public class RadioButton extends JFrame {
    
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb, bb, ib, bib;
    private ButtonGroup group;
    
    public RadioButton() {
        
        // set title
        super("RadioButton");
        // set layout
        setLayout(new FlowLayout());
        // create textfield with width
        tf = new JTextField("JC is awesome and hot", 25);
        // add textfield to app
        add(tf);
        // true -> CHECKED, false -> UNCHECKED
        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", false);
        ib = new JRadioButton("italic", false);
        bib = new JRadioButton("bold and italic", false);
        // add radio buttons to app
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        // grupo para saber cuando uno esta en CHECKED, si uno esta checkeado los otros no lo estaran
        group = new ButtonGroup();
        // add radio buttons to group
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);
        // create font(Fuente, CARACTERIST, TAMANHO)
        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        
        // assign the font obj 'pf' to the textfield  
        tf.setFont(pf);
        
        // wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
        
        
    }
    
    private class HandlerClass implements ItemListener {

        private Font font;
        
        public HandlerClass(Font f) {
            // the font passed is added to the var
            this.font = f;
        }
        
        @Override
        // set font to the font object what was passed in
        public void itemStateChanged(ItemEvent ie) {
            tf.setFont(font);
        }
        
        
        
    }
    
}
