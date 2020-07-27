/*package whatever //do not write package name here */

//? Question Link :- https://practice.geeksforgeeks.org/problems/rearrange-characters/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    int ar[] = new int[26];
		    Arrays.fill(ar,0);
		    char c  ='\0';
		    for(int i = 0 ; i < s.length();i++){
		        c = s.charAt(i);
		        ar[c-'a']++;
		    }
		    Arrays.sort(ar);
		    int sum = s.length();
		    int max =0;
		    for(int i=25;i>=0;i--){
		        if(ar[i] != 0){
		          
		            max =ar[i];
		            break;
		        }
		    }
		   
		    if(sum==max){
		        if(sum==1)System.out.println("1");
		        else System.out.println("0");
		    
		        continue;
		    }
		    if(sum-max+1 >= max)System.out.println("1");
		    else System.out.println("0");
		}	
	}
}