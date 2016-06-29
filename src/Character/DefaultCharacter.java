package Character;

import ArcaneArena.Sprite;
import javafx.scene.image.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple
 */
public abstract class DefaultCharacter extends Sprite
{
   
    // vX, vY = velocity X & Y
    protected double vX, vY, hp, damage, offsetX, offsetY;
    protected float boundScale, boundRot, friction, gravity, bounce;
    
    public DefaultCharacter(double xLocation, double yLocation, Image... spriteCells) {
        super(xLocation, yLocation, spriteCells);
        boundScale = boundRot = friction = gravity = bounce = 0;
        vX = vY = offsetX = offsetY = 0;
        hp = 100;
        damage = 10;
    }
    
    public Boolean collide(Sprite object) {
        return false;
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public float getBoundScale() {
        return boundScale;
    }

    public void setBoundScale(float boundScale) {
        this.boundScale = boundScale;
    }

    public float getBoundRot() {
        return boundRot;
    }

    public void setBoundRot(float boundRot) {
        this.boundRot = boundRot;
    }

    public float getFriction() {
        return friction;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public float getBounce() {
        return bounce;
    }

    public void setBounce(float bounce) {
        this.bounce = bounce;
    }
   
    
    
    
}
