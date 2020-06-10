import java.util.*;

public class mergeSort
{

    public static int[] merge(int[] arr,int[] arr1)
    {
        int[] res=new int[arr.length+arr1.length];
        int k=0,i=0,j=0;
        while(i<arr.length&&j<arr1.length)
        {
            if(arr[i]<arr1[j])
            {
                res[k]=arr[i];
                i++;
            }
            else
            {
                res[k]=arr1[j];
                j++;
            }
            k++;
        }

        while(i<arr.length)
        {
            res[k]=arr[i];
            i++;  k++;
        }

        while(j<arr1.length)
        {
            res[k]=arr1[j];
            j++;  k++;
        }

        return res;
        
    }

    public static int[] sort(int low,int high,int[] arr)
    {
        if(low==high)
        {
            int[] base=new int[1];
            base[0]=arr[low];
            return base;            
        }
        int mid=(low+high)/2;
        int[] left=sort(low, mid, arr);
        int[] right=sort(mid+1, high, arr);
        int[] ans = merge(left,right);
        return ans;
    }
    public static void main(String[] args)
    
    {
        int[] arr={2,8,6,5,3,7,9,4};
        int[] res=sort(0,arr.length-1,arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
