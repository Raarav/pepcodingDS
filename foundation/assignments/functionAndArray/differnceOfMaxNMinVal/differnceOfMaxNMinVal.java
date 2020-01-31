import java.util.*;

public class differnceOfMaxNMinVal
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.print(max-min);
    }
}