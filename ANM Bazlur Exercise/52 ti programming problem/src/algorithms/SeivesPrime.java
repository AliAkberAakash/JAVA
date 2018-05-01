package algorithms;

import java.util.*;

public class SeivesPrime {
	public static boolean[] prime=new boolean[1000001];
	static void sieveOfEranthosis()
	{
		Arrays.fill(prime, true);
		
		for(int i=2; i*i<=100000; i++)
		{
			if(prime[i])
			{
				for(int j=i*2; j<=100000; j+=i)
				{
					prime[j]=false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int t,a,b,count;
		Scanner scn = new Scanner(System.in);
		
		sieveOfEranthosis();
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			count=0;
			a=scn.nextInt();
			b=scn.nextInt();
			
			for(int j=a; j<=b; j++)
			{
				if(prime[j])
				{
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
		scn.close();

	}

}
