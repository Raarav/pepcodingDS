import java.util.*;

public class pattern18
{
    public static void pattern18func(int n)
    {
        int nstar=n;
        int nspace=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nspace;j++)
            {
                System.out.print("\t");
            }
            for(int j=0;j<nstar;j++)
            {
                if(j!=0&&j<nstar-1&&i!=0&&i<n/2)
                {
                    
                    System.out.print("\t");
                    
                }
                else{
                    System.out.print("*\t");
                }            
            }          

            if(i<n/2)
            {
                nstar-=2;
                nspace++;               
            }
            else
            {
                nstar+=2;
                nspace--;
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern18func(n);
    }
}