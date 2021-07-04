/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author george
 */
public class Square   {
    private double x;
    private double y;
    private double h=10;
    private double w=30;
    private double speed=0;
    private boolean rightOrLeft;

    public void setH(double h) {
        this.h = h;
    }

    public void setW(double w) {
        this.w = w;
    }
    

    public boolean isRightOrLeft() {
        return rightOrLeft;
    }

    public void setRightOrLeft(boolean rightOrLeft) {
        this.rightOrLeft = rightOrLeft;
    }
    
   

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    private Graphics g;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }


    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }
    
    public void drawRightOrLeft(){
        w=30;
        h=10;  
    g.fillRect((int)x, (int)y,(int) w,(int) h);
    }
    public void drawDownOrUp(){
         w=10;
        h=30;
    g.fillRect((int) x, (int) y,(int)  w,(int)  h);
          
    }
    public void draw(){
    if(rightOrLeft){
      drawRightOrLeft();
    }
    else{
    drawDownOrUp();
    }
    }
  
    
}
