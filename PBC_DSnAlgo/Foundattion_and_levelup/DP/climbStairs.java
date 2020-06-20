import java.util.*;

class climbStairs{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        System.out.print(cStair(n,arr));
    }
    public static int cStair(int n,int[] arr) {
        if(n==0) return 1; 
        if(n<0) return 0;

        if(arr[n]!=0)
        {
            return arr[n];
        }

        int ans = cStair(n-1,arr);
        int ans1 = cStair(n-2,arr);
        int ans2  = cStair(n-3,arr);

        arr[n] = ans + ans1 + ans2;      
        
        return arr[n];
        
    }
}