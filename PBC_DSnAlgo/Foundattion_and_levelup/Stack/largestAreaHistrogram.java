import java.io.*;
import java.util.*;

public class largestAreaHistrogram{
    
    public static int[] leftSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(0);
        res[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(st.size()!=0&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    public static int[] rightSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(arr.length-1);
        res[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()!=0&&arr[st.peek()]>=arr[i]){
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
    
    public static int lah(int[] arr)
    {
        int[] l = leftSmaller(arr);
        // for(int i=0;i<l.length;i++){
        //     System.out.print(l[i] + " ");
        // }
        int[] r = rightSmaller(arr);
        // for(int i=0;i<r.length;i++){
        //     System.out.print(r[i] + " ");
        // }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int m=0;
            int n=0;
            if(l[i]>r[i]){
                n=r[i];
                m=l[i];
            }else{
                n=l[i];
                m=r[i];
            }
            // System.out.println(m + " " + n );
            if(max<arr[i]*(m-n-1)){
                max=arr[i]*(m-n-1);
            }
        }
        return max;
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    // code
    System.out.print(lah(a));
 }
}