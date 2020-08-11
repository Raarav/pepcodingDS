import java.util.*;
import java.io.*;
import java.util.Map

class longestConsucativeSubsqence{

    public static void lcsInArray(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])==false){
                hm.put(arr[i],1);
            }
        }
        //ketSet()
        for(int ele: hm.keySet()){
            if(hm.containsKey(ele-1)==false && hm.containsKey(ele+1)==true){
                ele=ele+1;
                while(hm.containsKey(ele)!=false){
                    int ans = hm.get(ele);
                    hm.put(ele,ans+1);
                    ele=ele+1;
                }    
            }
        }
        int max = 0;
        for(int e : hm.keySet()){
            if(max<hm.get(e)){
                max=hm.get(e);
            }
        }

        // System.out.print(hm); 
        // System.out.print(hm.keySet());     
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }    
        lcsInArray(arr);
    }
}