/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
    static boolean up, down, left, right, z, c;
    static final double WIDTH = 800, HEIGHT = 600;
    private StackPane root;
    private Scene scene;
    GameManager gameManager;
    GameLoop gameLoop;
    Image playerImage;
    static Player player;

    @Override
    public void start(Stage stage) throws Exception {
        root = new StackPane();

        scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);
        
        loadImageAssets();
        createPlayer();
        createAndStartGameLoop();     
        createInputHandling();

        stage.setScene(scene);
        stage.show();
    }
    
    private void loadImageAssets() {
        playerImage = new Image(getClass().getResource("earth.png").toExternalForm());
    }
    
    private void createPlayer() {
        player = new Player(0, 0, playerImage);
        root.getChildren().add(player.spriteFrame);
    }

    private void createGameManager() {
        gameManager = new GameManager();
        gameManager.addCurrentSprites(player);
        
    }

    private void createAndStartGameLoop() {
        gameLoop = new GameLoop();
        gameLoop.start();
    }

    private void createInputHandling() {
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                    up = true;
                    System.out.println(event.getCode() + "pressed");
                    break;
                case DOWN:
                    down = true;
                    System.out.println(event.getCode() + "pressed");
                    break;
                case LEFT:
                    left = true;
                    System.out.println(event.getCode() + "pressed");
                    break;
                case RIGHT:
                    right = true;
                    System.out.println(event.getCode() + "pressed");
                    break;  
                case Z:
                    z = true;
                    System.out.println(event.getCode() + "pressed");
                    break;
                case C:
                    c = true;
                    System.out.println(event.getCode() + "pressed");
                    break;
            }
        });

        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                    up = false;
                    System.out.println(event.getCode() + "released");
                    break;
                case DOWN:
                    down = false;
                    System.out.println(event.getCode() + "released");
                    break;
                case LEFT:
                    left = false;
                    System.out.println(event.getCode() + "released");
                    break;
                case RIGHT:
                    right = false;
                    System.out.println(event.getCode() + "released");
                    break;
                case Z:
                    z = false;
                    System.out.println(event.getCode() + "released");
                    break;
                case C:
                    c = false;
                    System.out.println(event.getCode() + "released");
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
