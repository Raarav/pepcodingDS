import java.util.*;

public class stockSpain {

    public static void sS(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        s.push(i);
        for(int i=1;i<arr.length;i++){
            if(st.size()!=0&&arr[st.peek()]<arr[i]){
                while(st.size()!=0&&arr[st.peek()]<arr[i]){
                    res[st.pop()] = arr[i];
                }                
            }else if(st.size()!=0&&arr[st.ppek()]<arr[i]){

            }
            s.push(i);
        }
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        sS(arr);
    }
}