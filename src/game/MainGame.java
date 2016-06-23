/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author apple
 */
public class MainGame extends Application {

    Game game = new Game();
    
    @Override
    public void start(Stage stage) throws Exception {

        game.initialize(stage);
        game.beginGameLoop();
       
        stage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
