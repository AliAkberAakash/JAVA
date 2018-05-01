package basic;

import java.util.Scanner;

public class Addiion {

	public static void main(String[] args) {
		int t;
		Scanner scn = new Scanner(System.in);
		String s;
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			s=scn.next();
			
			System.out.println("Sum = "+(s.charAt(0)+s.charAt(4)-96));
		}
		

		scn.close();
	}

}
