import java.io.*;
import java.util.*;

public class slidingWindow{
    public static int[] nge(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        res[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()!=0 && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=arr.length;
            }else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    public static int[] swm(int[] arr, int k){
        int[] ans = nge(arr);
        int[] res = new int[arr.length-(k-1)];
        for(int i=0;i<res.length;i++){
            int j=i;
            while(i+(k-1)>=ans[j]){
                j=ans[j];
            }
            // if(ans[i]==arr.length) res[i]=arr.length;
            res[i]=j;
        }
        return res;
    }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    int k = scn.nextInt();
    // code
    int[] ans = swm(arr,k);
    for(int i=0;i<ans.length;i++){
        System.out.println(arr[ans[i]]);
    }
 }
}