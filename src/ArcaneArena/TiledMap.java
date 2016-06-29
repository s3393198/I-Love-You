/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;

/**
 *
 * @author apple
 */
public class TiledMap 
{
    public int map[][];
    public ImageView image;
    
    public void mapData()
    {
        map = new int [][]
               {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,1,1,4,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,9,9,9,9,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,2,2,2,2,2,2,1,1,1,1,1,2,2,2,2,2,2,2,0},
                {0,2,2,2,2,2,2,2,2,2,2,6,6,6,6,6,2,2,2,2,2,2,6,6,6,6,6,2,2,2,2,2,2,2,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    }
    
    public void renderMap(Pane pane)
    { 
        int xPos = 0;
        int yPos = 4;
        int size = 20;
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                switch (map[i][j])
                {
                    case 0:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.BLUE);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.GREEN);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 1:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.WHITE);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.GREEN);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 2:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.GREEN);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.PURPLE);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 3:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.RED);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.GREEN);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 4:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.RED);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.GREEN);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 5:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.RED);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.GREEN);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 6:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.RED);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.GREEN);
                        pane.getChildren().add(rec);
                        break;
                    }
                    case 9:
                    {
                        Rectangle rec = new Rectangle(size, size, javafx.scene.paint.Color.BLACK);
                        rec.setY((yPos + i)*size);
                        rec.setX((xPos + j + 1)*size);
                        rec.setStrokeWidth(1);
                        rec.setStrokeDashOffset(1);
                        rec.setStrokeLineCap(StrokeLineCap.BUTT);
                        rec.setStroke(Color.WHITE);
                        pane.getChildren().add(rec);
                        break;
                    }
                            
                }
            }
        }
    }
}
