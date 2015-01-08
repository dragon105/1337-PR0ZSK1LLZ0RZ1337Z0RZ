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
public class Projectiles extends Main{
    float xPos; // position on x axis
    float yPos; // position on y axis
    int[] hitboxDimensions = new int[2]; // size of hitbox relative to object
    float heading; // heading from in radians
    float speed; // speed per tick
    boolean dead; // object does nothing if dead
    String projectileType; // type of projectile
    
    public Projectiles(String pType, float headingIn){
        projectileType = pType;
        heading = headingIn;
        dead = false;
        
        // sets hitbox dimension and speed based on pType
        
        // an array for storing all pixels currently in the hitbox
        int[][] hitboxPixels = new int[hitboxDimensions[0]][hitboxDimensions[1]];
    }
    
    void checkHitBox(){ // checks for nearby objects, then checks to see if hitboxes interact. if so, runs interact
        // get values for hitboxPixels[][]
        
        
        // check for nearby objects ((xPos,yPos) within 75 pixels)
    }
    
    void interact(/*target*/){
        
    }
    
    void update(){ // called each tick of program
        render();
        checkHitBox();
    }
    
    void render(){
        
    }
           
}
