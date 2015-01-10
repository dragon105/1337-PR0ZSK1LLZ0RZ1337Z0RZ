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
    public String gameState = "homeScreen"; // should always be one of "homeScreen", "paused", "playing", "over", "highScoreScreen"
    
    public JFrame window;
    public JPanel gamePanel;
    public JButton startButton;
    public JButton back;
    public JButton viewHighScores;
    
    public GUI(){
        window = new JFrame("Arcade Space Fighter 1");
        window.setVisible(true);
        window.setSize(xRes, yRes);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel = new JPanel();
        window.add(gamePanel);
    }
    
    public void displayStartScreen(){
        startButton = new JButton("Start Game");
        viewHighScores = new JButton ("View High Scores");
        
        gamePanel.removeAll();
        gamePanel.setBackground(Color.BLACK);
        gamePanel.add(startButton);
        gamePanel.add(viewHighScores); 
    }
    
    public void displayHighScores(){
        
    }
    
    public void displayGamePlay(){
        gamePanel.removeAll();
        gamePanel.setBackground(Color.BLACK);
    }
    
    public void displayGameOverScreen(){
        
    }
}