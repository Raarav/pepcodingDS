import java.util.*;
public class lec005
{
    /*
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        display(arr);
    }
    public static void input(int[] arr)
    {
        Scanner scn  = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
    }
    public static void display(int[] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    */

    //////////self//////finding maximum vaalue in array


    /*
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        System.out.println(displayMaxValue(arr));
    }
    public static void input(int[] arr)
    {
        Scanner scn  = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
    }
    private static int displayMaxValue(int[] arr)
    {
        int i=0;
        int max=0;
        for(int j = 1;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                i = j;
                max=arr[i];                
            }

        }
        return max;
    }
    */
    

    /////finding min value


    /*
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        System.out.println(displayMaxValue(arr));
    }
    public static void input(int[] arr)
    {
        Scanner scn  = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
    }
    private static int displayMaxValue(int[] arr)
    {
        int i=0;
        int min=0;
        for(int j = 1;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                i = j;
                max=arr[i];                
            }

        }
        return max;
    }
    */
    //////LINEAR SEARCH

    ////not self//////check exiting value

    /*
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        System.out.println(check(arr));
    }
    public static void input(int[] arr)
    {
        Scanner scn  = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
    }
    private static boolean check(int[] arr)
    {
        
        Scanner scn  = new Scanner(System.in);
        int val = scn.nextInt();
              
        for(int j = 0;j<arr.length;j++)
        {
            
            
            if(arr[j]==val)
            {
                return true;                
            }

        }
        return false;
    }*/

    ///BINERY SEARCH
    

    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        System.out.println(check(arr));
    }
    public static void input(int[] arr)
    {
        Scanner scn  = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
    }
    private static int check(int[] arr)
    {
        
        Scanner scn  = new Scanner(System.in);
        int val = scn.nextInt();

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