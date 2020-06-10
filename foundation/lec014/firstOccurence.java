import java.util.*;

public class firstOccurence
{
    public static int firstOccurenceFunc(int n,int[] arr,int data)
    {
        if(n==arr.length)
        {
            return -1;
        }
        int ans = firstOccurenceFunc(n+1,arr,data);
        if(data==arr[n])
        {
            return n;
        }  
        return ans;    
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] arr = {2,2,3,2,5,6,2,8,9};
        int data = 2;
        System.out.print(firstOccurenceFunc(0,arr,data));
    }
}