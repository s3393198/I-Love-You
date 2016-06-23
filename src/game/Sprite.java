/*
 * Class to render sprites.
 */
package game;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author NangTrongVuon
 */
public class Sprite {
    private Image image;
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;
    private double width;
    private double height;
    
    // Update the sprite's position according to time
    public void updatePosition(double time) {
        positionX += velocityX + time;
        positionY += velocityY + time;
    }
    
    // Renders the sprite 
    public void render(GraphicsContext gc) {
        gc.drawImage(image, positionX, positionY);
    }
    
    // Creates a collision box
    public Rectangle2D getBoundary() {
        return new Rectangle2D(positionX, positionY, width, height);
    }
    
    // Checks for collision between sprites
    public boolean intersects(Sprite s) {
        return s.getBoundary().intersects(this.getBoundary());
    }
    
}
