package genericCLass;

public class GenericClassTest {

	public static void main(String[] args) {
		
		GenericClass<Integer> iobj;
		
		iobj = new GenericClass<Integer>(100);
		
		iobj.showType();
		
		int v = iobj.getObj();
		
		System.out.println("Value: "+v);
		
		GenericClass<String> ss = new GenericClass<String> ("My name is Aakash");
		
		ss.showType();
		
		String s=ss.getObj();
		
		System.out.println(s);
		

	}

}
