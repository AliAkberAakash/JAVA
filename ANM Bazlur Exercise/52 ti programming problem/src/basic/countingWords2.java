package basic;

import java.util.*;

public class countingWords2 {

	public static void main(String[] args) {
		String s1, s2[];
		Scanner scn = new Scanner(System.in);
		int t;
		
		t=scn.nextInt();
		s1=scn.nextLine();
		
		for(int i=0; i<t; i++)
		{
			s1=scn.nextLine();
			s2=s1.split("[\\.,;!? ]");
			System.out.printf("Count = %d\n", s2.length);
		}
		
		scn.close();
		
	}

}
