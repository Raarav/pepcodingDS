import java.util.*;

public class lec007HW
{
    ///printting element diagonally
    /*
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        printELEdiagnol(arr);
    } 
    public static void printELEdiagnol(int[][] arr)
    {
        int i=arr.length-1,j=0;
        while(i<arr.length || j<arr.length)
        {
            while(i>=0 && j<arr.length)
            {
                int k=i;
                int p=j;    
                while(k<arr.length && p<arr.length)
                {
                    System.out.print(arr[k][p] + "  ");
                    k++;
                    p++;
                }
                if(i>0 && j==0)
                {
                    i--;
                }
                else if(i==0 && j<arr[0].length)
                {
                    j++;
                }
                
            }                              
            
        }
    }
    */

    /// finding sadel point in matrix

    public static void main(String[] args)
    {
        int[][] arr = {{3,5,8},{1,4,7},{1,6,2}};
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        sadelPoint(arr);
        sadelPoint(arr1);
    } 
    public static void sadelPoint(int[][] arr)
    {
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length;j++)
          {
              int max=arr[i][j];
              int min=arr[i][j];
              int k=0;
              while(k<arr.length)
              {
                  if(max>arr[k][j] && k==arr.length-1)
                  {
                      checkmin(arr, i, j, min);                   
                  }
                  if(i==arr.length-1 && j==arr.length)
                  {
                      System.out.print("Not Found Sadel Point");
                  }
                  k++;                                      
                  
              }                      
          }
       }  
    }

    public static void checkmin(int[][] arr,int i,int j,int min)
    {
        int k=0;
        while(k<arr.length)
        {
            if(min<arr[k][j] && k==arr.length-1)
            {
                System.out.print("Sadel Point of this matrix is :" + arr[i][j]);                         
                         
            }
            if(i==arr.length-1 && j==arr.length)
            {
                System.out.print("Not Found Sadel Point");
            }
            k++;                                      
                  
        }
                
    }
}