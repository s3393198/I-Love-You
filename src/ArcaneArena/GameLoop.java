/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import javafx.animation.AnimationTimer;

/**
 *
 * @author NangTrongVuon
 */
public class GameLoop extends AnimationTimer {

    @Override
    public void handle(long now) {
        ArcaneArena.player.update();
        System.out.println("X is: " + ArcaneArena.player.getiX());
        System.out.println("Y is: " + ArcaneArena.player.getiY());
        System.out.println("game loop running");
    }
    
    @Override
    public void start() {
        super.start();
        
    }
    
    @Override
    public void stop() {
        super.stop();
    }
}
