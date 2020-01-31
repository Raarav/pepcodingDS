/////diamond
import java.util.*;

public class pattern6
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstar = n/2+1;
        int nspace = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nstar;j++)
            {
                System.out.print("*\t");
            }
            for(int j=1;j<=nspace;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=nstar;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=(n/2))
            {
                nstar--;
                nspace+=2;
            }
            else
            {
                nstar++;
                nspace-=2;
            }
        }
    }
}