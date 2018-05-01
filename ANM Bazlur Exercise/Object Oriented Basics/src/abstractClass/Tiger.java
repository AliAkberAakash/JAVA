package abstractClass;

public class Tiger extends Animal {
	
	public Tiger(int n)
	{
		super(n);
	}
	
	@Override
	public String getDiets()
	{
		return "Meat";
	}

}
