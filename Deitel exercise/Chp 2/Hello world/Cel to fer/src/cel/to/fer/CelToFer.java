/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cel.to.fer;
import javax.swing.JOptionPane;
/**
 *
 * @author cedwa
 */
public class CelToFer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double number1,number2;
        
        String s1,s2;
        
        s1 = JOptionPane.showInputDialog("Enter Celcius Value:\n");
        
        number1 = Double.parseDouble(s1);
        
        number2=((9*number1)/5)+32;
        
        JOptionPane.showMessageDialog(null,number2,"Converter", JOptionPane.CANCEL_OPTION );
        System.exit(0);
        
    }
    
}
