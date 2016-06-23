/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author NTV
 */
public class Game {

    // The JavaFX scene 
    private Scene mainGameScene;

    // The main game loop 
    private static Timeline gameLoop;

    // Frames per second
    private final int FPS = 60;

    // Windows title
    private final String windowsTitle = "Project I Love You";

    Group root = new Group();
    Canvas canvas = new Canvas(1024, 768);

    public Game() {
        buildAndSetGameLoop();
    }

    private void buildAndSetGameLoop() {

        gameLoop = new Timeline();
        
        gameLoop.setCycleCount(Animation.INDEFINITE);

        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        final long timeStart = System.currentTimeMillis();

        KeyFrame kf = new KeyFrame(Duration.seconds(0.0017), new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {

                double t = (System.currentTimeMillis() - timeStart) / 1000.0;
                double x = 500 + 128 * Math.cos(t);
                double y = 500 + 128 * Math.sin(t);

                gc.clearRect(0, 0, 1024, 768);

                gc.drawImage(new Image("assets/earth.png"), x, y);

            }
        });

        gameLoop.getKeyFrames().add(kf);
        
        setGameLoop(gameLoop);

    }

    public void beginGameLoop() {
        getGameLoop().play();
    }

    public void initialize(Stage stage) {
        stage.setTitle(windowsTitle);

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
    
    }

    public Scene getMainGameScene() {
        return mainGameScene;
    }

    public void setMainGameScene(Scene mainGameScene) {
        this.mainGameScene = mainGameScene;
    }

    public static Timeline getGameLoop() {
        return gameLoop;
    }

    public static void setGameLoop(Timeline gameLoop) {
        Game.gameLoop = gameLoop;
    }

}
