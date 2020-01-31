import java.util.*;

public class inverseOfNumber
{
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        int size = scn.nextInt();
        int n = scn.nextInt();
        
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        for(int i = 0; i<size;i++)
        {
            int rem = n%10;
            n=n/10;
            arr[arr.length-(i+1)] = rem;
            arr1[i]=0;
        }
        int i=size;
        for(int j = 0; j<size;j++) 
        {
            arr1[size-(arr[j])] = i--;
        } 
        for(int j = 0; j<size;j++) 
        {
            System.out.print(arr1[j]);
        }        
    }
}