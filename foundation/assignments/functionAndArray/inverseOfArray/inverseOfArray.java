import java.util.*;

public class inverseOfArray
{
    public static void display(int[] arr1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    public static void inverse(int[] arr)
    {
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[arr[i]]=i;
        }
        display(arr1);
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        inverse(arr);
    }
}