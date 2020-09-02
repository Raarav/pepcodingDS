/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class convertArrayIntoZigZagFasion {
    public static void swap(int a,int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void caizzf(int[] arr){
        int a = 0,b = a + 1,c = a + 2;
        while(a<arr.length){
            if(b<arr.length && arr[a]>arr[b]){
                swap(a,b,arr);
            }
            if(c<arr.length && arr[b]<arr[c]){
                swap(b,c,arr);
            }
            a+=2;
            b=a+1;
            c=a+2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    	}
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
    		caizzf(arr);
    		System.out.println();
    		t--;
		}
	}
}