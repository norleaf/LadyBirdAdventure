/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.jme3.asset.AssetManager;
import com.jme3.math.Vector2f;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Hans
 */
public class ActorSprite extends AnimatedSprite {

    Vector2f moveVector;
    static final Vector2f gravity = new Vector2f(0, -0.2f);
    float speed;
    Rectangle2D boundingBox;
    public enum State{
        GROUNDED, JUMPING, FALLING
        
    }
    private State state;
    
    public ActorSprite(AssetManager assetManager, String image, Vector2f position) {
        super(assetManager, image, position);
        moveVector = new Vector2f(0, 0);
    }

    public void jump() {
        if (state == State.GROUNDED) {
            moveVector = moveVector.add(new Vector2f(0, 3));
            position = position.add(moveVector);
            System.out.println("Position after jump: "+ position.x +","+position.y);
            System.out.println("jump velocity: " + moveVector.x +","+ moveVector.y);
            state = State.JUMPING;
        }
    }
    
    public void move(float speed){
        if(state == State.GROUNDED){
            moveVector.x = speed;
        }
    }
    
    public void stop(){
        moveVector.x = 0;
    }

    @Override
    public void update(float tpf) {
        super.update(tpf); //To change body of generated methods, choose Tools | Templates.
        if (state == State.FALLING) {
            moveVector = moveVector.add(gravity);
        }
        position = position.add(moveVector);
        if (position.y <= 0) {
            moveVector.y = 0;
            position.y = 0;
            state = State.GROUNDED;
        } else {
            state = State.FALLING;
        }
        if(state == State.GROUNDED){
            moveVector.x = moveVector.x/2;
            System.out.println("slowing down...");
        }
//        System.out.println("position: "+position.x +","+position.y);
        System.out.println("state: "+state);
    }

    @Override
    public void draw() {
        super.draw(); //To change body of generated methods, choose Tools | Templates.
        setLocalTranslation(position.x, position.y, 0);
        
    }
    
}
