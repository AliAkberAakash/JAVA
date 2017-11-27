/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawlines;

import javax.swing.JPanel;
import java.awt.Graphics;



/**
 *
 * @author cedwa
 */
public class DrawLines extends JPanel{

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        int width  = getWidth();
        int height = getHeight();
        
        while(width>0 && height<500)
        {
            g.drawLine(0, 0, width, height);
            width-=50;
            height+=50;
        }
        
        while(width<=500 && height>=0)
        {
            g.drawLine(250, 0, width, height);
            width+=50;
            height-=50;
        }
        
    }
    
}
