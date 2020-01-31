import java.util.*;

public class patten17
{
    public static void arrow(int n)
    {
        int nstar=0;
        int nspace=n/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nspace;j++)
            {

                System.out.print("\t");                
            }
            for(int j=0;j<=nstar;j++)
            {
                if(j<nstar/2&&i!=n/2)
                {
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                
            }
            if(i<n/2)
            {
                nstar+=2;
                nspace--;
            }
            else
            {
                nstar-=2;
                nspace++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        arrow(n);
    }
}