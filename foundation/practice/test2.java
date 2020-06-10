import java.util.*;
public class test2{
    public static void set(int[] arr,ArrayList<Integer> res,int target)
    {
       Arrays.sort(arr);
        for(int x = 0; x < arr.length - 2; x++) {
            int new_target = target - arr[x];
            int i = x + 1, y = arr.length - 1;
            while(i < j) {
                // 1. equal -> print + 
                if(arr[i] + arr[j] == new_target) {
                    System.out.println(arr[x] + " " + arr[i] + "" + arr[j]);
                    i++;
                    j--;
                } 
                else if(arr[i] + arr[j] < new_target)
                i++;
                else j++;
            }
        }
    }

     public static void main(String []args){
        int[] arr = {3,1,9,7,5,-1};
        ArrayList<Integer> res = new ArrayList<>(); 
        set(arr,res,0);
     }
}