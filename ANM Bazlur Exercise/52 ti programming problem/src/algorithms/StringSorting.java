package algorithms;

import java.util.*;

public class StringSorting {
	
	public static int stringCompare(String str1, String str2)
	{
		for(int i=0; ; i++)
		{	
			if(i==str1.length()-1)
			{
				if(str1.length()==str2.length())
				{
					if(str1.charAt(i)==str2.charAt(i))
						return 0;
					return str1.charAt(i)>str2.charAt(i) ? 1 : -1;
				}
				return str1.charAt(i)>str2.charAt(i) ? 1 : -1;
			}
			
			if(i==str2.length()-1)
			{
				if(str1.length()==str2.length())
				{
					if(str1.charAt(i)==str2.charAt(i))
						return 0;
					return str1.charAt(i)>str2.charAt(i) ? 1 : -1;
				}
				return str1.charAt(i)>str2.charAt(i) ? 1 : -1;
			}
			
			if(str1.charAt(i) != str2.charAt(i))
			{
				return str1.charAt(i)>str2.charAt(i) ? 1 : -1;
			}
		}
		
	}
	
	public static String[] BubbleSort(String str[])
	{
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(stringCompare(str[i], str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		return str;
	}
	
	public static void print(String str[])
	{
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}
	
	public static void main(String[] args) {
		String str[];
		Scanner scn = new Scanner(System.in);
		int t, e;
		
		t=scn.nextInt();
		scn.nextLine();
		
		for(int i=0; i<t; i++)
		{
			e=scn.nextInt();
			
			scn.nextLine();
			
			str = new String[e];
			
			for(int j=0; j<e; j++)
			{
				str[j]=scn.nextLine();
			}
			
			str=BubbleSort(str);
			 
			print(str);
		}
		
		scn.close();
		
	}

}
