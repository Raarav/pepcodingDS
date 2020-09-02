/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int ep(int[] arr){
        
        int leftval = 0;
        int rightval = 0;
        for(int i=0;i<arr.length;i++){
            rightval+=arr[i];
        }
        int idx=0;
        for(;idx<arr.length;){
            leftval += arr[idx];
            if(leftval==rightval){
                break;
            }
            rightval -= arr[idx];
            idx++;
        }
        // System.out.println(idx);
        return idx;
    }
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0){
    		int n = scn.nextInt();
    		int[] arr = new int[n];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=scn.nextInt();
    		}
    		int ans = ep(arr);
    		
    		if(ans==n){
    		    System.out.println("-1");
    		}else{
    		    System.out.println(ans+1);
    		}
    		t--;
		}
	}
}