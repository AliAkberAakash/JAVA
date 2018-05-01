package exercise;

public class Account {
	
	private long accountNumber;
	private double balance;
	private String name;
	private String address;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public long getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getAddress()
	{
		return address;
	}

}
