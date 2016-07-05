/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

import ArcaneArena.Id;
import ArcaneArena.Main;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 *
 * @author owne
 */
public class Wall extends Tile {
    private String type;
//    Image wall = new Image("bricks_1.png");
//    Image platform = new Image("bricks_1.png");
//    Image boundary = new Image("bricks_1.png");

    public Wall(int x, int y, int width, int height, boolean solid, Id id,String type) {
        super(x, y, width, height, solid, id);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void render(GraphicsContext g,Image image) {
        g.setFill(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void tick() {
        
    }
    
}
