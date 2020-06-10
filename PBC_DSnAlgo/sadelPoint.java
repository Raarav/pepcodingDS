import java.util.*;
class sadelPoint{
    public static boolean spmax(int[][] arr,int k,int max){
        // int dumy = arr[0][k]; 
        boolean flag = true;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i][k]){
                flag = false;
                break;   
            }
        }
        if(flag == true)
        {
            System.out.print(max);            
        }
        return flag;
    }
    public static void sp(int[][] arr,int r,int c)
    {
        boolean flag = false;
        for(int i=0;i<r;i++)
        {
            int k = 0;
            int temp = arr[i][k];   // ? 123
            for(int j=0;j<c;j++){   // ? 456 
                if(temp>arr[i][j]){ // ? 789
                    temp=arr[i][j];
                    k=j;                    
                }
            }
           flag =flag || spmax(arr,k,temp);
        }
           if(flag==false)
           {
               System.out.print("no sadel point found");
           }        
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        sp(arr,r,c);
    }
}