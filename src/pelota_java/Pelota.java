/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelota_java;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author liooficial
 */
public class Pelota {
    private Color color;
    private int x;
    private int y;
    private int dir;
    
    private final int vel =8;
    private final int tam =150;
    
    void pintar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, tam, tam);
    }
     
    public Pelota(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
        dir=1;
    }
    
    public void mover(){
        if(dir==0){ 
            y+=vel;
        }else if(dir==1){
            y-=vel;
        }else if(dir==2){
            x+=vel;
        }else if(dir==3){
            x-=vel;
        }else if(dir==4){
            x+=vel;
            y+=vel;
        }else if(dir==5){
            x-=vel;
            y-=vel;
        }else if(dir==6){
            x-=vel;
            y+=vel;
        }else if(dir==7){
            x+=vel;
            y-=vel;
        }
    }
    
    public void rebotar(int limx, int limy){
         if(y<=0){
             int nr=(int)(Math.random()*3)+1;
             dir=nr==1 ? 6 : nr == 2? 0:4; 
         }else if(x<=0){
             int nr=(int)(Math.random()*3)+1;
            dir=nr==1 ? 7 : nr == 2? 0:4; 
         }else if(y>=limy-tam){
             int nr=(int)(Math.random()*3)+1;
            dir=nr==1 ? 5 : nr == 2? 1:7; 
         }else if(x>=limx-tam){
             int nr=(int)(Math.random()*3)+1;
            dir=nr==1 ? 6 : nr == 2? 3:5; 
         }
    }
             
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
