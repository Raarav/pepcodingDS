/////diamond
import java.util.*;

public class pattern6
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = n/2;
        int nstar = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=nspace;j++)
            {
                System.out.print("*\t");
            }
            for(int j=0;j<(2*nstar+1);j++)
            {
                System.out.print("\t");
            }
            for(int j=0;j<=nspace;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<(n/2))
            {
                nspace--;
                nstar++;
            }
            else
            {
                nspace++;
                nstar--;
            }
        }
    }
}