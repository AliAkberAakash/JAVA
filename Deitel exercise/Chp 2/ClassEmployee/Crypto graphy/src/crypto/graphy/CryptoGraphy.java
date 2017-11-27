/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.graphy;
import java.util.Scanner;

/**
 *
 * @author cedwa
 */
public class CryptoGraphy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first,second,third,fourth,num,var;
        
        Scanner input= new Scanner(System.in);
        
        num=input.nextInt();
        
        System.out.println("Encrypt(1) or Decrypt(2)?");
        
        var=input.nextInt();
        
        //separating digits
        first=num%10; num/=10;
        second=num%10; num/=10;
        third=num%10; num/=10;
        fourth=num;
        
        if(var==1)
        {
            first=(first+7)%10;
            second=(second+7)%10;
            third=(third+7)%10;
            fourth=(fourth+7)%10;
            
            System.out.printf("%d%d%d%d\n",second,first,fourth,third);
        }
        
        else
        {
            first=((first+10)-7)%10;
            second=((second+10)-7)%10;
            third=((third+10)-7)%10;
            fourth=((fourth+10)-7)%10;
            
            System.out.printf("%d%d%d%d\n",fourth,third,second,first);
        }
        
        
        
        
    }
    
}
