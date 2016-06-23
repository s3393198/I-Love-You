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
public class DefaultCharacter extends Character
{
    
    public DefaultCharacter(double moveSpd, double hp, double mana) {
        super(moveSpd, hp, mana);
        moveSpd = 50;
        hp = 100;
        mana = 100;
    }
    
    
    
}
