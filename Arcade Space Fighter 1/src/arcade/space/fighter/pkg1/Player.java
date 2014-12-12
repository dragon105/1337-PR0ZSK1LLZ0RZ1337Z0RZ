/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade.space.fighter.pkg1;

/**
 *
 * @author Katydid
 */
public class Player {
    int HP; // health
    float xPos; // position on x axis
    float yPos; // position on y axis
    float[] hitbox = new float[2]; // size of hitbox relative to object
    float heading; // heading of player from 0 to 360
    float speed; // speed per tick
    boolean dead; // object does nothing if dead
    // weapons system variables
    int maxWeaponsEnergy;
    int weaponsEnergy;
    float weaponsEnergyRegenRate;
    
    void create(){ // called on creation. Gives starting values based on type.
        HP = 100;
        
    }
    
    void render(){ // renders player on canvas
        
    }
    
    void update(){ // updates values
    
    }
}