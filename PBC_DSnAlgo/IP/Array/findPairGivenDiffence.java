/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int fpgd(int[] arr,int n1){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],1);
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int remain=n1+arr[i];
            if(hm.containsKey(remain)){
                flag=true;
                break;
            }
        }
        
        return flag==true?1:-1;
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
    		System.out.println(fpgd(arr,n1));
    		t--;
		}
	}
}