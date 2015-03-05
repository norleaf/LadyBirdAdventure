/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.math.Vector2f;
import com.jme3.texture.Texture2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Hans
 */
public class SolidSprite extends Sprite{
    Rectangle2D boundingBox;

    public SolidSprite(AssetManager assetManager, String image, Vector2f position) {
        super(assetManager, image, position);
        boundingBox = new Rectangle( (int)position.x, (int)position.y, 34, 23);
    }
    
    
        
    
    
}
