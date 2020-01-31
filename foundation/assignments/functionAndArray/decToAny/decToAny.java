import java.util.*;

public class decToAny
{
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int base = scn.nextInt();
        int ten = 1;
        int ans = 0;
        while(n>0)
        {
            int rem = n%base;
            n = n/base;
            ans += rem*ten; 
            ten = ten*10;
        } 
        System.out.print(ans);
    }
}