package basic;

import java.util.Scanner;

public class RunRate {

	public static void main(String[] args) {
		int t;
		double myRun, opRun, ballsLeft, reqRun;
		double oversPlayed, oversLeft, curRunRate, reqRunRate;
		Scanner scn = new Scanner(System.in);
		
		t=scn.nextInt();
		
		for(int i=0; i<t; i++)
		{
			opRun=scn.nextDouble();
			myRun=scn.nextDouble();
			ballsLeft=scn.nextDouble();
			
			opRun++;
			
			reqRun=opRun-myRun;
			
			//System.out.println(reqRun);
			
			oversPlayed=(300-ballsLeft)/6.0;
			oversLeft=(ballsLeft/6.0);
			
			if(oversPlayed !=0)
				curRunRate=myRun/oversPlayed;
			else
				curRunRate=0;
			
			if(oversLeft!=0)
				reqRunRate=reqRun/oversLeft;
			else
				reqRunRate=0;
			
			System.out.printf("%.2f %.2f\n", curRunRate, reqRunRate);
			
		}
		
		
		scn.close();
	}

}
