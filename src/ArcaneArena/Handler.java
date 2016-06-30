/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import Entity.Entity;
import java.util.LinkedList;
import javafx.scene.canvas.GraphicsContext;
import tile.Tile;

/**
 *
 * @author owne
 */
public class Handler {
    public LinkedList<Entity> entity = new LinkedList<Entity>();
    public LinkedList<Tile> tile = new LinkedList<Tile>();
    
    public Handler(){
        
    }
    public void render(GraphicsContext g){
        for(Entity en: entity){
            en.render(g);
        }
        for(Tile ti: tile){
            ti.render(g);
        }
    }
    public void tick(){
        for(Entity en: entity){
            en.tick();
        }
        for(Tile ti: tile){
            ti.tick();
        }
    }
    public void addEntity(Entity en){
        entity.add(en);
    }
    public void removeEntity(Entity en){
        entity.remove();
    }
    public void addTile(Tile ti){
        tile.add(ti);
    }

    public void removeTile(Tile ti) {
        tile.remove(ti);
    }
}
