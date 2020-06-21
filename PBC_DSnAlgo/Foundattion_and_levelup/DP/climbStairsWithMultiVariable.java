import java.util.*;

class climbStairsWithMultiVariable{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int[] arr = {3,3,0,2,1,4,3,0,4,0,0};
        System.out.print(cStair(arr,0));
    }
    public static int cStair(int[] arr,int idx) {
        if(idx==arr.length-1) return 0;
        if(idx>=arr.length) return arr.length;
        int ans=arr.length;
        for(int i=1;i<=arr[idx];i++){
            ans = Math.min(ans,cStair(arr, idx+i));
        }
        return ans+1;                            
    }
}