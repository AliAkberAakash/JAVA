package basic;

import java.util.*;

public class counting_alphabets {

	public static void main(String[] args)
	{
		String s1;
		int a[]= new int[27];
		Scanner scn = new Scanner(System.in);
		int t;
		
		t=scn.nextInt();
		
		s1=scn.nextLine();
		
		for(int i=0; i<t; i++)
		{
			s1=scn.nextLine();
			
			Arrays.fill(a, 0);
			
			for(int j=0; j<s1.length(); j++)
			{
				a[s1.charAt(j)-'a']++;
			}
			
			for(int j=0; j<26; j++)
			{
				if(a[j]>0)
				System.out.printf("%c %d\n", (j+'a'), a[j]);
			}
			
			System.out.println();
			
		}
		
		scn.close();
		
		
	}
	
	
}
