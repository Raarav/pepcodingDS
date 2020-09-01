/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int kedans(int[] arr){
        int cmax=Integer.MIN_VALUE,smax=Integer.MIN_VALUE,i=0,j=0,m=0,n=0;
        while(j<arr.length){
            cmax+=arr[j];
            if(cmax<0){
                i=j+1;
                cmax=0;
            } 
            if(cmax>smax){
                m=i;
                n=j;
                smax=cmax;
            }
            j+=1;
        }
        return smax;
    }
    public static int mcss(int[] arr){
        int val1 = kedans(arr);
        int[] revArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revArr[i]=arr[i] * -1;
        }
        int val2 = kedans(revArr);
        int sumEle = 0;
        for(int i=0;i<arr.length;i++){
            sumEle += arr[i];
        }
        val2=sumEle-(-1*val2);
        return val1>val2?val1:val2;
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
    		System.out.println(mcss(arr));
    		t--;
		}
	}
}