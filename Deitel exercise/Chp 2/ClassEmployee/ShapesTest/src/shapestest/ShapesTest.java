/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestest;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cedwa
 */
public class ShapesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input = JOptionPane.showInputDialog("Enter 1 to deraw rectangles\n"+"Enter 2 to draw ovals\n");
        
        int choice= Integer.parseInt(input);
        
        SHapes panel = new SHapes(choice);
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
        
        
        
    }
    
}
