// adding two variables

import java.util.Scanner;

public class Addition
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,sum;

		num1=input.nextInt();
		num2=input.nextInt();

		sum=num1+num2;
		System.out.printf("Sum is %d\n",sum);
	}
}