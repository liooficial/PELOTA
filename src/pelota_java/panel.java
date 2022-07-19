/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelota_java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author liooficial
 */
public class panel extends JPanel{
    private Pelota bolita;
    public  panel(){
        bolita=new Pelota(Color.BLUE,525,325);
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        bolita.pintar(g);
        bolita.mover();
        bolita.rebotar(getWidth(),getHeight());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1200,800); 
    }
    
}
