/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.math.Vector2f;

/**
 *
 * @author Hans
 */
public class ActorSprite extends AnimatedSprite{
    Vector2f moveVector;
    static Vector2f gravity = new Vector2f(0,0.2f);
    boolean grounded;
    float speed;
    
    public ActorSprite(AssetManager assetManager, String image, Vector2f position) {
        super(assetManager, image, position);
        moveVector = new Vector2f(0,0);
    }
    
}
