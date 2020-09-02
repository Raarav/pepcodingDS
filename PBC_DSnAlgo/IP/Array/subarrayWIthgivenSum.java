/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class subarrayWithgivenSum {
    
    public static int[] swgs(int[] arr, int sum){
        int i=0,j=0,csum=0;
        int[] res=new int[2];
        while(j<arr.length || csum>sum){
            if(csum<sum){
                csum+=arr[j];
                j+=1;
            } else if(csum>sum){
                csum-=arr[i];
                i+=1;
            } else {
                break;
            }
        }
        res[0]=i+1; res[1]=j;
        return res;
    }
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0){
    		int n = scn.nextInt();
    		int sum = scn.nextInt();
    		int[] arr = new int[n];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=scn.nextInt();
    		}
    		int[] ans = swgs(arr,sum);
    		int check = 0;
    		for(int i=ans[0]-1;i<ans[1];i++){
    		    check+=arr[i];
    		}
    		if(check==sum){
    		    for(int i=0;i<ans.length;i++){
    		    System.out.print(ans[i]+" ");
    	 	 }
    	 	 System.out.println();
    		}else {
    		    System.out.println("-1");
    		}
    		t--;
		}
	}
}