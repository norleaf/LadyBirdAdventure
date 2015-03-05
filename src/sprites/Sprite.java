/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.material.RenderState.BlendMode;
import com.jme3.math.Vector2f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture;

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
        Texture loadTexture = assetManager.loadTexture("Textures/"+image+".png");
        material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setTexture("ColorMap", loadTexture);
        material.getAdditionalRenderState().setBlendMode(BlendMode.Alpha);
        int width = loadTexture.getImage().getWidth();
        int height = loadTexture.getImage().getHeight();
        quad = new Quad(width,height);
        geometry = new Geometry("Sprite", quad);
        geometry.setMaterial(material);
        this.attachChild(geometry);
    }
    public void update(float tpf){
        
    }
    
    public void draw(){
        
    }
}
