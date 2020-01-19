import java.util.*;



public class lec007
{


    // ////input and display 2D array
    /*

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int arr[][] = new int[rows][cols];
        input(arr);
        display(arr);
    }
    public  static void input(int arr[][]) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = scn.nextInt();
            }                        
        }        
    }
    public  static void display(int arr[][]) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }      
            System.out.println();                  
        }        
    }
    */

    //////////multiplication of 2D array

    /*

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int arr[][] = new int[rows][cols];
        int arr1[][] = new int[rows][cols];
        inputFirstMatrix(arr);
        inputSceondMatrix(arr1);
        solve(arr,arr1);
    }
    public  static void inputFirstMatrix(int arr[][]) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = scn.nextInt();
            }                        
        }        
    }
    public  static void inputSceondMatrix(int arr1[][]) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                arr1[i][j] = scn.nextInt();
            }                        
        }        
    }
    public  static void solve(int arr[][],int arr1[][]) {
        Scanner scn = new Scanner(System.in);
        int ans[][] = new int[arr.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                for(int k=0;k<arr1[0].length;k++)
                {
                    ans[i][k] += arr[i][k]*arr1[k][i];
                }   
            } 
        }
        display(ans);
               
    }
    

    public  static void display(int ans[][]) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j] + " ");
            }      
            System.out.println();                  
        }        
    }
    */

    ////print 2D array number pattern1
    

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        pattern1(arr);
    }
    public  static void pattern1(int arr[][]) {
        Scanner scn = new Scanner(System.in);
        for(int j=0;j<arr[0].length;j++) 
        {
            if(j%2==0)
            {
                for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--)
                {
                    System.out.print(arr[i][j] + " ");
                }

            }
                                    
        } 
               
    }

    /*

    ////finding path of rat

    public static void main(String[] args)
    {
        int[][] arr = {{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        move(arr);
    }
    public static void move(int[][] arr)
    {
        int i=0,j=0,dir=0;
        while(true)
        {
            dir += arr[i][j];
            dir=dir%4;
            if(dir==0)
            {
                j++;
            }
            else if(dir==1)
            {
                i++;                                
            }
            else if(dir==2)
            {
                j--;                                
            }
            else if(dir==3)
            {
                i--;                
            }
            if(i<0 || i==arr.length || j<0 || j==arr[0].length)
            {
                break;
            }
        }
        if(i<0)
        {
            i++;
        }
        else if(i==arr.length)
        {
            i--;
        }
        else if(j<0)
        {
            j++;
        }
        else if(j==arr.length)
        {
            j--;
        }
        System.out.print("exit point is :" + i + "," + j);
    }
    */
}
