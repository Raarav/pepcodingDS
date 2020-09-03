/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int loc(int n,int n1){
        // float div = n/2;
        int afterdiv = n*(n+1)/2;
        if(afterdiv==0){
            afterdiv=1;
        }
        int rem = n1%afterdiv;
        // System.out.println(rem);
        for(int i=1;i<=n;i++){
            int val = rem;
            rem-=i;
            int rv = rem;
            if(rv<0){
                rem=val;
                break;
            }
        }
        return rem;
    }
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0){
    		int n = scn.nextInt();
    		int n1 = scn.nextInt();
    		if(n==1){
    		    System.out.println("0");
    		}else {
    		    System.out.println(loc(n,n1));
    		}
    		t--;
		}
	}
}