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
public class Skill 
{
    private float manaCost;
    private float projectileSpeed;
    private float remainingMana;

    public Skill(float manaCost, float projectileSpeed, float remainingMana) {
        this.manaCost = manaCost;
        this.projectileSpeed = projectileSpeed;
        this.remainingMana = remainingMana;
    }

    public float getManaCost() {
        return manaCost;
    }

    public void setManaCost(float manaCost) {
        this.manaCost = manaCost;
    }

    public float getProjectileSpeed() {
        return projectileSpeed;
    }

    public void setProjectileSpeed(float projectileSpeed) {
        this.projectileSpeed = projectileSpeed;
    }

    public float getRemainingMana() {
        return remainingMana;
    }

    public void setRemainingMana(float remainingMana) {
        this.remainingMana = remainingMana;
    }
    
    
}
