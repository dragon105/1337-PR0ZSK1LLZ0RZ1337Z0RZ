/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.pkg1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Katydid
 */

public class GUI extends Main{
    public JFrame startScreen;
    public JPanel panel;
    public JButton start;
    public JButton viewHighScores;
    
    public GUI(){

    }
    
    public void displayStartScreen(){
        startScreen = new JFrame("Arcade Space Fighter 1");
        startScreen.setVisible(true);
        startScreen.setSize(xRes, yRes);
        startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        start = new JButton("Start Game");
        viewHighScores = new JButton ("View High Scores");
        
        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(start);
        panel.add(viewHighScores);
        
        startScreen.add(panel);
    }
}