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
    public JPanel startScreenPanel;
    public JPanel gamePlayPanel;
    public JPanel highScoresPanel;
    public JPanel endGamePanel;
    public JPanel pausedPanel;
    public JButton startButton;
    public JButton back;
    public JButton viewHighScores;
    
    public GUI(){
        window = new JFrame("Arcade Space Fighter 1");
        window.setVisible(true);
        window.setSize(xRes, yRes);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void displayStartScreen(){
        startButton = new JButton("Start Game");
        viewHighScores = new JButton ("View High Scores");
        
        startScreenPanel = new JPanel();
        startScreenPanel.setBackground(Color.BLACK);
        startScreenPanel.add(startButton);
        startScreenPanel.add(viewHighScores);
        
        window.add(startScreenPanel);
        
    }
    
    public void displayHighScores(){
        
    }
    
    public void displayGamePlay(){
        gamePlayPanel = new JPanel();
        gamePlayPanel.setBackground(Color.BLACK);
        
        //window.removeAll();
        window.add(gamePlayPanel);
    }
    
    public void displayGameOverScreen(){
        
    }
}