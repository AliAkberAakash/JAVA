/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author cedwa
 */
public class SHapes extends JPanel {
    
    private int choice;
    
    public SHapes (int choice)
    {
        this.choice=choice;
    }
    
    public void paintComponnet(Graphics g)
    {
        super.paintComponent(g);
        
        for(int i=0; i<10; i++)
        {
            switch (choice)
            {
                case 1:
                    g.drawRect(10+i*10,10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2:
                    g.drawOval(10+i*10,10+i*10, 50+i*10, 50+i*10);
                    break;
            }
        }
    }
    
    
}
