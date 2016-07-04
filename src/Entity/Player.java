/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import ArcaneArena.Id;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 *
 * @author owne
 */
public class Player extends Entity {
    
    public Player(int x, int y, int width, int height, boolean solid, Id id) {
        super(x, y, width, height, solid, id);
    }

    @Override
    public void render(GraphicsContext g) {
        Image character = new Image("1.png");
        g.setFill(Color.BLUE);
        g.drawImage(character, x, y, width, height);
    }

    @Override
    public void tick() {
        x+= velX;
        y += velY;
        if(x<=0){
            x = 0;
        }
        if(y<= 0 ){
            y = 0;
        }
        if(x + width>= 800){
            x = 800 - width;
        }
        if(y +height>= 800){
            y = 800 - height;
        }
        
    }
}
