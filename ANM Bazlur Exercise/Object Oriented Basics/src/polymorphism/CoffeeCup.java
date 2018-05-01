package polymorphism;

public class CoffeeCup {
	private Liquid innerLiquid;
	
	void addLiquid(Liquid liq)
	{
		innerLiquid=liq;
		
		innerLiquid.swirl(false);
	}

}
