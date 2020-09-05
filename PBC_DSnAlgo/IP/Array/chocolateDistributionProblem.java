/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class chocolateDistributionProblem {
    public static void merge(int[] arr,int s,int e) {
		int mid = (s+e)/2;
		int i=s;
		int j=mid+1;
		int k=s;
		int[] temp = new int[100];
		while(i<=mid && j<=e){
			if(arr[i]<arr[j]){
				temp[k++]=arr[i++];
			}else{
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		while(j<=e){
			temp[k++]=arr[j++];
		}

		for(int p=s;p<=e;p++){
			arr[p]=temp[p];
		}

	}
    public static void mergeSortRecursive(int[] arr,int startId, int endId) {
        if(startId>=endId){
			return;
		} 
        int mid = (startId+endId)/2;
        mergeSortRecursive(arr,startId,mid); 
		mergeSortRecursive(arr,mid+1,endId); 
		merge(arr,startId,endId);  
    }
    public static int cdp(int[] arr,int n1){
		mergeSortRecursive(arr,0,arr.length-1);
		// for(int i=0;i<arr.length;i++){
		// 	System.out.print(arr[i] + " ");
		// }
		int i=0;
		int j=i+(n1-1);
		int minVal = Integer.MAX_VALUE;
		while(j<arr.length){
			int min = arr[i];
			int max = arr[j];
			minVal=Math.min(minVal,max-min);
			j++;
			i++;
		}
		return minVal;
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