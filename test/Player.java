/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Character.DefaultCharacter;
import javafx.scene.image.Image;


/**
 *
 * @author NangTrongVuon
 */
public class Player extends DefaultCharacter {

    public Player(double xLocation, double yLocation, Image... spriteCells) {
        super(xLocation, yLocation, spriteCells);
        hp = 100;
        vX = vY = 1;
    }

    @Override
    public void update() {
        if (ArcaneArena.right) { iX += vX; }
        if (ArcaneArena.up) { iY -= vY; }
        if (ArcaneArena.down) { iY += vY; }
        if (ArcaneArena.left) { iX -= vX; }
        spriteFrame.setTranslateX(iX);
        spriteFrame.setTranslateY(iY);
    }
    
    @Override
    public Boolean collide(Sprite object) {
        return false;
    }
    
}
