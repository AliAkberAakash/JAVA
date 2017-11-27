public class Account test
{
	public static void main( String[] args)
	{
		Account acc1 = new Account("Jane Green", 50.00);
		Account acc2 = new Account("John    Blue",  -7.53);
	
		acc1.printDetails();
		acc2.printDetails();
		
		acc1.deposit(10.17);
		acc2.deposit(13.97);
		
		acc1.printDetails();
		acc2.printDetails();
		
	}
}