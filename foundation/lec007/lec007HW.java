/*
1.printting element diagonally.
2.finding sadel point in matrix
3.printing wave like pattern
*/ 


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
        int[][] arr = {{3,5,7},{1,4,8},{1,6,2}};
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr2 = {{1,2,3},{4,5,6},{10,18,4}};
        int[][] arr3 = {{9,1,2},{8,5,7},{3,4,6}};
        int[][] arr4 = {{10,12,7,3,12},{3,10,6,2,8},{18,24,17,6,10},{15,21,10,8,12},{1,18,22,4,15}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Saddle points:-");
        sadelPoint(arr);
        sadelPoint(arr1);
        sadelPoint(arr2);
        sadelPoint(arr3);
        sadelPoint(arr4);
    } 
    public static void sadelPoint(int[][] arr)
    {
      for(int j=0;j<arr[0].length;j++)
      {
          int max=arr[0][j];
          int i=0;
          int p=0;
          while(i<arr.length)
          {
              if(max>arr[i][j])
              {
                  i++;
              }
              else
              {
                  max=arr[i][j];
                  p=i;
                  i++;                  
              }
          }
          checkmin(arr, max, p);
      }  
    }

    public static void checkmin(int[][] arr,int min,int s)
    {
        int k=0;
        int count = 0 ;
        boolean bool = false;

        while(k<arr[0].length)
        {
            if(min>arr[s][k])
            {
                if(s==arr.length-1 && k==arr.length-1)
                {
                    bool = true;
                }
                break;                
            }
            else if(min<=arr[s][k])
            {
                if(k==arr.length-1)
                {
                    System.out.println(min + " ");
                    count++;
                }
                k++;                
            }      
        }    
        if(bool && count==0)
        {
            System.out.println("Not Found Saddle Point");
        }        
    }
    

    /////printing wave like pattern
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
        wave(arr);
    }

    public static void wave(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for(int j=arr[0].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j] + " ");
                }                
            }
        }
    }

    

    */
}