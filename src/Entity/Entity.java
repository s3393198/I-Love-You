/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import ArcaneArena.Handler;
import ArcaneArena.Id;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import tile.Tile;

/**
 *
 * @author owne
 */
public abstract class Entity {
    public double x, y;
    public int width = 40 , height = 40;
    
    public boolean solid;
    public final double gravity= 10;
    public double velX,velY;
    public Id id;
    public Handler handler;
    public boolean jumping = false;
    //public boolean falling = true;
    
    public Entity(int x, int y, int width, int height, boolean solid,Id id,Handler handler) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.solid = solid;
        this.id = id;
        this.handler = handler;
        velY += gravity;
    }

    public abstract void render(GraphicsContext g,Image image);
        
    public abstract void tick();


    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
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

    public double getVelX() {
        return velX;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public double getVelY() {
        return velY;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }
    public Id getId(){
        return id;
    }
    public void die(){
        handler.removeEntity(this);
    }

    public boolean isJumping() {
        return jumping;
    }

    public void setJumping(boolean jumping) {
        this.jumping = jumping;
    }

//    public boolean isFalling() {
//        return falling;
//    }

//    public void setFalling(boolean falling) {
//        this.falling = falling;
//    }

    public double getGravity() {
        return gravity;
    }

//    public void setGravity(double gravity) {
//        this.gravity = gravity;
//    }
//    public Rectangle getBounds(){
//        return new Rectangle(getX(), getY(), width, height);
//    }
//    public Rectangle getBoundstop(){
//        return new Rectangle(getX() + 10,getY(),width-20,5);
//    }
//    public Rectangle getBoundBottom(){
//        return new Rectangle(getX() + 10,getY()+ height - 5,width-20,5);
//    }
//    public Rectangle getBoundsLeft(){
//        return new Rectangle(getX(), getY()+ 10,5,height-20);
//    }
//    public Rectangle getBoundsRight(){
//        return new Rectangle(getX() + width - 5, getY() + 10,5, height - 20);
//    }
    public Rectangle2D getBoundary(){
        return new Rectangle2D(getX(), getY(), width, height);
    }
//    public Rectangle2D getTopBoundary(){
//        return new Rectangle2D(getX()+ 10,getY() , width-20, 5);
//    }
//    public Rectangle2D getBottomBoundary(){
//        return new Rectangle2D(getX()+ 10,getY() + height , width-20, 5);
//    }
//    public Rectangle2D getLeftBoundary(){
//        return new Rectangle2D(getX(),getY()+ 10 , 5, height);
//    }
//    public Rectangle2D getRightBoundary(){
//        return new Rectangle2D(getX()+ 10,getY() , width-20, 5);
//    }
    //is intersected ?
    public boolean intersectsEntity(Entity en){
        return en.getBoundary().intersects(this.getBoundary());
    }
    public boolean intersectsObject(Tile ti){
        return ti.getBoundary().intersects(this.getBoundary());
    }
    public boolean intersectsTopObject(Tile ti){
        return ti.getTopBoundary().intersects(this.getBoundary());
    }
    public boolean intersectsLeftObject(Tile ti){
        return ti.getLeftBoundary().intersects(this.getBoundary());
    }
    public boolean intersectsRightObject(Tile ti){
        return ti.getRightBoundary().intersects(this.getBoundary());
    }
    public boolean intersectsBottomobject(Tile ti){
        return ti.getBottomBoundary().intersects(this.getBoundary());
    }
}
