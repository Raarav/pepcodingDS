import java.util.*;

public class anyBaseAdition
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.print(anyBaseAditionfunc(base,num1,num2));
    }
    public static int anyBaseAditionfunc(int base,int num1,int num2)
    {
        int res=0;
        int carry=0;
        int pow=1;
        while(num1>0 || num2>0 || carry>0)
        {
            int rem1 = num1%10;
            int rem2 = num2%10;
            num1 = num1/10;
            num2 = num2/10;
            int rem = rem1 + rem2 + carry;
            carry = rem/base;
            int ans = rem%base;
            res += ans*pow;
            pow = pow*10;
        }
        return res;
    }
}