import java.util.*;

public class pattern16
{
    public static void pattern16func(int n)
    {
        int nspace=(2*n-3); 
        int nstar=1;
        for(int i=1;i<=n;i++)
        {
            int count=1;
            for(int j=1;j<=nstar;j++)
            {
                System.out.print(count + "\t");  
                count++;              
            }
            for(int j=1;j<=nspace;j++)
            {
               System.out.print("\t");                                 
            }
            if(i==n)
            {
                nstar--;
                count--;
            }
            for(int j=1;j<=nstar;j++)
            {
                count--;
                System.out.print(count + "\t");
            }
            nspace-=2;
            nstar++;
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern16func(n);
    }

}