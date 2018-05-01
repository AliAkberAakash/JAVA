package basic;

import java.util.*;

public class ProbabilityOfTommyMiya {

	static int fact(int x)
	{
		int f=1;
		
		while(x>0)
		{
			f*=x;
			x--;
		}
		
		return f;
	}
	public static void main(String[] args) {
		String s1,s2[];
		
		int t,up,down;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		s1=scn.nextLine();
		
		for(int i=0; i<t; i++)
		{
			up=1;
			down=1;
			s1=scn.nextLine();
			s2=s1.split(" ");
			
			Map <String, Integer> newMap = new HashMap <String, Integer>();
			
			for(int j=0; j<s2.length; j++)
			{
				newMap.merge(s2[j], 1, Integer::sum);
			}
			
			for(Map.Entry<String,Integer> m: newMap.entrySet())
			{
				int comp =(int) m.getValue();
				
				if(comp>1)	
				{
					up*=fact(comp);
				}				
					
			}
			
			down=fact(s2.length);
			
			System.out.println(up+"/"+down);
			
		}
		
		scn.close();
	}

}
