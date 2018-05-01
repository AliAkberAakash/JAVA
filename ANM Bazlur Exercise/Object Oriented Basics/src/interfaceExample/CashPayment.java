package interfaceExample;

public class CashPayment implements Payment{

	@Override
	public long getAmount()
	{
		System.out.println("Taking Cash payment!");
		
		return 500;
	}
}
