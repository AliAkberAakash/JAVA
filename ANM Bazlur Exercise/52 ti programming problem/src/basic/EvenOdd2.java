package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class EvenOdd2 {
	
	static boolean IsOdd(BigInteger num)
	{
		long d=2, c=0;
		if(num.mod(BigInteger.valueOf(d))==BigInteger.valueOf(c))
			return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int t;
		BigInteger num;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			num=scn.nextBigInteger();
		
		
		if(IsOdd(num))
			System.out.println(num + " is Odd!");
		else
			System.out.println(num + " is Even!");
		}
			
		scn.close();
	}

}
