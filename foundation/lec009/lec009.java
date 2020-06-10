/// first ocuurene in array
///last ocurrence in array
/*
1.)subset of array
*/

import java.util.*;

public class lec009
{

    ////first Ocuurence
    
    // public static void main(String[] args)
    // {
    //     Scanner scn = new Scanner(System.in);
    //     int[] arr = {7,12,12,12,12,33,44};
    //     int data = scn.nextInt();
    //     System.out.println(firstOcrence(arr, data));
    //     // System.out.println(ans);
    // }
    // public static int firstOcrence(int[]  arr, int data)
    // {
    //     int left = 0;
    //     int right = arr.length-1;

    //     while(left<=right)
    //     {
    //         int mid = (left+right)/2;
    //         if(arr[mid]==data)
    //         {
    //             if(mid-1>=0 && arr[mid-1]==data)
    //             {
    //                 right =  mid-1;
    //             }else
    //             {
    //                 return mid;
    //             }
    //         }
    //         else if(arr[mid]>data)
    //         {
    //             right=mid-1;
    //         }
    //         else
    //         {
    //             left=mid+1;
    //         }
    //     }
    //     return -1;
    // }



    ////last Ocuurence

    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,1,1,3,3,3,4,5,7,8,8,9,9};
        int data = scn.nextInt();
        System.out.println(firstOcrence(arr, data));
        // System.out.println(ans);
    }
    public static int firstOcrence(int[]  arr, int data)
    {
        int left = 0;
        int right = arr.length-1;

        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==data)
            {
                if(mid+1<arr.length && arr[mid]==data)
                {
                    left =  mid+1;
                }else
                {
                    return mid;
                }
            }
            else if(arr[mid]>data)
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

    

    //remain//rotation


    /*
    
    public static void main(String[] args)
    {
        int[] arr = {2,1,3};
        int sum = 0;
        int rot = 0;
        for(int i=0;i<arr.length;i++)
        {
            rot = rot + (i*arr[i]);
            sum = sum + arr[i];
        }
        int mymax=rot;
        for(int i=1;i<arr.length;i++)
        {
            rot = rot - (sum - arr.length*arr[i-1]);
        }
        if(rot>mymax)
        {
            mymax=rot;
        }
        System.out.print(mymax);

    }
    */

////////////////////subsquence of array    

    /*

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        int pow = 1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
            pow = pow*2;
        }
        
        int count = 0;
        while(count<pow)
        {
            int length = 0;
            int cc = count;
            System.out.print("[");
            while(cc!=0)
            {
                int rem =  cc%2;
                cc = cc / 2;
                if(rem==1)
                {
                    System.out.print(arr[length] + " ");
                }
                length++;                
            }            
            count++;
            System.out.println("]");
        }
        
    }
    

////subarrays of array

/*
public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();            
        }       
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }        
        }
    }
    */
}