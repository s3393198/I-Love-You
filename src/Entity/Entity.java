/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import ArcaneArena.Handler;
import ArcaneArena.Id;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author owne
 */
public abstract class Entity {
    public int x, y;
    public int width, height;
    
    public boolean solid;
    public int velX,velY;
    public Id id;
    public Handler handler;

    public Entity(int x, int y, int width, int height, boolean solid,Id id,Handler handler) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.solid = solid;
        this.id = id;
        this.handler = handler;
    }

    public abstract void render(GraphicsContext g);
        
    public abstract void tick();


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }
    public Id getId(){
        return id;
    }
    public void die(){
        handler.removeEntity(this);
    }


  
    
}
