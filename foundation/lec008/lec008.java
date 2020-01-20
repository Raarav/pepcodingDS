import java.util.*;

public class lec008
{
    /// lec007HW.java>>>printing sprial pattern1
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
        spiralPrint(arr);
    }
    public static void spiralPrint(int[][] arr)
    {
        int minr=0,minc=0,maxr=arr.length-1,maxc=arr[0].length-1;
        int tne=arr.length*arr[0].length;
        while(tne>0)
        {
            ///left wall
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][minc] + " ");
                tne--;
            }
            minc++;

            ///bottom wall
            for(int i=minc;i<=maxc;i++)
            {
                System.out.print(arr[maxr][i] + " ");
                tne--;
            }
            maxr--;

            ///right wall
            for(int i=maxr;i>=minr;i--)
            {
                System.out.print(arr[i][maxc] + " ");
                tne--;
            }
            maxc--;

            ///Top wall
            for(int i=maxc;i>=minc;i--)
            {
                System.out.print(arr[minr][i] + " ");
                tne--;
            }
            minr++;
        }
    }
    */

    /// lec007HW.java>>>printing sprial pattern2

    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("1st matrix");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("1st matrix spiral pattern");
        spiralPrint(arr);
        System.out.println("\n");
        System.out.println("2st matrix");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("2st matrix spiral pattern");
        spiralPrint(arr1); 
    }
    public static void spiralPrint(int[][] arr)
    {
        int minr=0,minc=0,maxr=arr.length-1,maxc=arr[0].length-1;
        int tne = arr.length*arr[0].length;
        while(tne>0){
            for(int i=minc;i<=maxc;i++)
            {
                System.out.print(arr[minr][i] + " ");
                tne--;
            }
            minr++;
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][maxc] + " ");
                tne--;
            }
            maxc--;
            for(int i=maxc;i>=minc;i--)
            {
                System.out.print(arr[maxr][i] + " ");
                tne--;
            }
            maxr--;
            for(int i=maxr;i>=minr;i--)
            {
                System.out.print(arr[i][minc] + " ");
                tne--;
            }
            minc++;        
        }
    }

    ///////////rotate90 of array
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
        rotate90(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void rotate90(int[][] arr)
    {
        transpose(arr);
        System.out.println("rotated matrix");
        for(int i=0;i<arr.length/2;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length-1-i][j];
                arr[arr.length-1-i][j] = temp;
            }
        }
    }

    public static void transpose(int[][] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)
            {
                {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }                
            }

        }
    }
    */

    /////find sub array which sum is maximum and print array value.
    /////kaden's algorithm

    /*

    public static void main(String[] args)
    {
        int[] arr = {3,5,-1,-7,8,4,2,-6,10};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                sum += arr[j];
            }
        }
    }

    */
           
}