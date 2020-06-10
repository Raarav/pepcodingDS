import java.util.*;

public class recursionWithArray
{
    public static void recur(int n,int[] arr)
    {
        if(arr.length==n)
        {
            System.out.println();  
            return;
        }
        System.out.print(arr[n] + " ");
        recur(n+1,arr);
        System.out.print(arr[n] + " ");
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        recur(0,arr);
    }
}