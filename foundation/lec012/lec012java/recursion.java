import java.util.*;

public class recursion
{
    public static void recpattern1(int n)
    {        
        if(n==1)
        {
            System.out.print(n + "\t");
            return;
        }
        System.out.print(n + "\t");
        recpattern1(n-1);
        System.out.print(n + "\t");
    }
        
    /*
    public static void rec(int n)
    {
        if(n==0)
        {
            return;
        }
        rec(n-1);
        System.out.print(n + "\t");
    }
    */
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //rec(n);
        recpattern1(n);
    }
}
