/*
1.Dec to Any
2.Any to Dec
3.Any to Any
*/
import java.util.*;

//Dec to Any

public class lec004
{
    /*    
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int val = scn.nextInt();
        int base =  scn.nextInt();
        Dec2Any(val,base);     

    }
    public static void Dec2Any(int val,int base)
    {
        int rem,rem1=0,ten=1;
        while(val>0)
        {
            rem=val%base;
            val=val/base;
            rem1 += rem*ten;
            ten *= 10;
        }
        System.out.print(rem1);
    }
    */

    
    ////Any to decimal

    /*
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int val = scn.nextInt();
        int base =  scn.nextInt();
        Any2Dec(val,base);     

    }
    public static void Any2Dec(int val,int base)
    {
        int rem,rem1=0,t=1;;
        while(val>0)
        {
            rem=val%10;
            val=val/10;
            rem1 += rem*t;
            t *= base;
        }
        System.out.print(rem1);
    }
    
    */

    ///Any to Any convetor

    
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int val = scn.nextInt();
        int base =  scn.nextInt();
        int base1=  scn.nextInt();
        int ans = Any2Dec(val,base);
        Dec2Any(ans,base1);  
             

    }

    public static void Dec2Any(int val,int base)
    {
        int rem,rem1=0,ten=1;
        while(val>0)
        {
            rem=val%base;
            val=val/base;
            rem1 += rem*ten;
            ten *= 10;
        }
       System.out.print(rem1);
    }
    public static int Any2Dec(int val,int base)
    {
        int rem,rem1=0,t=1;;
        while(val>0)
        {
            rem=val%10;
            val=val/10;
            rem1 += rem*t;
            t *= base;
        }
        return rem1;
    }
    
}
