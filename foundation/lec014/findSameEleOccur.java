import java.util.*;

public class findSameEleOccur
{
    public static int[] find(int n,int[] arr,int data,int c)
    {
        if(n==arr.length)
        {
            int[] res = new int[c];
            return res;
        }
        if(data == arr[n])
        {
            c++;
        }

        int[] ans=find(n+1,arr,data,c);
        if (arr[n] == data) {
            ans[c-1] = n;
        }

        return ans;
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
        int data = scn.nextInt();
        int I=scn.nextInt();
       // int[] res = find(0, arr, data,0);
        System.out.println(Arrays.toString(find(0, arr,data,I)));     
    }
}