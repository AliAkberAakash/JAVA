package interfaceExample;

public class BkashPayment implements Payment {
	
	@Override
	public long getAmount()
	{
		System.out.println("Taking BKash payment!");
		return 100;
	}

}
