package basic;

import java.util.Scanner;

public class CompleteSquare {

	public static void main(String[] args) {
		int t, num;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			num =scn.nextInt();
			
			if(Math.ceil(Math.sqrt(num))==Math.floor(Math.sqrt(num)))
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			
		}
		
		scn.close();

	}

}
