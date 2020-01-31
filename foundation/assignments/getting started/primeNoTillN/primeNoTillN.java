import java.util.*;

public class primeNoTillN
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low;i<=high;i++)
        {
            boolean bool = true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    bool=false;
                    break;
                }
            }
            if(bool)
            {
                System.out.println(i + " ");
            }            
        }
    }
}
