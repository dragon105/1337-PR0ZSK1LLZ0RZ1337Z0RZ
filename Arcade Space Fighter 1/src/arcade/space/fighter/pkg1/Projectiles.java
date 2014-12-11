/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade.space.fighter.pkg1;

/**
 *
 * @author Cicada
 */
public class Projectiles {
    float xPos; // position on x axis
    float yPos; // position on y axis
    float[] hitbox = new float[2]; // size of hitbox relative to object
    float heading; // heading from 0 to 360
    float speed; // speed per tick
    boolean dead; // object does nothing if dead
    String projectileType; // type of projectile
}
