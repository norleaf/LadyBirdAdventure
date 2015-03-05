/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.input.InputManager;
import com.jme3.scene.Node;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hans
 */
public class Level extends Node{
    List<Sprite> actors = new ArrayList<Sprite>();
    List<Sprite> statics = new ArrayList<Sprite>();
    List<Sprite> backgrounds = new ArrayList<Sprite>();
    AssetManager assetManager;
    InputManager inputManager;

    public Level(AssetManager assetManager, InputManager inputManager, String name) {
        super(name);
        this.assetManager = assetManager;
        this.inputManager = inputManager;
    }

    public void addActorSprite(ActorSprite sprite){
        actors.add(sprite);
    }
    
    public void update(float tpf){
        for (Sprite sprite : actors) {
            sprite.update(tpf);
        }
    }
        
}
