import java.util.*;

public class factorialByrec
{
    public static int fac(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int nm1fact=fac(n-1);    
        int myfact = n*nm1fact;
        return myfact; 
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(fac(n) + " ");
    }
}