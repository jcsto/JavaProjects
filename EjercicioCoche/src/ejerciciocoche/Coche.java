/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocoche;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class Coche {
    
    private String marca, modelo;
    private int color;
    private List<Rueda> ruedas = null;
    private List<Motor> motores = null;
    private List<Puerta> puertas = null;

    
    public Coche() {
        ruedas = new ArrayList();
        // agregar las 4 ruedas al auto
        for (int i = 0; i < 4; i++) {
            ruedas.add(new Rueda());
        }
        
        motores = new LinkedList();
        // agregar un motor
        motores.add(new Motor());
        
        puertas = new ArrayList();
        boolean estadoPuertas = false;
        String numPuertas = JOptionPane.showInputDialog("Selecciona de cuantas puertas desea el auto (de 2 a 5)");
        int _numPuertas = Integer.parseInt(numPuertas);
        // determinar cuantas puertas tendra el auto
        while(estadoPuertas) {
            estadoPuertas = false;
            numPuertas = JOptionPane.showInputDialog("Selecciona de cuantas puertas desea el auto (de 2 a 5)");
            _numPuertas = Integer.parseInt(numPuertas); 
            if ( _numPuertas < 2 && _numPuertas > 5 )
                estadoPuertas = true;
            
        }
        
        for ( int i = 0; i < _numPuertas; i++) {
            puertas.add(new Puerta());
        }
                
                
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
    }
    
}
