import java.util.*;

public class lec021
{
    
    public static int partition(int[] arr,int lo,int hi)
    {
        int pivot = arr[hi];
        int i=0,j=0;
        while(j<=hi)
        {
            if(arr[j]<=pivot)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return i-1;
    }
    public static void quicksort(int[] arr,int lo,int hi)
    {
        if(lo>=hi)
        {
            return;
        }
        int pivotIndex = partition(arr,lo,hi);
        quicksort(arr, lo, pivotIndex-1);
        quicksort(arr, pivotIndex+1, hi);
    }
    public static void main(String[] args)
    {
        int[] arr={3,8,10,12,18,6,5,4,3,9};
        quicksort(arr,0,arr.length-1);
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}