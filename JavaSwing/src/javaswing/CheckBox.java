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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */
public class CheckBox extends JFrame {
    
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;
    
    public CheckBox() {
        
        super("CheckBox");
        setLayout(new FlowLayout());
        int columns = 20;
        tf = new JTextField("This is a sentence", columns);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        
        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);
        
        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
        
    }
    
    private class HandlerClass implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {
            Font font = null;
            
            if (boldbox.isSelected() && italicbox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            }
            else if (boldbox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            }
            else if (italicbox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            }
            else {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            
            tf.setFont(font);
        }
        
    }
    
}
