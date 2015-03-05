package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Quad;
import sprites.Player;
import sprites.Sprite;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    Player player;
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(false);
        
        
        player = new Player(inputManager,assetManager,"lb",new Vector2f(100,0));
        guiNode.attachChild(player);
        player.setLocalTranslation(player.getPosition().x, player.getPosition().y, 0);
//        Sprite sprite = new Sprite(assetManager,"lb",new Vector2f(10,10));
//        guiNode.attachChild(sprite);
    }

    @Override
    public void simpleUpdate(float tpf) {
        player.update(tpf);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        player.draw();
    }
}
