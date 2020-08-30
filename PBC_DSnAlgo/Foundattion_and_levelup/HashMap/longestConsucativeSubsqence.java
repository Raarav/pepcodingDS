import java.io.*;
import java.util.*;

public class longestConsucativeSubsqence {

    public static ArrayList<Integer> lcqs(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
            if(hm.get(arr[i])==null){
                hm.put(arr[i],1);
            } 
        }
        for(Integer i : hm.keySet()){
            if(hm.containsKey(i-1)==false){
                int val = hm.get(i);
                int ival=i+1;
                while(hm.containsKey(ival)){
                    val+=1;
                    ival+=1;
                }
                hm.put(i,val);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int max = 0;
        int ele = 0;
        for(Integer i : hm.keySet()){
            if(max<hm.get(i)){
                ele=i;
                max=hm.get(i);
            }
        }
        for(int j = 0;j<max;j++){
            res.add(ele + j);
        }
        return res;
    }

    public static void main(String[] args){
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> ans = lcqs(arr);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}