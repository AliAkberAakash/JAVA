public class Account
{
	private String name;
	private double balance;
	
	public Account(String name, double deposit)
	{
		this->name=name;
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
		System.util.printf("%s balance: %.2f$\n",name, balance);
		
	}
	
	
	
}