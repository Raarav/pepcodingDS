import java.util.*;

public class goldmine {

    public static int gmineHelper(int i,int[][] arr,int j){
        
        if(i<0 || i>arr.length-1){
            return Integer.MIN_VALUE;
        }

        if(j==arr[0].length-1){
            return arr[i][j];
        }
        
        int up = gmineHelper(i-1, arr,j+1);
        int same = gmineHelper(i, arr,j+1);
        int down = gmineHelper(i+1, arr,j+1);
        int max=0;
        max += Math.max(down,Math.max(up,same));
        return arr[i][j] + max;
    }

    public static int gmine(int[][] arr){
        int[] ansArr = new int[arr.length];
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            ansArr[i] = gmineHelper(i,arr,0);
            // System.out.println(ansArr[i]);
            if(max<ansArr[i]){
                max=ansArr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
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
        System.out.print(gmine(arr));
    }    
}