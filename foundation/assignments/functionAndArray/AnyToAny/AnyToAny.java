import java.util.*;

public class AnyToAny
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        int base  = scn.nextInt();
        int base1 = scn.nextInt();
        System.out.print(AnyToAnyfunc(val,base,base1));
    } 
    public static int AnyToAnyfunc(int val, int base,int base1)
    {
        int ans = anyToDec(val,base);
        System.out.println(ans);
        int res = decToAny(ans,base1);
        return res;
    }
    public static int anyToDec(int val,int base)
    { 
        int ans=0;
        int pow = 1;
        while(val>0)
        {
            int rem = val%10;
            val = val/10;
            ans += rem*pow;
            pow = pow*base; 
        }
        return ans;        
    }
    public static int decToAny(int val,int base)
    {
        int ten = 1;
        int res = 0;
        while(val>0)
        {
            int rem = val%base;
            val =  val/base;
            res += rem*ten;
            ten = ten*10;
        }
        return res;
    }
}