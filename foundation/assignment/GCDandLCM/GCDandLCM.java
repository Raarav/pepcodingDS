import java.util.*;

public class GCDandLCM
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a<b)
        {
            int s = a;
            int l = b;
            int res = gcd(s,l);
            System.out.println(res);
            System.out.println((a*b)/res);            
        }
        else
        {
            int s = b;
            int l = a;
            int res = gcd(s,l);
            System.out.println(res);
            System.out.println((a*b)/res); 
        }              
    }
    private static int gcd(int s,int l)
    {
        int r = l%s;
        while(r>1)
        {
            l = s;
            s = r;
            r = l%s;            
        }
        return s;
    }        
}
