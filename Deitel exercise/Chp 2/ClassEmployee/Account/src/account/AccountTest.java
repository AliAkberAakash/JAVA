/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
//import javax.swing.JOptionPane;
/**
 *
 * @author cedwa
 */
public class AccountTest 
{
    
    public static void main( String[] args)
	{
		Account acc1 = new Account("Jane Green", 50.00);
		Account acc2 = new Account("John    Blue",  -7.53);
	
		acc1.printDetails();
		acc2.printDetails();
		
		System.out.println("Enter deposit amount for acc2\n");
		
                Scanner input = new Scanner(System.in);
                
                double x=input.nextDouble();
                
                acc2.deposit(x);
                
		acc1.printDetails();
		acc2.printDetails();
		
	}
    
    
}
