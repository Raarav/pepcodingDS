import java.util.*;

class climbStairsWithMultiVariable{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        System.out.print(cStair(arr,0));
    }
    public static int cStair(int[] arr,int idx) {
        if(idx==arr.length-1) return 1;

        if()

        for(int i=1;i<=arr[idx];i++){
            cStair(arr, idx+i);
        }                            
    }
}