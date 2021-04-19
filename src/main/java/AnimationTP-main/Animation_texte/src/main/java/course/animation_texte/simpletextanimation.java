/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.animation_texte;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.text.StyleConstants.Italic;

/**
 *
 * @author quent
*/

public class simpletextanimation extends JPanel{  
    
    int a=40;
    int b=0;
    int c=400;
    int d=300;
    
    int e=200;
    
    int f=50;
    int g=400;
    int h=350;
    
    int i=80;
    int j=160;
    int k=415;
    int l=400;
    
    int m=55;
    int n=110;
    int o=415;
    int p=450;
   
    public void paint(Graphics gp)
    {
        super.paint(gp);    
        
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("BOLD", BOLD, 35));
             
        g2d.drawString("J", a, 150);
        g2d.drawString("A", 220, b);
        g2d.drawString("V", c, 150);
        g2d.drawString("A", 280, d);
        
        g2d.drawString("E", 220, f);
        g2d.drawString("S", g, 200);
        g2d.drawString("T", 280,e);
        
        g2d.drawString("I", h, 250);
        g2d.drawString("M", 210, i);
        g2d.drawString("P", j, 250);
        g2d.drawString("O", 265, k);
        g2d.drawString("R", l, 250);
        g2d.drawString("T", 315, m);
        g2d.drawString("A", n, 250);
        g2d.drawString("N", 360, o);
        g2d.drawString("T", p, 250);
        
        try {
            
            Thread.sleep(100);
            
            if(a<190 && c>250 && e<310 && b<150 &&d>150 && f<200 && g>250 && h>200 && i<205 && j<250 && k>265 && l>250 )
            {
            a+=5;
            b+=5;           
            c-=5;
            d-=5;
            e+=5;
            f+=5;
            g-=5;
            h-=5;
            i+=5;
            j+=5;
            k-=5;
            l-=5;
            m+=5;
            n+=5;
            o-=5;
            p-=5;
            }
            else
            {
            a=190;
            b=150;
            c=250;
            d=150;
            e=200; 
            f=200;
            g=250;
            h=200;
            i=250;
            j=240;
            k=250;
            l=290;
            m=250;
            n=335;
            o=250;
            p=385;
            
            }
                 
        } catch (Exception e) {
        }
            
        repaint();      
    }
      
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new simpletextanimation());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }   
}