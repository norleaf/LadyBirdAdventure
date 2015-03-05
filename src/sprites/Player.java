/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.input.InputManager;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.AnalogListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.math.Vector2f;

/**
 *
 * @author Hans
 */
public class Player extends ActorSprite{
    InputManager inputManager;

    public Player(InputManager inputManager, AssetManager assetManager, String image, Vector2f position) {
        super(assetManager, image, position);
        this.inputManager = inputManager;
        inputManager.addMapping("Jump", new KeyTrigger(KeyInput.KEY_SPACE));
        inputManager.addMapping("Right", new KeyTrigger(KeyInput.KEY_RIGHT));
        inputManager.addMapping("Left", new KeyTrigger(KeyInput.KEY_LEFT));
        inputManager.addListener(actionListener, "Jump");
        inputManager.addListener(analogListener, "Right");
        inputManager.addListener(analogListener, "Left");
        inputManager.addListener(actionListener, "Right");
        inputManager.addListener(actionListener, "Left");
    }
    
    public AnalogListener analogListener = new AnalogListener() {
        public void onAnalog(String name, float value, float tpf) {
            if(name.equals("Right")){
                move(2);
            } else
            if(name.equals("Left")){
                move(-2);
            } 
        }
    };
    
    private ActionListener actionListener = new ActionListener(){
        public void onAction(String name, boolean pressed, float tpf){
            System.out.println(name + " = " + pressed);
            if(name.equals("Jump") && pressed){
                jump();
                System.out.println("tpf: " +tpf );
            } 
//            if(name.equals("Right") && !pressed){
//                System.out.println("stop?");
//                stop();
//            } 
//            if(name.equals("Left") && !pressed){
//                stop();
//            } 
            
        }
    };

    @Override
    public void update(float tpf) {
        super.update(tpf); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
    
}
