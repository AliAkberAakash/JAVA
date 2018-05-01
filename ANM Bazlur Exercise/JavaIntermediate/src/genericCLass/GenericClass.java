package genericCLass;

public class GenericClass<T> {

	private T obj;
	
	public GenericClass(T obj)
	{
		this.obj=obj;
	}
	
	public T getObj()
	{
		return obj;
	}
	
	public void showType()
	{
		System.out.println("Type of T is: " + obj.getClass().getName());
	}
	
}
