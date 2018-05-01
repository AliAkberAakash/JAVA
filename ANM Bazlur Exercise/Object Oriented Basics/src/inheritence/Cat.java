package inheritence;

public class Cat extends Animal{
	private int lifespan;
	
	public Cat()
	{
		lifespan=10;
	}
	
	public void getLifeSpan()
	{
		System.out.println(lifespan);
	}
	
	public void setLifespan(int lifespan)
	{
		this.lifespan=lifespan;
	}
	
	public void meaw()
	{
		System.out.println("Meaw");
	}

}
