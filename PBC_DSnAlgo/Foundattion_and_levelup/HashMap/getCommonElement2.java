import java.io.*;
import java.util.*;

public class getCommonElement2{
    static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void gce2(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])==false){
                hm.put(arr1[i],1);
            }else{
                int ans = hm.get(arr1[i]);
                hm.put(arr1[i],ans + 1);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(hm.containsKey(arr2[i])==true && hm.get(arr2[i])!=0){
                int ans = hm.get(arr2[i]);
                hm.put(arr2[i],ans-1);
                System.out.println(arr2[i]);
            }
        }
        // System.out.print(hm);
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0;i<arr1.length;i++){
        arr1[i]=scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<arr2.length;i++){
        arr2[i]=scn.nextInt();
    }
    gce2(arr1,arr2);
 }

}