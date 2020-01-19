import java.util.*;

public class lec006HW
{
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        int val = scn.nextInt();
        input(arr);
        check(arr,val);

    }
    public static void input(int[] arr)
    {
        Scanner scn  = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
    }

    private static int check(int[] arr,int val)
    {
        
        int left=0;
        int right=arr.length-1;
        int mid = 0;

        while(left<=right)
        {
            mid =  (left+right)/2;
            if(arr[mid]==val)
            {
                return mid;
            }
            else if(arr[mid]<val)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            
        } 
        return -1;          
                    
    }

}