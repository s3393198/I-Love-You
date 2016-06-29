/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcaneArena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author NangTrongVuon
 */
public class GameManager {
    
    private final List<Sprite> currentSprites;
    private final List<Sprite> collideList;
    private final Set<Sprite> removedSprites;

    public GameManager() {
        this.currentSprites = new ArrayList<>();
        this.collideList = new ArrayList<>();
        this.removedSprites = new HashSet<>();
    }

   

    
    
    public List<Sprite> getCurrentSprites() {
        return currentSprites;
    }
    
    public void addCurrentSprites(Sprite... sprites) {
        currentSprites.addAll( Arrays.asList(sprites) );
    }
    
    public void removeCurrentSprites(Sprite... sprites) {
        currentSprites.removeAll( Arrays.asList(sprites));
    }
    
    public void clearCurrentSprites() {
        currentSprites.clear();
    }
    
    public List getCollideList() {
        return collideList;
    }
    
    public void resetCollideList() {
        collideList.clear();
        collideList.addAll(currentSprites);
    }

    public Set getRemovedSprites() {
        return removedSprites;
    }
    
    public void addToRemovedSprites(Sprite... sprites) {
        if (sprites.length > 1) { removedSprites.addAll( Arrays.asList((Sprite[]) sprites)); }
        else { removedSprites.add(sprites[0]); }
    }
    
    public void resetRemovedSprites() {
        currentSprites.removeAll(removedSprites);
        removedSprites.clear();
    }
    
}
