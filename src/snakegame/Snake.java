/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 *
 * @author george
 */
public class Snake {
    
    ArrayList<Square> squares=new ArrayList<>();
   
    public void addSquare( Square s ){
       squares.add(s);
    }
     public Square removeSquare( int i ){
       return  squares.remove(i);
    }
    public ArrayList<Square> listAllSquares(){
     return squares;
    }

  
    
}
