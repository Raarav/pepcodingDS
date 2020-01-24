import java.util.*;

public class pattern15
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;
        int nspace = n/2;
        int nval = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nspace;j++)
            {
                System.out.print("\t");                
            }
            for(int j=0;j<=(2*nval+1)/2;j++)
            {
                count++;
                System.out.print(count+"\t");
            }
            
            for(int j=(2*nval+1)/2;j<(2*nval+1)-1;j++)
            {
                count--;
                System.out.print(count+"\t");
            }
            
            System.out.println();
            if(i<n/2)
            {
                nspace--;
                nval++;
            }
            else
            {
                count-=2;
                nspace++;
                nval--;
            }
        } 
    }
}