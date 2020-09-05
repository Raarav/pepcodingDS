/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class chocolateDistributionProblem {
    public static void swap(int a,int b,int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;    
    }
    public static int[] mergeSortRecursive(int leftIndex, int rightIndex, int[] arr) {
        if(leftIndex==rightIndex) 
        int mididx = leftIndex+(rightIndex-1)/2;
        mergeSortRecursive(leftIndex,mididx,arr); 
        mergeSortRecursive(mididx,rightIndex,arr);   
    }
    public static int cdp(int[] arr,int n1){
        int[] sortedArray = mergeSortRecursive(0,arr.length,arr);
    }
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0){
    		int n = scn.nextInt();
    		int[] arr = new int[n];
    		int n1 = scn.nextInt();
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=scn.nextInt();
    		}
    		System.out.println(cdp(arr,n1));
    		t--;
		}
	}
}