/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;
import javax.swing.JOptionPane;
/**
 *
 * @author cedwa
 */
public class Addition {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String firstNumber;
    String secondNumber;
    int num1,num2,sum;
    
    firstNumber  = JOptionPane.showInputDialog("Enter first Number:\n");
    secondNumber = JOptionPane.showInputDialog("Enter second Number:\n");
    
    num1 = Integer.parseInt( firstNumber);
    num2 = Integer.parseInt( secondNumber);
    
    sum=num1+num2;
    
    JOptionPane.showMessageDialog(null,"Result is "+sum,"Results",JOptionPane.PLAIN_MESSAGE);
    
    System.exit(0);
    
    }
    
}
