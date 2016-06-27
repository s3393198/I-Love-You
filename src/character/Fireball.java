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
public class Fireball extends Skill
{
    static double fireBallManaCost = 10;
    public Fireball(float manaCost, float projectileSpeed, float remainingMana) {
        super(manaCost, projectileSpeed, remainingMana);
        manaCost = (float) fireBallManaCost;
        projectileSpeed = 30;
        remainingMana = (float) (DefaultCharacter.originalMana - manaCost);
    }
}
