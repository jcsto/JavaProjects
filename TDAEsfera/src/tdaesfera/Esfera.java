/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdaesfera;

/**
 *
 * @author JC
 */
public class Esfera {
    
    private double radio;
    
    // constructor
    public Esfera(double radioInicial) {
        if ( radioInicial > 0)
            this.radio = radioInicial;
        else
            this.radio = 0.0;
    }
    
    //metodos u operaciones de Esfera
    public double getRadio() {
        return this.radio;
    }
    
    public double getDiametro() {
        return (this.radio * 2);
    }
    
    public double getCircunferencia() {
        return (Math.PI * getDiametro());
    }
    
    public double getArea() {
        return (4 * Math.PI * (this.radio * this.radio));
    }
    
    public double getVolumen() {
        return ((4 * Math.PI * (Math.pow(this.radio, 3))) / 3 );
    }
    
}
