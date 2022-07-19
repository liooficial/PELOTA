/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelota_java;
import javax.swing.JFrame;

/**
 *
 * @author liooficial
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        JFrame frm = new JFrame("");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(new panel());
        frm.pack();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        while(true){
            frm.repaint();
            Thread.sleep(20);
        }
            
    }
    
}
