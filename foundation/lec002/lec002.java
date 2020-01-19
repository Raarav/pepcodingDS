import java.util.*;
public class lec002
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        //////////print whole prime no.s till no. enter


        for(int i=2;i<=n;i++)
        {
            boolean isprime=true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    isprime=false;
                    break;

                }
            }
            if(isprime)
            {
                System.out.print(i + " ");
            }
        }
    }
}
