/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

/**
 *
 * @author owne
 */
import Entity.Entity;
import Entity.Player;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import tile.TiledMap;
import tile.Wall;


public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    static Scene mainScene;
    static GraphicsContext gc;
    static int WIDTH = 800;
    static int HEIGHT = 800;
    static Handler handler;
    static TiledMap tiledMap = new TiledMap();
    static Image image1,image2,image3,playerImage;


    static ArrayList<String> currentlyActiveKeys;

    @Override
    public void start(Stage mainStage)
    {
        mainStage.setTitle("Event Handling");

        Group root = new Group();
        mainScene = new Scene(root);
        mainStage.setScene(mainScene);

        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        prepareActionHandlers(mainScene);
        //Prepare all events here
        //Associate gc to the canvas to draw.
        gc = canvas.getGraphicsContext2D();
        //Get all images from all resources.
        loadGraphics();
        /**
         * Main "game" loop
         */
        final long startNanoTime = System.nanoTime();
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0; 

                double x = 232 + 128 * Math.cos(t);
                double y = 232 + 128 * Math.sin(t);
                tickAndRender(gc);
            }
        }.start();
        mainStage.show();
    }

    private static void prepareActionHandlers(Scene mainScene)
    {
        handler = new Handler();
        handler.addEntity(new Player(700,500,64,64,true,Id.player,handler));
        handler.addTile(new Wall(500, 500, 64, 64, true, Id.wall,null ));
        currentlyActiveKeys = new ArrayList<String>();
        mainScene.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event)
            {
                //currentlyActiveKeys.add(event.getCode().toString());
                for(Entity en: handler.entity){   
                    if(event.getCode() == KeyCode.SPACE){
                        if(en.isJumping() == false){
                            en.setJumping(true);
                        }
                    }
                    if(event.getCode() == KeyCode.S){
                        en.setVelY(0.0);
                    }
                    if(event.getCode() == KeyCode.A){
                        en.setVelX(-5.0);
                    }
                    if(event.getCode() == KeyCode.D){
                        en.setVelX(5.0);
                    }
                }
            }
        });
        mainScene.setOnKeyReleased(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event)
            {
                for(Entity en: handler.entity){   
                    if(event.getCode() == KeyCode.SPACE){
                        en.setJumping(false);
                    }
                    if(event.getCode() == KeyCode.S){
                        en.setVelY(0);
                    }
                    if(event.getCode() == KeyCode.A){
                        en.setVelX(0);
                    }
                    if(event.getCode() == KeyCode.D){
                        en.setVelX(0);
                    }
                }
            }
        });
    }

    private static void loadGraphics()
    {
            image1 = new Image("bricks_2.png");
            image2 = new Image("bricks_1.png");
            image3 = new Image("bricks_3.png");
            playerImage = new Image("1.png");
    }
  public static Image returnImage1(){
      return image1;
  } 
  public static Image returnImage2(){
      return image2;
  }  
  public static Image returnImage3(){
      return image3;
  }
  public static Image returnPlayerImage(){
      return playerImage;
  }
    private static void tickAndRender(GraphicsContext gc)
    {   // Update and render
        gc.clearRect(0, 0, WIDTH, HEIGHT);
//        tiledMap.mapData();
//        tiledMap.renderMapFromData(gc);
        handler.tick();
        handler.render(gc,playerImage);
    }   
}