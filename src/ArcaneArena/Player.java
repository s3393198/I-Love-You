/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

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
    
    }
    
    @Override
    public Boolean collide(Sprite object) {
        return false;
    }
    
}
