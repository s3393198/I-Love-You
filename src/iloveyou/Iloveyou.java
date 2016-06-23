/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iloveyou;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
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
 * @author apple
 */
public class Iloveyou extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
       
        stage.setTitle("Project I Love You");
        
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        Canvas canvas = new Canvas(1024, 768);
        root.getChildren().add(canvas);
        
        Timeline gameLoop = new Timeline();
        gameLoop.setCycleCount(Animation.INDEFINITE);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Image test = new Image("assets/earth.png");
        
        final long timeStart = System.currentTimeMillis();
        
        KeyFrame kf = new KeyFrame(Duration.seconds(0.017), new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                
                double t = (System.currentTimeMillis() - timeStart) / 1000.0;
               
                double x = Math.cos(t);
                double y = Math.sin(t);
                
                gc.clearRect(0, 0, 768, 1024);
                
                gc.drawImage(test, x,y);
               
            }
        });
        
        gameLoop.getKeyFrames().add(kf);
        gameLoop.play();
        
        stage.setResizable(false); 
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
