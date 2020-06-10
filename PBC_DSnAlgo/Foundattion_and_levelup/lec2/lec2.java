import java.util.*;

public class lec2{
    public static void sadel(int[][] arr)
    {
        int maxc=0;
        int k=0;
        for(int i=0;i<arr.length;i++)
        {         
            int min=arr[i][0];   
            for(int j=0;j<arr[0].length;j++)
            {
                
                // System.out.print(min);
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    k=j;
                    // System.out.print(min);
                }
                maxc=min;
                // k=j;
            }
            // System.out.print(maxc + " " + k + " ");
            check(k,arr,maxc);
            
        }
    }
    public static void check(int k,int[][] arr,int max)
    {
        // System.out.print(max);
        boolean flag=true;
        for(int s=0;s<arr.length;s++)
        {
            if(max<arr[s][k]){
                flag=false;                                  
            }            
        }
        if(flag == true)
        System.out.print(max);
    }
    public static void main(String[] args)
    {
        
        int[][] arr = {{5,2,3},{4,5,6},{17,18,9}};
        sadel(arr);
        
    }    
}