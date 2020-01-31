import java.util.*;

public class anyBaseMultiplication
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int  num2 = scn.nextInt();
        //anyBaseMultiplicationfunc(base,num1,num2);
        System.out.print(anyBaseMultiplicationfunc(base,num1,num2));
    }
    public static int anyBaseMultiplicationfunc(int base,int num1,int num2)
    {
        int totalRes=0;
        int pow=1;
        while(num2>0)
        {
            int rem2 = num2%10;
            num2 = num2/10;
            int proAns = productOfOneDigit(base, num1, rem2);
            totalRes = anyBaseAddition(base,totalRes,proAns*pow);
            pow=pow*10;
        }
        return totalRes;
    }
    public static int productOfOneDigit(int base,int num1,int rem2)
    {
        
        int carry = 0;
        int pow=1;
        int res=0;
        while(num1>0 || carry>0)
        {
            int rem1 = num1%10;
            num1 = num1/10;
            int ans1 = (rem1*rem2 + carry);
            carry = ans1/base;
            ans1=ans1%base;
            res += ans1*pow;
            pow=pow*10;
        }
        return res;

    }
    public static int anyBaseAddition(int base,int num1,int num2)
    {
        int res = 0;
        int carry = 0;
        int pow=1;
        while(num1>0 || num2>0 || carry>0)
        {
            int rem1 = num1%10;
            int rem2 = num2%10;
            num1 = num1/10;
            num2 = num2/10;
 
            int rem = rem1+rem2+carry;
            carry = rem/base;
            rem = rem%base;
            res += rem*pow;
            pow = pow*10;
        }
        return  res;
    }
}