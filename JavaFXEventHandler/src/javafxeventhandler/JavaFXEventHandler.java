/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxeventhandler;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JC
 */

// NO SE NECESITA IMPLEMENTAR EL EVENTHANDLER PORQUE SE USA UNA FUNCION LAMBDA
// SI SE LLAMA, HAY QUE IMPLEMENTAR SUS METODOS OBLIGATORIAMENTE POR SER UNA INTERFAZ
public class JavaFXEventHandler extends Application implements EventHandler<ActionEvent> {

    Button boton;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // instanciar boton y colocarle el texto
        boton = new Button();
        boton.setText("Click");
        
        /****************************************************
         * 
            // cuando se de click en el boton, enviar la accion a esta clase, metodo handle()
        // boton.setOnAction(this);
            // UNA ALTERNATIVA ES USAR UNA FUNCION ANONIMA PARA NO USAR EL METODO AFUERA
            // Y TE PERMITE NO USAR UNA VERIFICACION DE EN CUAL BOTON OCURRIO EL EVENTO
        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Soy una clase interna anonima.");
            }
            
        });
        * 
        * ********************************/
        
        // EXPRESION LAMBDA, sustituye lo de arriba
        // e Representa el Evento
        // AL HACER CLIC AL BOTON SE EJECUTA LO DE ADENTRO
        boton.setOnAction(e -> {
            // multiples lineas de codigo AL HACER CLIC AL BOTON
            System.out.println("I am a Lambda Function");
            System.out.println("I am a blabla");
        });
        // layout, forma de acomodar los elementos
        StackPane layout = new StackPane();
        // agregar al layout el boton
        layout.getChildren().add(boton);
        
        //crear la escena donde estara todo el programa
        // agregar layout y asignar ancho y alto
        Scene scene = new Scene(layout, 300, 500);
        // titulo al Stage o ventana
        primaryStage.setTitle("Mi Ventana");
        // asignar una escena a la ventana
        primaryStage.setScene(scene);
        // hacer visible la ventana o Stage
        primaryStage.show();
        
    }
    /*
    @Override
    public void handle(ActionEvent event) {
        // accion del evento
        if (event.getSource() == boton) {
            System.out.println("Clickeaste en el boton");
        }
        
    }
    */

    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
