/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import ArcaneArena.Handler;
import ArcaneArena.Id;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import tile.Tile;
import javafx.scene.shape.Rectangle;
//import jdk.internal.org.objectweb.asm.Handle;

/**
 *
 * @author owne
 */
public class Player extends Entity {
    public Player(int x, int y, int width, int height, boolean solid, Id id,Handler handler) {
        super(x, y, width, height, solid, id,handler);
    }

    @Override
    public void render(GraphicsContext g, Image player) {
        g.setFill(Color.BLUE);
        g.drawImage(player, x, y, width, height);
    }

    @Override
    public void tick() {
        x+= velX;
        y += velY;
        if(x<=0){
            x = 0;
        }
        if( y <= 0 ){
            y = 0;
        }
        if(x + width>= 800){
            x = 800 - width;
        }
        if(y +height>= 800){
            y = 800 - height;
        }
        for(Tile t: handler.getTileList()){
            if(t.solid == false) break;
            else{
                if(t.getId() == Id.wall){
                    if(this.intersectsTopObject(t)){
                        y = t.getY() - height;
                    }    
                    if(this.intersectsBottomobject(t)){                       
                        setVelY(0);
                        y = t.getY() + height;
                    }
                    if(this.intersectsRightObject(t)){
                        setVelX(0);
                        x = t.getX()+t.width;
                    }
                    if(this.intersectsLeftObject(t)){
                        setVelX(0);
                        x = t.getX()-t.width;
                        
                    }
                }
            }
            if(this.isJumping() == false){
                //this.setVelY(-this.getGravity());
//                if(gravity <= 0.0){
//                    this.setJumping(false);
//                    this.setFalling(true);
//                }
                  this.setVelY(10.0);
            }
            if(this.isJumping() == true){
                //this.setVelY(this.getGravity());
                this.setVelY(-10.0);
                
            }
        }
    }
}
