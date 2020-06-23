import java.util.*;
public class coinChangeCombination {    

    public static int ccc(int[] arr,int tar){
        if(tar==0){
            return 1;
        }    
        if(tar<0){
            return 0;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int withoutArr = ccc(arr,tar,idx+1);
            int withArr = ccc(arr,tar-arr[i],idx);
            ans=withArr+withoutArr;
        }  
        return ans;  
    }
    
    public static int cccself(int[] arr,int tar,int idx){
        
        if(tar==0){
            return 1;
        }
        if(idx==arr.length || tar<0){
            return 0;
        }
        int withArr = cccseld(arr,tar-arr[idx],idx);
        int withoutArr = cccself(arr,tar,idx+1);
        return withArr + withoutArr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }                
        int tar = scn.nextInt();
        // System.out.print(cccself(arr,tar,0));
        System.out.print(ccc(arr,tar));
    }    
}