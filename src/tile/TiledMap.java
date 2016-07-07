/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

import ArcaneArena.Handler;
import ArcaneArena.Id;
import ArcaneArena.Main;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 *
 * @author apple
 */
public class TiledMap 
{
    public static int map[][];
    public ImageView image;
    public static Image character;
    static int xCoordinate = 0, yCoordinate = 0;
    static int squareSize = 40;
    public static String typeWall = "";
    public static void mapData()
    {
        map = new int [][]{
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,3,1,1,1,1,9,9,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,1,1,9,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,9,9,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,2,2,2,0},
                {0,2,2,2,2,2,2,2,2,2,2,6,6,6,6,6,2,2,2,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    }
    

//    public void renderMapFromData(GraphicsContext gc){
////        String typeWall = "";
//        //Wall wall;
//        int count = 0;
//        for (int i = 0; i< 400; i++) {
//            count++;
//            System.out.println("count: "+ count);
//            //Create a wall object
//            //wall = new Wall((i%20)*squareSize,(i/20)* squareSize, squareSize, squareSize, true, Id.Wall,typeWall);
//            int location =  map[i/20][i%20];
//            switch (location) {
//                    case 0:
//                        gc.setFill(Color.BLACK);
//                        //gc.fillRect((i%20) * squareSize, (i/20) * squareSize, squareSize, squareSize);
//                        break;
//                    case 1:
//                        //typeWall = "wall";
//                        //wall.render(gc,image);
//                        break;
//                    case 2:
//                        //typeWall = "Boundary";
//                        //wall.render(gc,image);
//                        break;
//                    case 3:
//                        gc.setFill(Color.RED);                              
//                        break;
//                    case 4:
//                        gc.setFill(Color.RED);
//                        break;
//                    case 5:
//                        //typeWall = "Boundary";
//                       // wall.render(gc,image);
//                        break;
//                    case 6:
//                        gc.setFill(Color.RED);
//                        break;
//                    case 9:
//                        //typeWall = "platform";
//                        //wall.render(gc,image);
//            }
//            if(location != 10){
//                gc.fillRect((i%20) *squareSize,(i / 20)*squareSize ,squareSize,squareSize);
//            }
//        }
//        
//    }
        public void renderMapFromData(GraphicsContext gc){
        Image image = null;
        int count = 1;
        Wall wall;
        for (int i = 0; i< 400; i++) {
            wall = new Wall((i%20)*squareSize,(i/20)* squareSize, squareSize ,squareSize, true, Id.wall,typeWall);

            int location =  map[i/20][i%20];
            switch (location) {
                case 0:
                    //gc.setFill(Color.BLUE);
                    break;
                case 1:
                    typeWall = "wall";
                    //gc.setFill(Color.WHITE);
                    image = Main.returnImage1();
                    break;
                case 2:
                    typeWall = "Boundary";
                    image = Main.returnImage2();
                    //gc.setFill(Color.GREEN);
                    break;
                case 3:
                    
                    gc.setFill(Color.RED);
                    break;
                case 4:
                    gc.setFill(Color.RED);
                    break;
                case 5:
                    typeWall = "Boundary";
                    image = Main.returnImage2();
                    //gc.setFill(Color.GREEN);
                    break;
                case 6:
                    gc.setFill(Color.RED);
                    break;
                case 9:
                    typeWall = "platform";
                    image = Main.returnImage3();
                    //gc.setFill(Color.BLACK);              
                    break;
                case 10:
                    //gc.drawImage(character, (i%20) * squareSize, (i / 20) * squareSize,squareSize, squareSize);
                    break;
            }
            if(location != 10){
                //gc.fillRect((i%20) *squareSize,(i / 20)*squareSize ,squareSize,squareSize);
                wall.render(gc,image);
            }
        }
        
    }


}
