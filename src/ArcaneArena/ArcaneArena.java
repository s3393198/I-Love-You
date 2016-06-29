/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author apple
 */
public class ArcaneArena extends Application {
    
    boolean up, down, left, right, z, c;
   static final double WIDTH = 800, HEIGHT = 600;
    
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);
        
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP: up = true;break;
                case DOWN: down = true; break;
                case LEFT: left = true; break;
                case RIGHT: right = true; break;
                case Z: z = true; break;
                case C: c = true; break;
            }
        });
        
        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP: up = false;break;
                case DOWN: down = false; break;
                case LEFT: left = false; break;
                case RIGHT: right = false; break;
                case Z: z = false; break;
                case C: c = false; break;
                
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
