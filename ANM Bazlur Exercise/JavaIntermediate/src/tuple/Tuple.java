package tuple;

public class Tuple <X,Y> {
	
	private X x;
	private Y y;
	
	public Tuple(X x, Y y)
	{
		this.x=x;
		this.y=y;
	}
	
	public X getX()
	{
		return x;
	}
	
	public Y getY()
	{
		return y;
	}
	
	public void showTypes()
	{
		System.out.println("Type of X is "+x.getClass().getName());
		System.out.println("Type of Y is "+y.getClass().getName());
	}

	public static void main(String[] args) {
		
		Tuple <String, Integer> tuple = new Tuple<>("Hello", 55);
		
		tuple.showTypes();
		
		System.out.println("Value of X is: "+tuple.getX());
		System.out.println("Value of Y is: "+tuple.getY());

	}

}
