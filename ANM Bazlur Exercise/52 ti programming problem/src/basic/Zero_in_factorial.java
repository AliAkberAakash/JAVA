package basic;

import java.util.Scanner;

public class Zero_in_factorial {

	public static void main(String[] args) {
		int t, f;
		
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			f=scn.nextInt();
			int x=5,c=0;
			while(x<f)
			{
				c+=(f/x);
				x*=5;
			}
			System.out.println(c);
		}
		
		scn.close();

	}

}
