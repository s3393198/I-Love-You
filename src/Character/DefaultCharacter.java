package Character;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple
 */
public class DefaultCharacter 
{
    private int hp;
    private int mana;
    private double moveSpd;

    public DefaultCharacter(int hp, int mana, double moveSpd) {
        this.hp = hp;
        this.mana = mana;
        this.moveSpd = moveSpd;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public double getMoveSpd() {
        return moveSpd;
    }

    public void setMoveSpd(double moveSpd) {
        this.moveSpd = moveSpd;
    }
    
    
}
