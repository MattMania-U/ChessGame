/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;
import java.awt.image.BufferedImage;
/**
 *
 * @author matth
 */
//The parent class to all the pieces
public class ChessPiece {
    BufferedImage sprite;
    int[] boardPosit;
    enum Side{
        Black, White;
    }
    Side pieceSide;
    
    public ChessPiece(){
        //add a mouse click action listener for when clicked adds the possible moves and lifts the current piece into the fake air
    }
    public void setSprite(BufferedImage kekw){
        sprite=kekw;
    }
    
    public void setpieceSide(int x){
        if(x>=0){
            pieceSide=Side.Black;
        }else{
            pieceSide=Side.White;
        }
    }
    
    
    
}
