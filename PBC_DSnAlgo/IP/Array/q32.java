/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int Lsum_subarray(int[] arr,int k){
        int[] maxSum = new int[arr.length];
        maxSum[0]=arr[0];
        
        int cur_sum = arr[0];
        for(int i=1;i<arr.length;i++){
            cur_sum = Math.max(arr[i],cur_sum+arr[i]);
            maxSum[i]=cur_sum;
        }
        
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int result = sum;
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            result = Math.max(result,sum);
            result = Math.max(result,sum+maxSum[i-k]);
        }
        return result;
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    String[] str = br.readLine().split(" ");
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=Integer.parseInt(str[i]);
		    }
		    int k = Integer.parseInt(br.readLine());
		    System.out.println(Lsum_subarray(arr,k));
		}
	}
}