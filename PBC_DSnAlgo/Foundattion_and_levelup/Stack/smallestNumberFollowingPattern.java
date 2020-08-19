import java.io.*;
import java.util.*;

public class smallestNumberFollowingPattern{
    
    public static int[] snfp(String str){
        Stack<Integer> st = new Stack<>();
        int val = 1;
        int k = 0;
        int[] res = new int[str.length()+1];
        for(int i=0;i<str.length()+1;i++){
            if(i!=str.length()&&str.charAt(i)=='d'){
                st.push(val);
                val++;
            }else{
                st.push(val);
                while(st.size()!=0){
                    res[k]=st.pop();
                    k++;
                }
                val++;
            }
        }
        return res;
    }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    int[] ans = snfp(str);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]);
    }
 }
}