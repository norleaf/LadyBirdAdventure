/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.Vector2f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture2D;

/**
 *
 * @author Hans
 */
public class Sprite extends Node{
    Vector2f position;
    Geometry geometry;
    Material material;
    Quad quad;

    public Vector2f getPosition() {
        return position;
    }

    public void setPosition(Vector2f position) {
        this.position = position;
    }
    
    public Sprite(AssetManager assetManager, String image, Vector2f position) {
        
        this.position = position;
    }
    /*
     * Quad quad = new Quad(1300, 800);
        Geometry quadGeo = new Geometry("quad", quad);
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setTexture("ColorMap", assetManager.loadTexture("Textures/Pic.png"));
        quadGeo.setMaterial(mat2);
        guiNode.attachChild(quadGeo);
     */
    
    
}
