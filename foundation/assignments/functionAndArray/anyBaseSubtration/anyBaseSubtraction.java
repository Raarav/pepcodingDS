import java.util.*;

public class anyBaseSubtraction
{
    public static int anyBaseSubtractionfunc(int base,int num1,int num2)
    {
        int res=0;
        int pow=1;
        int carry=0;
        while(num2>0)
        {
            int rem2=num2%10;
            num2 = num2/10;
            int rem1 = num1%10;
            num1 = num1/10;

            int ans = 0;
            rem2 = rem2 + carry;
            if(rem2>=rem1)
            {
                carry=0;
                ans=rem2-rem1;
            }
            else
            {
                carry=-1;
                ans = rem2+base+rem1;               
            }
            res += ans*pow;
            pow=pow*10;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.print(anyBaseSubtractionfunc(base, num1, num2));
    }
}