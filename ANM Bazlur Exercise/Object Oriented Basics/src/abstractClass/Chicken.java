package abstractClass;

public class Chicken extends Animal{

	public Chicken(int n)
	{
		super(n);
	}
	
	@Override
	public String getDiets()
	{
		return "ALmost everything";
	}
	
}
