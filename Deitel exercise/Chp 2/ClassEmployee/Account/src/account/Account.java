/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author cedwa
 */
public class Account {

	private String name;
	private double balance;
	
	public Account(String name, double deposit)
	{
		this.name=name;
		if(deposit>0.0)
		balance+=deposit;
	}

	public void deposit(double deposit)
	{
		if(deposit>0.0)
		balance+=deposit;
	}
	
	public void printDetails()
	{
		System.out.printf("%s balance: %.2f$\n",name, balance);
		
	}
	
    
}
