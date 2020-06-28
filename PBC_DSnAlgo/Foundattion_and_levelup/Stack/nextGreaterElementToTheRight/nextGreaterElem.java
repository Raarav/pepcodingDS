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
            if(arr[i]<st.peek()&&st.size()!=0){
                res[st.pop()]=arr[i];
            }else if(arr[i]<&&st.size()!=0){

            }
            else{
                st.push(i);
            }            
        }
    }    
}