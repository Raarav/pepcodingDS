import java.util.*;

public class AnyToDec
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        int base = scn.nextInt();
        int ans = 0;
        int pow = 1;
        while(val>0)
        {
            int rem = val%10;
            val = val/10;
            ans += rem*pow;
            pow = pow*base;           
        }
        System.out.print(ans);
    }
}
