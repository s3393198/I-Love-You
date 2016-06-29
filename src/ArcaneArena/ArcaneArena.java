/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author apple
 */
public class ArcaneArena extends Application {

    // Z: Use Scroll
    // C: Fist Attack
    boolean up, down, left, right, z, c;
    static final double WIDTH = 800, HEIGHT = 600;
    private StackPane root;
    private Scene scene;
    GameManager gameManager;
    GameLoop gameLoop;

    @Override
    public void start(Stage stage) throws Exception {
        root = new StackPane();

        scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);

        stage.setScene(scene);
        stage.show();
    }
    
    private void createGameManager() { 
        gameManager = new GameManager();
        
    }
    
    private void createAndStartGameLoop() {
        gameLoop = new GameLoop();
    }

    private void createInputHandling() {
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                    up = true;
                    break;
                case DOWN:
                    down = true;
                    break;
                case LEFT:
                    left = true;
                    break;
                case RIGHT:
                    right = true;
                    break;
                case Z:
                    z = true;
                    break;
                case C:
                    c = true;
                    break;
            }
        });

        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                    up = false;
                    break;
                case DOWN:
                    down = false;
                    break;
                case LEFT:
                    left = false;
                    break;
                case RIGHT:
                    right = false;
                    break;
                case Z:
                    z = false;
                    break;
                case C:
                    c = false;
                    break;

            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
