import java.util.*;
 public class lec006
 {

    ////reverse array *use only one
     /*
     public static void main(String[] args)
     {
         Scanner scn = new Scanner(System.in);
         
         
         int size = scn.nextInt();
         int[] arr = new int[size];
         for(int i = 0;i<arr.length;i++)
         {
             arr[i]=scn.nextInt();
         } 
         int i=0;
         int j=arr.length-1;
         
        while(i<j)
        {
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];                        
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k = 0;k<arr.length;k++)
         {
             System.out.print(arr[k] + " ");
         } 
        
     }
     */


     ////rotation of array
     /*
     public static void main(String[] args)
     {
         Scanner scn = new Scanner(System.in);
         int size = scn.nextInt();
         int r = scn.nextInt();
         int[] arr = new int[size];
         for(int i = 0;i<arr.length;i++)
         {
             arr[i]=scn.nextInt();
         }
         int i=arr.length-(r);
         int j=arr.length-1;
         reverse(arr, r, i, j);
         i=0;
         j=arr.length-(r+1);
         reverse(arr, r, i, j); 
         i=0;
         j=arr.length-1;
         reverse(arr, r, i, j);
         for(int k = 0;k<arr.length;k++)
         {
             System.out.print(arr[k] + " ");
         } 
         
     }

     public static void reverse(int[] arr, int r,int i,int j)
     {
                
       while(i<j)
       {
           int temp=0;
           temp=arr[i];
           arr[i]=arr[j];                        
           arr[j]=temp;
           i++;
           j--;
       }        
     }
     */

     /////printing star

     public static void main(String[] args)
     {
         Scanner scn = new Scanner(System.in);
         int size = scn.nextInt();
         int[] arr =  new int[size];
         for(int i = 0;i<arr.length;i++)
         {
             arr[i]=scn.nextInt();
         }
         int maxValue= greaterValue(arr);
         for(int i=maxValue;i>0;i--)
         {
             for(int j=0;j<arr.length;j++)
             {
                 if(arr[j]>=maxValue)
                 {
                    System.out.print("*\t");
                 }
                 else
                 {
                    System.out.print("\t");
                 }                                  
             }
             System.out.println();
             maxValue--;
         }
         
                  
     }
     public static int greaterValue(int[] arr){
         int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
     }
 }
