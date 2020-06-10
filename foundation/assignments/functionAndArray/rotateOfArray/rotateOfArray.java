import java.util.*;

public class rotateOfArray
{
    public static void display(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }        
    }
    public static void reverse(int[] arr,int i,int j)
    {
        while(j>i)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] arr,int k)
    {
        k=k%arr.length;
        if(k<0)
        {
            k=k+arr.length;
        }
        int i=arr.length-k;
        int j=arr.length-1;
        reverse(arr, i, j);
        i=0;
        j=arr.length-(k+1);
        reverse(arr, i, j);
        i=0;
        j=arr.length-1;
        reverse(arr, i, j);
        display(arr);
    }

    public static void main(String[] args)
    {
        Scanner scn  =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr,k);
    }
}
