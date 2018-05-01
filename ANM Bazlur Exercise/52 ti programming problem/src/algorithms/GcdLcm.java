package algorithms;

import java.util.*;

public class GcdLcm {
	static int GCD(int a, int b)
	{
		if(b==0)
			return a;
		
		return GCD(b, a%b);
	}
	
	static int LCM(int a, int b)
	{
		return a*(b/GCD(a,b));
	}
	
	public static void main(String[] args) {
		int t, a, b;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			a=scn.nextInt();
			b=scn.nextInt();
			
			System.out.println("GCD = "+ GCD(a,b));
			System.out.println("LCM = "+ LCM(a,b));
		}
		
		scn.close();

	}

}
