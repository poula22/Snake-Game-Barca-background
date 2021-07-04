/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import snakegame.Apple;
 import snakegame.Snake;
import snakegame.Square;

/**
 *
 * @author Poula
 */
public class SnakeGame extends javax.swing.JFrame {

    /**
     * Creates new form SnakeGame
     */
    public SnakeGame() {
        initComponents();
        g=this.getGraphics();
       this.setBackground(Color.DARK_GRAY);
       
    }
    Graphics g;
    Snake snake= new Snake();
    
     
      private BufferedImage dbImage;
    double x=400;
    double ax=0.8;
    double y=400;
    double ay=0;
    double ss=0;
    Apple a= new Apple();
    int ticks=0;
    Random xApple=new Random();
    Random yApple=new Random();
    boolean fApple=true;
    boolean flag=true;
    boolean a5ern=true;
    boolean right=true;
    boolean left=false;
    boolean up=false;
    boolean down=false;
   
             
         int i=1;
      @Override
    public void paint(Graphics g) {
        // method of  Double Buffering
        dbImage=(BufferedImage) createImage(getWidth(),getHeight());//creat Image with Frame Scale
        this.g=dbImage.getGraphics();// drawing second frame
        
        this.g=dbImage.getGraphics();
        this.g.setColor(Color.BLUE);
        paintComponents(this.g);//draw components on second frame 
        g.drawImage(dbImage, 0, 0,Color.RED, this);//replace frame with double buffering frame(second Frame)
        this.g.setColor(Color.RED);
         paintComponents(this.g);//draw components on second frame
        g.drawImage(dbImage, 0, 0,Color.RED, this);//replace frame with double buffering frame(second Frame)
       
            repaint();
        
    }
     
    @Override
    public void paintComponents(Graphics g){
        int score=(i-1)*10;
        jLabel3.setText(String.valueOf(score));
        super.paint(g);
        int k =snake.listAllSquares().size();
        
         Square s=new Square();
         s.setRightOrLeft(flag);
           
            if(flag){

               
                x=x+ax;
            s.setX(x);
           s.setY(y);
           s.setG(g);
          
               
           
               
           
           }
           else{
              ax=0; 
           s.setX(x);
            y=y+ay;
           s.setY(y);
           s.setG(g);     
           }
             snake.addSquare(s);
      for(Square ss : snake.listAllSquares()){
           if(x>=800 && snake.listAllSquares().indexOf(ss)==0 ){
          x=10;
          ss.setX(x);
          }
          if(x<=0 && snake.listAllSquares().indexOf(ss)==0){
          x=800;
          ss.setX(x);
          }
           if(y>=800 && snake.listAllSquares().indexOf(ss)==0 ){
          y=30;
          ss.setY(y);
          }
          if(y<=25 && snake.listAllSquares().indexOf(ss)==0){
          y=800;
          ss.setY(y);
          }
          
          ss.setG(g);
          ss.draw();
         
       
          
 
      }
      for(int w=0;w<snake.listAllSquares().size()-1;w+=1){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
       for(int w=0;w<snake.listAllSquares().size()-1;w+=2){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
       for(int w=0;w<snake.listAllSquares().size()-1;w+=3){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=4){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=5){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=6){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=7){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=8){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=9){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=10){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
        for(int w=0;w<snake.listAllSquares().size()-1;w+=11){
            if((int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+1==(int)snake.listAllSquares().get(w).getX() && (int)snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+1==(int)snake.listAllSquares().get(w).getY() ){
                JOptionPane.showMessageDialog(rootPane, "GameOver");
                int l=JOptionPane.showConfirmDialog(rootPane, "restart Game?");
                if(l==0){
                    ArrayList fi =snake.listAllSquares();
                 snake.listAllSquares().removeAll(fi);
                 repaint();
                 break;
                }
                else{
                this.dispose();
                }
                
            }
          }
   
     
       
     
        if(x>=(a.getX()-15) && x<=(a.getX()+15) && y>=(a.getY()-10) && y<=(a.getY()+10)){
            ss+=0.08;
           fApple=true;
           Square b =new Square();
           i++;
           for(int j=0;j<30;j++){
            if(flag){
                if(right)  x=x+ax-ss;
                else  x=x+ax+ss;
              b.setX(x);
              b.setY(y);
              b.setG(g);
              b.setRightOrLeft(flag);
           }
           else{
             ax=0;
              b.setX(x);
              if(up)  y=y+ay+ss;
              else    y=y+ay-ss;
            b.setY(y);
            b.setG(g);
             b.setRightOrLeft(flag);
           }
         
           snake.addSquare(b);
             
            
            
          }
           
        }
         
       
          if(fApple){
      
       a.setX(xApple.nextInt(600));
       a.setY(yApple.nextInt(600));
       for(int i=0;a.getY()<30 ;i++){
        a.setY(yApple.nextInt(600));
       }
       fApple=false;
       
       }
          this.g.setColor(Color.GREEN);
       a.draw(this.g);
    
      
        
       
        if(snake.listAllSquares().size()!=1) 
       snake.listAllSquares().remove(0);
      a5ern=true;
 
       
    }
   
    
  
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakegame/official-fc-barcelona-store.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(800, 800));
        jLabel2.setMinimumSize(new java.awt.Dimension(800, 800));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Score: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("K");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(373, 373, 373))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    
       
        if(flag){
        if(evt.getKeyCode()==KeyEvent.VK_W){
            if(right){
     x=snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+20;
        y=snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()-20;}
            else{
            x=snake.listAllSquares().get(snake.listAllSquares().size()-1).getX();
        y=snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()-20;
            }
        
    ay=-0.8-ss;
    ax=0;
    flag=false;
    up=true;
    down=false;

    }
         else if(evt.getKeyCode()==KeyEvent.VK_S){
    if(right){
     x=snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()+20;
        y=snake.listAllSquares().get(snake.listAllSquares().size()-1).getY();
    }
    ay=0.8+ss;
    ax=0;
    flag=false;
    down=true;
    up=false;

    }
      
       
    }
    else{
       if(evt.getKeyCode()==KeyEvent.VK_A){
     if(up){
     x=snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()-20;
        y=snake.listAllSquares().get(snake.listAllSquares().size()-1).getY();
    }
     else{
         x=snake.listAllSquares().get(snake.listAllSquares().size()-1).getX()-20;
        y=snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+20;
     }
    ax=-0.8-ss;
    ay=0;
    flag=true;
    left=true;
    right=false;

    }
        else if(evt.getKeyCode()==KeyEvent.VK_D){
   if(down){
        x=snake.listAllSquares().get(snake.listAllSquares().size()-1).getX();
        y=snake.listAllSquares().get(snake.listAllSquares().size()-1).getY()+20;
   }
    ax=0.8+ss;
    ay=0;
    flag=true;
    right=true;
    left=false;

    }
      
      
    }
   
          
   
   
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SnakeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnakeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnakeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnakeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnakeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 
}
