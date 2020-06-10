import java.util.*;

public class reverseOfArray
{
    public static void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(j>i)
        {
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        display(arr);
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
        reverse(arr);        
    }
}