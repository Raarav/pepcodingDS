import java.util.*;

public class firstAndLastIndexOfArray
{
    public static void Findex(int[] arr,int d)
    {
        int left=0;
        int right=arr.length-1;
        int f=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==d)
            {
                f=mid;
                right=mid-1;                
            }
            else if(arr[mid]>d)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }

        }
        System.out.println(f);
        
    }
    public static int Lindex(int[] arr,int d)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==d)
            {
                if(mid+1<arr.length&&arr[mid]==d)
                {
                    left=mid+1;
                }
                else{
                    return mid;
                }                
            }
            else if(arr[mid]>d)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt(); 
        }
        int search = scn.nextInt();
       Findex(arr,search);
        System.out.println(Lindex(arr,search));
    }
}