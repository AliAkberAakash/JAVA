package exceptionHandling;
import  java.util.*;

public class TryAndCatchDemo {

	Scanner scn = new Scanner(System.in);
	
	String url = "https://www.facebook.com";
	
	IllegalArgumentException ob1 = new IllegalArgumentException();
	{
	try
	{
		ob1.takesUrl(url);
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	}

}


