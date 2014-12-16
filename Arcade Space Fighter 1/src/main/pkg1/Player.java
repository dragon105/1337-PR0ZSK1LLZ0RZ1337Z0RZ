/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.pkg1;

/**
 *
 * @author Katydid
 */
public class Player extends Main{
    int HP; // health
    float xPos; // position on x axis
    float yPos; // position on y axis
    float[] hitbox = new float[2]; // size of hitbox relative to object
    float[] dimensions = new float[2]; // dimensions on canvas
    float heading; // heading of player from 0 to 360
    float speed; // speed per tick
    boolean dead; // object does nothing if dead
    // weapons system variables
    int maxWeaponsEnergy;
    int weaponsEnergy;
    float weaponsEnergyRegenRate;
    
    void create(){ // called on creation. Gives starting values based on type. Also used for config
        HP = 100;
        xPos = xRes / 2;
        yPos = yRes / 2;
        hitbox[0] = 20;
        hitbox[1] = 50;
        dimensions[0] = 20;
        dimensions[1] = 50;
        heading = 0;
        //speed = ;
        dead = false;
        //maxWeaponsEnergy = ;
        //weaponsEnergy = ;
        //weaponsEnergyRegenRate;
    }
    
    void render(){ // renders player on canvas
        
    }
    
    void update(){ // updates values
    
    }
}