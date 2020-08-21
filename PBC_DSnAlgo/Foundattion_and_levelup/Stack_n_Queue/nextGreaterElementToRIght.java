import java.util.*;

class nextGreaterElementToRight{
    public static int[] nGR(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[arr.length];
        stk.push(0);
        for(int i=1;i<arr.length;i++){
            while(stk.size()>   0 && arr[stk.peek()]<arr[i]){
                res[stk.pop()] = arr[i];
            }    
            stk.push(i);
        }
        while(stk.size()>0){
            res[stk.pop()]=-1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int[] ans = nGR(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}