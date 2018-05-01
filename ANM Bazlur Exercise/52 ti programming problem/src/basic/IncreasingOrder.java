package basic;

import java.util.Scanner;
import java.util.Arrays;

public class IncreasingOrder {

	public static void main(String[] args) {
		int t,a[];
		a = new int[3];
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		
		for(int i=0; i<t; i++)
		{
			System.out.print("Case "+(i+1)+": ");
			for(int j=0; j<3; j++)
			a[j]=scn.nextInt();
			
			Arrays.sort(a);
			
			for(int j: a)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		scn.close();
	}

}
