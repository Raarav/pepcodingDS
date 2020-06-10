import java.util.*;
public class lec020
{
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[j];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void sort012(int[] arr)
    {
        int i=0,k=0,j=0;

        while(j<arr.length)
        {
            if(arr[j]==1)
            {
                swap(arr,k,j);
                k++;
            } 
            if(arr[j]==0)
            {
                swap(arr,k,j);
                swap(arr,i,k);
                i++;
                k++;
            }  
            j++;         
        }

        for(int s=0;s<arr.length;s++)
        {[]
            System.out.print(arr[s]+" ");
        }
        
    }

    // public static void sort01(int[] arr,int i,int j)
    // {
    //     while(j<arr.length)
    //     {
    //         if(arr[j]==0)
    //         {
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             i++;
    //         }
    //         j++;
    //     }

    //     for(int k=0;k<arr.length;k++)
    //     {
    //         System.out.print(arr[k]+" ");
    //     }
        
    // }
    public static void main(String[] args)
    {
        ///int[] arr = {0,1,1,0,1,0,0,0,1,0,1};
        int[] arr1 = {0,2,0,2,0,1,2,0,2,1,0,1,0,1};
        //sort01(arr,0,0);
        sort012(arr1);
    }
}