import java.util.*;

public class barChart
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        barChartFunc(arr);
    }
    public static void barChartFunc(int[] arr)
    {
        int max = maxFunc(arr);
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<max-i)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
            
        }
    }
    public static int maxFunc(int[] arr)
    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}