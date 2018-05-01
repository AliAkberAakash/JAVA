package basic;

import java.util.Scanner;

public class CountingNumbers {

	public static void main(String[] args) {
		String s1, s2[];
		int t;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		s1=scn.nextLine();
		
		for(int i=0; i<t; i++)
		{
			s1=scn.nextLine();
			
			s2=s1.split(" ");
			
			System.out.println(s2.length);
			
			
		}
		
		scn.close();
		
	}

}
