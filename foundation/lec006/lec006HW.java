/*
1.upword printing star.
2.find 1st and end posision of given occurence value.
3.find floor and ceil of given value
*/ 


import java.util.*;

public class lec006HW
{

    //////////////upword printing star/////histogram
    
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
    

    ////find 1st and end posision of given occurence value.

    /////////find floor and ceil of given value

    /*
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] arr = {3,10,25,60,65,78,89,98,99};
        int value = scn.nextInt();
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        int ceil = -1;
        int floor = -1;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(arr[mid]==value)
            {
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }
            else if(value>arr[mid])
            {
                floor=arr[mid];
                left=mid+1;               
            }
            else
            {
                ceil=arr[mid];
                right=mid-1;
            }
        }
        System.out.println("floor:" +floor);
        System.out.println("ceil:" +ceil);
    }
    */
}