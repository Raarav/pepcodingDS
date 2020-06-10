import java.util.*;

public class test1
{
    public static int miniCost(int[][] arr)
    {
        int[][] dp= new int[arr.length][arr[0].length];
        dp[dp.length-1][dp[0].length-1]=arr[arr.length-1][arr[0].length-1];
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i==dp.length-1&&j==dp[0].length-1)
                {
                    ////
                }
                else if(i==dp.length-1)
                {
                    dp[i][j]+=dp[i][j+1];
                }
                else if(j==dp[0].length-1)
                {
                    dp[i][j]+=dp[i+1][j];
                }
                else
                {
                    if(dp[i][j+1]<dp[i+1][j])
                    {
                        dp[i][j]+=dp[i+1][j];
                    }
                    else
                    {
                        dp[i][j]+=dp[i][j+1];
                    }
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args)
    {
        int[][] arr = {{3,8,30,7,4},{5,10,15,2,18},{6,29,27,13,15},{10,19,10,1,3},{4,8,20,2,6}};
        System.out.print(miniCost(arr));
    }

}
