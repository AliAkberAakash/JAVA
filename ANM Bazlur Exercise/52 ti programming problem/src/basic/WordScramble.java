package basic;

import java.util.*;

public class WordScramble {
	
	public static String revString(String s1)
	{
		String s2="";
		for(int i=s1.length()-1; i>=0; i--)
			s2+=s1.charAt(i);
		
		return s2;
	}

	public static void main(String[] args) {
		String s1,s2[];
		int t;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		s1=scn.nextLine();
		
		for(int i=0; i<t; i++)
		{
			s1=scn.nextLine();
			
			s2=s1.split(" ");
			
			for(int j=0; j<s2.length; j++)
			{
				System.out.print(WordScramble.revString(s2[j]));
				if(j<s2.length-1)
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		scn.close();

	}

}
