import java.util.*;
import java.math.BigInteger;

public class printAllSubsetsOfArray
{
    public static void subset(int[] arr,int pow)
    {
        for(int i=0;i<pow;i++)
        {
            for(int j=arr.length-1;j>=0;j--)
            {
                if(BigInteger.valueOf(i).testBit(j))
                {
                    System.out.print(arr[arr.length-(j+1)] + "\t");                    
                }
                else
                {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }                 
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int pow=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
            pow=pow*2;
        }
        subset(arr,pow);
    }
}