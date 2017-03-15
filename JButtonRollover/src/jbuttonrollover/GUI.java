/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbuttonrollover;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class GUI extends JFrame {
    
    JButton custom, boton;
    
    public GUI() {
        super("Titulo");
        setLayout(new FlowLayout());
        boton = new JButton("reg button");
        add(boton);
        
        Icon b = new ImageIcon(getClass().getResource("b.jpg"));
        Icon x = new ImageIcon(getClass().getResource("x.jpg"));
        custom = new JButton("Custom", b);
        custom.setRolloverIcon(x);
        add(custom);
        
        HandlerClass handler = new HandlerClass();
        boton.addActionListener(handler);
        custom.addActionListener(handler);
        
    }
    
}

class HandlerClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, String.format("%s", ae.getActionCommand()));
    }
    
}
