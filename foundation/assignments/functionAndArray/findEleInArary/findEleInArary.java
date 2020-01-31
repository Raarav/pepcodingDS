import java.util.*;

public class findEleInArary
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
        int d = scn.nextInt();
        System.out.print(find(arr,d));
    }
    public static int find(int[] arr,int d)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(d==arr[i])
            {
                return i;
            }
        }
        return -1;        
    }
}