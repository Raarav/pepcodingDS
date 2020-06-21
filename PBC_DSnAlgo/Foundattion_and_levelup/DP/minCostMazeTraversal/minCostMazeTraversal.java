import java.io.*;
import java.util.*;

public class minCostMazeTraversal {
    public static int mcmt(int[][] arr,int i,int j,int n,int m)
    {
        if(i==n&&j==m){
            return arr[i][j];
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int ans=0;
        if(j<m){
            min1 = mcmt(arr,i,j+1,n,m);
        }
        if(i<n){
            min2 = mcmt(arr,i+1,j,n,m);
        }
        ans = Math.min(min1,min2); 
        return ans + arr[i][j];
    }

    public static void main(String[] args) throws Exception {
        // write your code here 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scn.nextInt();  
            }
        }
        System.out.println(mcmt(arr,0,0,n-1,m-1));
        // System.out.print();
    }

    
}