import java.util.*;

public class Isprime
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean b = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                b = false;
                break;
            }
        }
            if(b)
            {
                System.out.print("prime");
            }
            else
            {
                System.out.print("not prime");
            }
        
    }
}