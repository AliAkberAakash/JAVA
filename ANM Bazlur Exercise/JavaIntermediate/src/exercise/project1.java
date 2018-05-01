package exercise;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.IOException;

public class project1 {
	
	private Account account = new Account();
	
	public void createAccount(String name, Long accountNumber, String address, double balance)
	{	
		account.setName(name);
		account.setAccountNumber(accountNumber);
		account.setAddress(address);
		account.setBalance(balance);
	}
	
	public void printToFile()
	{
		Writer dos;
		try
		{
			dos = new FileWriter("D:\\JAVA\\JAVA\\ANM Bazlur Exercise\\JavaIntermediate\\Accounts"+File.separator+account.getAccountNumber()+".txt");
			
			dos.write(account.getName()+"\n"+account.getAccountNumber()+"\n"+account.getBalance()+"\n"+account.getAddress());
			dos.flush();
			dos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void valid(String accountNumber) throws IllegalArgumentException
	{
		File home = new File("D:\\JAVA\\JAVA\\ANM Bazlur Exercise\\JavaIntermediate\\Accounts");
		File []  listRoots = home.listFiles();
		int x=0;
		for(File file: listRoots)
		{
			if(file.getName().equals(accountNumber))
			{
				x=1;
				break;
			}
		}
		
		if(x==0)
			throw new IllegalArgumentException();
	}
	
	public static boolean validName(String name)
	{
		boolean ret=true;
		for(int i=0; i<name.length(); i++)
		{
			if(!(name.charAt(i)>='A' && name.charAt(i)<='Z') || !(name.charAt(i)>='a' && name.charAt(i)<='z'))
			{
				ret=false;
			}
		}
		return ret;
	}
	
	public static void main(String[] args)
	{
		boolean end=true;
		Scanner scn = new Scanner(System.in);
		
		while(end)
		{System.out.println("\nSelect from the menu:");
		System.out.println("Type 1 to add account.");
		System.out.println("Type 2 to view accounts.");
		System.out.println("Type 3 to exit.");
		
		boolean x=true;
		int n=3;
		
		while(x)
		{
			try	
			{
				n= scn.nextInt();
				scn.nextLine();
				if(n<1 || n>3)
					throw new  IllegalArgumentException();
				x=false;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Plz enter a valid choice.");
			}
			catch(Exception e)
			{
				System.out.println("Plz enter a valid choice.");
			}
		}
		
		switch(n)
		{
		case 1:
			project1 account = new project1();
			boolean x2=true;
			String name, address;
			long accountNumber;
			double balance;
			while(x2)
			{
				int k=0;
				try
				{
					do
					{
						System.out.print("Enter name");
						if(k>0)
							System.out.println(" again:");
						else
							System.out.println(" :");
						name = scn.nextLine();
						k++;
					}
					while(!validName(name));
					System.out.println("Enter account number:");
					accountNumber = scn.nextLong();
					System.out.println("Enter Balance: ");
					balance = scn.nextDouble();
					System.out.println("Enter address: ");
					scn.nextLine();
					address = scn.nextLine();
					
					//System.out.println(name+" "+accountNumber+" "+balance+" "+address);
					
					account.createAccount(name, accountNumber, address, balance);
					x2=false;
				}
				catch(Exception e)
				{
					System.out.println("Please enter right formats!");
				}
			}
			account.printToFile();
			break;
		case 2:
			System.out.println("Enter the account number of the account you want to see: ");
			String accountNumber2="";
			x2=true;
			
			while(x2)
			{
				try
				{
					accountNumber2 = scn.nextLine();
					valid(accountNumber2+".txt");
					x2=false;
				}
				catch(Exception e)
				{
					System.out.println("Please enter a valid account number");
				}
			}
			
			String source ="D:\\JAVA\\JAVA\\ANM Bazlur Exercise\\JavaIntermediate\\Accounts"+File.separator+accountNumber2+".txt";
			
			FileInputStream in = null;
			
			try
			{
				in = new FileInputStream(source);
				int c;
				while((c=in.read()) !=-1)
				{
					System.out.print((char)c);
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			break;
		case 3:
			System.out.println("========== Good Bye ==========");
			end=false;
			break;
			
		}
		
		}
		scn.close();
	}

}
