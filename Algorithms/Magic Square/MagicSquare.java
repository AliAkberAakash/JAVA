import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[][] magic;
        int n,k,l;

        System.out.println("Enter the value of n:");

        Scanner input = new Scanner(System.in);

        n=input.nextInt();

        magic = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                magic[i][j]=0;
        int i=0;
        int j=(n-1)/2;

        magic[i][j]=1;

        for(int key=2; key<=n*n; key++)
        {
            if(i>=1) k=i-1; else k=n-1;
            if(j>=1) l=j-1; else l=n-1;

            if(magic[k][l]>=1) i=(i+1)%n;
            else
            {
                i=k;
                j=l;
            }
             magic[i][j]=key;
        }

        for(int p=0; p<n; p++)
            {
                for(int q=0; q<n; q++)
                    System.out.printf("%4d", magic[p][q]);
                System.out.println("");
            }

    }
}
