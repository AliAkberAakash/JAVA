/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.security.SecureRandom;
import java.util.Scanner;


/**
 *
 * @author Aakash
 * @date 26.11.17
 * email: cedward318@gmail.com
 */
public class game {
    
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    /**
     * @param args the command line arguments
     */
    
    //modes
    private static final int ADD=0;
    private static final int SUB=1;
    private static final int MULT=2;
    
    public static void main(String[] args) {
        System.out.println("PLease select difficulty level:\n(1)Easy\n(2)Hard\n");
        int n;
        
        Scanner input = new Scanner(System.in);
        
        n=input.nextInt();
        
        if(n==1)
        {
            easy();
        }
        else
        {
            hard();
        }       
        
    }
    
    public static void easy()
    {
        int myAnswer,correct,wrong;
        
        correct=0;
        wrong=0;
        
        Scanner input= new Scanner(System.in);
        
        for(int i=0; i<7; i++)
        {
            int answer = createQuestion(9);
            
            myAnswer = input.nextInt();
            
            if(answer==myAnswer)
            {
                correct++;
                
                correctAns(randomNumbers.nextInt(4));
            }
            else
            {
                wrong++;
                wrongAns(randomNumbers.nextInt(4));
            }
        }
        
        if(correct>=7)
            System.out.printf("You Have done a very good job!\nCorrect answers=%d\nWrong answers=%d\n", correct,wrong);
        else
            System.out.printf("You Have done a very poor!\nCorrect answers=%d\nWrong answers=%d\n",correct,wrong);
    }
    
    public static void hard()
    {
        //does nothing
    }

    public static int createQuestion(int x)
    {
        int answer;
        
        int num1=randomNumbers.nextInt(x);
        int num2=randomNumbers.nextInt(x);
        int opType=randomNumbers.nextInt(3);
        
        answer=operation(num1,num2,opType);
        
        return answer;
    }
    
    public static int operation(int x, int y, int n)
    {
        int answer=0;
        
        System.out.printf("What is the result of ");
        
        switch(n)
        {
            case ADD:
                answer=x+y;
                System.out.printf("%d + %d ?\n", x,y);
                break;
            case SUB:
                System.out.printf("%d - %d ?\n", x,y);
                answer=x-y;
                break;
            case MULT:
                System.out.printf("%d * %d ?\n", x,y);
                answer=x*y;
                break;
        }
        
        
        return answer;
    }
    
    public static void correctAns(int n) 
    {
        
        switch(n)
        {
            
            case 0:
                System.out.println("Nice Work!\n");
                break;
            case 1:
                System.out.println("Very Good!\n");
                break;
            case 2:
                System.out.println("Excellent!\n");
                break;
            default:
                System.out.println("Keep up the good work\n");
                break;
        }
        
    }
    
    public static void wrongAns(int n) 
    {
        
        switch(n)
        {
            
            case 0:
                System.out.println("No.Please try again.\n");
                break;
            case 1:
                System.out.println("Worng. Try once more.\n");
                break;
            case 2:
                System.out.println("Don't give up.\n");
                break;
            default:
                System.out.println("No. Keep trying.\n");
                break;
        }
        
    }
   
    
}
