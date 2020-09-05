/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int kedans(int[] arr){
        int cmax=0,smax=Integer.MIN_VALUE,i=0,j=0,m=0,n=0;
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
        
                int sumEle = 0;

        for(int i=0;i<arr.length;i++){
            revArr[i]=arr[i] * -1;
            sumEle += arr[i];

        }
        int val2 = kedans(revArr);
        // for(int i=0;i<arr.length;i++){
        //     sumEle += arr[i];
        // }
        val2=sumEle-(-1*val2);
        // return val2;
        return val1>val2?val1:val2;
    }
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
// 		Scanner scn = new Scanner(System.in);
// 		int t = scn.nextInt();
int t=Integer.parseInt(br.readLine());
    while(t>0){
    // 		int n = scn.nextInt();
    int n=Integer.parseInt(br.readLine());
        String[] inp=br.readLine().split(" ");
    		int[] arr = new int[n];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=Integer.parseInt(inp[i]);
    		   }
    		int ans = mcss(arr);
    		if(ans<=0){
    		    System.out.println("-1");
    		}else{
    		    System.out.println(ans);
    		}
    		t--;
		}
	}
}
