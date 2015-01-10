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

public class Main {
    public static int yRes = 600;
    public static int xRes = 1000;
    public static boolean running = true;
    
    public static void main(String[] args) {
        
        GUI gui = new GUI();
        gui.displayStartScreen();
        
        Player player = new Player();
        
        while (running){
            // check if start button is pressed. If so, start game
            if (gui.startButton.getModel().isPressed()){
                gui.displayGamePlay();
            }
        }
    }
}