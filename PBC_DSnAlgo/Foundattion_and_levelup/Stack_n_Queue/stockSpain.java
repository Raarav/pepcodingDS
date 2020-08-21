import java.util.*;

class stockSpain{

    public static int[] sS(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);  res[0]=1;
        for(int i=1;i<arr.length;i++){
           
            while(st.size()>0 && arr[st.peek()]<arr[i]){
                st.pop();  
            }
            if(st.size()==0){
                res[i]=i+1;
            }
            else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }  
        return res;              
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }        
        int[] ans = sS(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}