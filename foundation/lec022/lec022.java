import java.util.*;

////stair-case through DP 
public class lec022
{
    ////minimum cost of to rech the designation

    public static int mazepathminiCost(int[][] arr,int er,int ec)
    {
        int[][] dp = new int[er][ec];
        for(int i=er;i>=0;i++)
        {
            for(int j=ec;j>=0;j--)
            {              

            }
                        
        }
        return ans;
    }



    ///mazepath
    public static int mazepath(int er,int ec)
    {
        int[][] dp = new int[er+1][ec+1];
        dp[er][ec]=1;
        for(int i=er;i>=0;i--)
        {
            for(int j=ec;j>=0;j--)
            {
                if(i==er && j==ec)
                {
                    //
                }
                else if(i==er)
                {
                    dp[i][j] = dp[i][j+1];
                }
                else if(j==ec)
                {
                    dp[i][j] = dp[i+1][j];
                }
                else 
                {
                    dp[i][j] = dp[i][j+1] + dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
 
    ///stairCaseTabularization.

    public static int stairCaseT(int[] dp, int n)
    {
        dp[0]=1;
        for(int i=1;i<dp.length;i++)
        {
            int ans=0;
            if(i-1>=0)
            {
                ans += dp[i-1];
            }
            if(i-2>=0)
            {
                ans += dp[i-2];
            }
            if(i-3>=0)
            {
                ans += dp[i-3];
            }
            dp[i]=ans;
        }
        return dp[n];        
    }

    ///stairCaseMemorization
    public static int stairCaseM(int[] dp,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];            
        }
        int ans=0;
        if(n-1>=0)
        {
            ans += stairCaseM(dp,n-1);
        }
        if(n-2>=0)
        {
            ans += stairCaseM(dp,n-2);
        }
        if(n-3>=0)
        {
            ans += stairCaseM(dp,n-3);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int n=4;
        int[] dp = new int[n+1];
        System.out.println(stairCaseM(dp,n)); 
        System.out.println(stairCaseT(dp,n));
        System.out.println(mazepath(3,3));
        int[][] arr={{3,8,30,7,4},{5,10,15,2,18},{6,29,27,13,15},{10,19,10,1,3},{4,8,20,2,6}};
        System.out.println(mazepathminiCost(arr,3,3));

    }
}