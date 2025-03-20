/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Window;
import Pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

/**
 *
 * @author matth
 */
public class Gameplay extends JFrame{
    JPanel chessboardPanel;
    BufferedImage image;
    public Gameplay(){
        chessboardPanel = new JPanel();
        chessboardPanel.setBounds(0,0,800,800);
        chessboardPanel.setVisible(true);
        this.add(chessboardPanel);
        MouseHandler mh = new MouseHandler();
        chessboardPanel.addMouseListener(mh);
        
        
        try {
            image = ImageIO.read(new File("MattPersonalProject/Sprites/ChessBoard")); // Replace with your image file path
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setBoardStart(){
        //initialize all the pieces and gameboard in the correct spot
        //chessboardPanel.im
    }
    //@Override 
    public void paintComponent(Graphics g){
        
    }
}
