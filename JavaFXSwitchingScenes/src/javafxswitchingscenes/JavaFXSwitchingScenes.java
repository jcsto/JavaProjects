/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxswitchingscenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author JC
 */
public class JavaFXSwitchingScenes extends Application {
    
    Scene scene1, scene2;
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        
        window = primaryStage;
        
        Label label1 = new Label("Welcome to the first scene");
        
        // boton 1
        Button boton1 = new Button("Go to Scene 2");
        // LAMBDA, cambiar de Escena
        boton1.setOnAction(e -> window.setScene(scene2));
        
        // Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        // agregar label y boton al layout
        layout1.getChildren().addAll(label1, boton1);
        // agregar layout a la escena
        scene1 = new Scene(layout1, 200, 200);
        
        // boton 2
        Button boton2 = new Button("This scene sucks, go back to scene 1");
        // LAMBDA, cambiar de Escena
        boton2.setOnAction(e -> window.setScene(scene1));
        
        // layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(boton2);
        scene2 = new Scene(layout2, 600, 300);
        
        window.setScene(scene1);
        window.setTitle("Mi titulo");
        window.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
