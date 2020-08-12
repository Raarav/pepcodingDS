import java.io.*;
import java.util.*;

public class lastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(lastIndex(arr,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length) return -1;
        int ans = lastIndex(arr,idx+1,x);
        if(arr[idx]==x && ans==-1) return idx;
        return ans;
    }

}