import java.util.*;

public class pattern4
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace=1;
        int nstar=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<nspace;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=nstar;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            nstar--;
            nspace++;
        }
    }
}