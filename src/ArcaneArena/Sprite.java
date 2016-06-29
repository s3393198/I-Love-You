/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author NangTrongVuon
 */
public abstract class Sprite {
    
    // pX, pY = pivot X, pivot Y
    // iX, iY = X Y positions coordinates
    
    
    protected List<Image> imageStates = new ArrayList<>();
    protected ImageView spriteFrame;
    protected Rectangle spriteBoundaries;
    protected double iX;
    protected double iY;
    protected double pX;
    protected double pY;
    protected Boolean isAlive;
    protected Boolean isFixed;
    protected Boolean isBonus;
    protected Boolean hasValue;
    protected Boolean isFlipV;
    protected Boolean isFlipH;
    
    public Sprite(double xLocation, double yLocation, Image... spriteCells) {
      
        
        spriteFrame = new ImageView(spriteCells[0]);
        imageStates.addAll(Arrays.asList(spriteCells));
        iX = xLocation;
        iY = yLocation;
        pX = 0;
        pY = 0;
        isAlive = isBonus = hasValue = isFlipV = isFlipH = false;
        
    }
    
    public abstract void update();

    public List<Image> getImageStates() {
        return imageStates;
    }

    public void setImageStates(List<Image> imageStates) {
        this.imageStates = imageStates;
    }

    public ImageView getSpriteFrame() {
        return spriteFrame;
    }

    public void setSpriteFrame(ImageView spriteFrame) {
        this.spriteFrame = spriteFrame;
    }

    public Rectangle getSpriteBoundaries() {
        return spriteBoundaries;
    }

    public void setSpriteBoundaries(Rectangle spriteBoundaries) {
        this.spriteBoundaries = spriteBoundaries;
    }

    public double getiX() {
        return iX;
    }

    public void setiX(double iX) {
        this.iX = iX;
    }

    public double getiY() {
        return iY;
    }

    public void setiY(double iY) {
        this.iY = iY;
    }

    public double getpX() {
        return pX;
    }

    public void setpX(double pX) {
        this.pX = pX;
    }

    public double getpY() {
        return pY;
    }

    public void setpY(double pY) {
        this.pY = pY;
    }

    public Boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Boolean getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Boolean isFixed) {
        this.isFixed = isFixed;
    }

    public Boolean getIsBonus() {
        return isBonus;
    }

    public void setIsBonus(Boolean isBonus) {
        this.isBonus = isBonus;
    }

    public Boolean getHasValue() {
        return hasValue;
    }

    public void setHasValue(Boolean hasValue) {
        this.hasValue = hasValue;
    }

    public Boolean getIsFlipV() {
        return isFlipV;
    }

    public void setIsFlipV(Boolean isFlipV) {
        this.isFlipV = isFlipV;
    }

    public Boolean getIsFlipH() {
        return isFlipH;
    }

    public void setIsFlipH(Boolean isFlipH) {
        this.isFlipH = isFlipH;
    }
    
    
}
