/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.pkg1;

import java.lang.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Katydid
 */
public class Player extends Main{
    int HP; // health
    float xPos; // position on x axis
    float yPos; // position on y axis
    float[] hitbox = new float[2]; // size of hitbox relative to object
    double heading; // heading of player in radians
    float speed; // speed per tick
    boolean dead; // object does nothing if dead
    // weapons system variables
    int maxWeaponsEnergy;
    int weaponsEnergy;
    float weaponsEnergyRegenRate;
    
    public JLabel playerImg;
    public ImageIcon playerImgIcon;
    
    public Player(){
        HP = 100;
        xPos = xRes / 2;
        yPos = yRes / 2;
        //hitbox[0] = ;
        //hitbox[1] = ;
        heading = 0;
        speed = 5;
        dead = false;
        //maxWeaponsEnergy = ;
        //weaponsEnergy = ;
        //weaponsEnergyRegenRate;
        
        playerImg = new JLabel();
        playerImgIcon = new ImageIcon("player.png");
        playerImg.setIcon(playerImgIcon);
                
    }
       
    void move(){// updates xPos and yPos
        // gets new x coordinate based on heading and speed
        xPos = (float) (xPos + (Math.cos(heading) * speed));
        // gets new y coordinate based on heading and speed
        yPos = (float) (yPos + (Math.sin(heading) * speed));
    }
    
    void render(){// draw player on screen
        
    }
}