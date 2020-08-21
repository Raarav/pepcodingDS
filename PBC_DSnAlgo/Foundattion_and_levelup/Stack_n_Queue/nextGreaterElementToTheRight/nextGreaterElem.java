import java.util.*;

public class nextGreaterElem {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()!=0&&arr[i]>arr[st.peek()]){
                while(st.size()!=0&&arr[st.peek()]<arr[i]){
                    res[st.pop()]=arr[i];                    
                }
            }
            st.push(i);         
        }
        while(st.size()>0){
            res[st.pop()]=-1;
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }    
}   