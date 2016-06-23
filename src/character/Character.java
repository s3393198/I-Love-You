/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

/**
 *
 * @author apple
 */
public class Character 
{
    private double moveSpd;
    private double hp;
    private double mana;
    private boolean havingPower;

    public Character(double moveSpd, double hp, double mana) {
        this.moveSpd = moveSpd;
        this.hp = hp;
        this.mana = mana;
    }

    public Character(double moveSpd, double hp, double mana, boolean havingPower) {
        this.moveSpd = moveSpd;
        this.hp = hp;
        this.mana = mana;
        this.havingPower = havingPower;
    }
    
    

    public double getMoveSpd() {
        return moveSpd;
    }

    public void setMoveSpd(double moveSpd) {
        this.moveSpd = moveSpd;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public boolean isHavingPower() {
        return havingPower;
    }

    public void setHavingPower(boolean havingPower) {
        this.havingPower = havingPower;
    }
    
    
}
