import java.util.*;
import java.io.*;
import java.util.Map;

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
                int ans = hm.get(ele);
                while(hm.containsKey(ele)!=false){                    
                    hm.put(ele,ans+1);
                    System.out.println(ele + "->" + hm.get(ele));
                    ele=ele+1;
                }    
            }
        }
        System.out.println(hm.keySet());
        int max = 0;
        int maxele = 0;
        for(int e : hm.keySet()){
            if(max<hm.get(e)){
                maxele=e;
                max=hm.get(e);
            }
        }
        System.out.println("ooooooooooooooooooooo");
        System.out.println(maxele);
        System.out.println(max);
        System.out.println("ooooooooooooooooooooo");
        for(int i=0;i<max;i++){
            System.out.println(maxele-i);   
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