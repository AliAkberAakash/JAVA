package basic;

import java.util.Scanner;

public class EvenOdd1 {
	
	static boolean IsEven(int  num)
	{
		if(num%2==0)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		int T;
		int num;
		
		Scanner scn = new Scanner(System.in);
		
		T=scn.nextInt();
		
		for(int i=0; i<T; i++)
		{
			num=scn.nextInt();
			
			
			if(IsEven(num))
			{
				System.out.println(num+ " is Even");
			}
			else
			{
				System.out.println(num+ " is Odd");
			}
		}
		
		scn.close();
		
	}

}
