
import java.util.*;

public class selectionSort
{

    //////////through iterative


    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {2,8,6,5,3,7,9,4,-1};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

    // public static void sort(int[] arr,int i)
    // {
    //     if()

    //     if(i==arr.length)
    //     {
    //         return;
    //     }
    //     int val=arr[0];       
    //     sort(arr,i+1);
    // }
    // public static void main(String[] args)-
    // {
    //     int[] arr = {2,8,6,5,3,7,9,4};
    //     sort(arr,0);
    // }

