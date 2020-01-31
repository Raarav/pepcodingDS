import java.util.*;

public class piramid
{
    ////piramid
    /*
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row-(i+1);j++)
            {
                System.out.print("\t");
            }
            for(int j=0;j<(2*i+1);j++)
            {
                System.out.print("*\t");
            }
            System.out.println();

        }
    }
    */

    ////////////diamond
    /*

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp=n/2;
        int nstr=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=nstr;j++)
            {
                System.out.print(" * ");
            }
            if(i<=n/2)
            {
                nsp--;
                nstr=nstr+2;
            }
            else
            {
                nsp++;
                nstr-=2;
            }
            System.out.println();
                      
        }
    }
    */

    /////////////pascal triangle

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0;i<n;i++)
        {
            int var=1;
            System.out.print(var + " ");
            for(int j=0;j<i;j++)
            {
                var=var*(i-j)/(j+1);
                System.out.print(var + " ");
            }
            System.out.println();
        }

    }
        
}