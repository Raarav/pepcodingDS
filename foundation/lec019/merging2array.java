import java.util.*;

public class merging2array
{
    public static int[] merge(int[] arr,int[] arr1)
    {
        int[] res=new int[arr.length+arr1.length];
        int k=0,i=0,j=0;
        while(i<arr.length&&j<arr1.length)
        {
            if(arr[i]<arr1[j])
            {
                res[k]=arr[i];
                i++;
            }
            else
            {
                res[k]=arr1[j];
                j++;
            }
            k++;
        }

        while(i<arr.length)
        {
            res[k]=arr[i];
            i++;  k++;
        }

        while(j<arr1.length)
        {
            res[k]=arr1[j];
            j++;  k++;
        }

        return res;
        
    }
    public static void main(String[] args)
    {
        int[] arr={3,5,17,20,27,30};
        int[] arr1={2,4,6,18,20,23,45};
        int[] ans=merge(arr,arr1);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}