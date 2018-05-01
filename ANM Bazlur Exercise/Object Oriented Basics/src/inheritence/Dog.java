package inheritence;

public class Dog extends Animal{
	
	private int lifespan;
	
	public Dog()
	{
		lifespan=20;
	}
	
	public void getLifeSpan()
	{
		System.out.println(lifespan);
	}
	
	public void setLifespan(int lifespan)
	{
		this.lifespan=lifespan;
	}
	
	public void bark()
	{
		System.out.println("Woof Woof!!");
	}
	
}
