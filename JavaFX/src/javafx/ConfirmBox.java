/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author JC
 */
public class ConfirmBox {
    
    // var to store answer
    static boolean answer;
    
    public static boolean display(String title, String message) {
        Stage window = new Stage();
        // Defines a modal window that blocks events from being delivered to any other application window.
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label label = new Label(message);
        
        // create 2 buttons
        Button yesButton = new Button("yes");
        Button noButton = new Button("no");
        
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        // centrar los elementos
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return answer;
        
    }
    
    
}
