import java.util.*;

public class findlastoccuenc
{
    public static int find(int n,int[] arr,int data)
    {
        if(n==arr.length)
        {
            return -1;
        }
        int ans = find(n+1,arr,data);
        if(data==arr[n]&&ans==-1)
        {
            return n;
        } 
        return ans;    
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,2,8,9};
        int data = 2;
        System.out.print(find(0,arr,data));
    }
}