import java.util.*;

public class DP
{
    public static int  fabRecursion(int n,int[] dp)
    {
        if(n==1||n==0)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int num1 = fabRecursion(n-1,dp);
        int num2 = fabRecursion(n-2,dp);
        dp[n]=num1+num2;
        return num1+num2;
    }

    public static void fabTabulation(int[] arr)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            
        } 
    }

    public static void main(String[] args)
    {
        int n = 7;
        int[] dp =  new int[n+1];
        // System.out.print(fabRecursion(n,dp));
        System.out.print(fabTabulation(dp));
    }
}