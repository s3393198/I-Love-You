/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;


import ArcaneArena.Handler;
import ArcaneArena.Id;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author owne
 */
public abstract class Tile {
    public int x, y;
    public int width = 40, height = 40;
    
    public boolean solid;
    public int velX,velY;
    public Id id;
    public Handler handler;
    public Tile(int x, int y, int width, int height, boolean solid,Id id) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.solid = solid;
        this.id = id;
    }
   public abstract void render(GraphicsContext g,Image image);
        
    public abstract void tick();
    public void die(){
        handler.removeTile(this);
    }
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
    
}
