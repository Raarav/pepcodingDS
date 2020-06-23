import java.util.*;


public class targetSumSubset {
    public static boolean tss(int[] arr,int tar,int idx){
        if(tar==0){
            return true;
        }
        if(idx==arr.length || tar<0){
            return false;
        }
        boolean ans = tss(arr,tar-arr[idx],idx+1) || tss(arr,tar,idx+1);
        return ans;   
    }
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int tar = scn.nextInt();
        System.out.print(tss(arr,tar,0));        
    }
}