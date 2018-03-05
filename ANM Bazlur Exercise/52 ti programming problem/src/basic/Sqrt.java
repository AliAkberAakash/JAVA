package basic;

import java.util.Scanner;
import java.lang.Math;


public class Sqrt {

	public static void main(String[] args)
	{
		int t,num;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		for(int i=1; i<=t; i++)
		{
			num=scn.nextInt();
			
			for(int j=1; j<=Math.sqrt(num); j++)
			{
				//if(num%j==0)
					System.out.println(j+" ");
			}
			System.out.println();
			
		}
		
		scn.close();
	}
}
