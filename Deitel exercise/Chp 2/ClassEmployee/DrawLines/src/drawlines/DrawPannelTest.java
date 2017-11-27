/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawlines;

import javax.swing.JFrame;

/**
 *
 * @author cedwa
 */
public class DrawPannelTest {
    
    public static void main( String[] args)
    {
        DrawLines panel = new DrawLines();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(500, 50);
        application.setVisible(true);
        
        
    }
    
}
