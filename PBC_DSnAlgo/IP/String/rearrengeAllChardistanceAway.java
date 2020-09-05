/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String racda(String str){
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hm.containskey(ch)){
                int ans = hm.get(ch);
                hm.put(ch,ans+1);
            }else{
                hm.put(ch,1);
            }
        }  
              
    }
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
        String t = scn.nextLine();
		System.out.println(racda(t));
	}
}