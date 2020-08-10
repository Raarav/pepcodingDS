import java.util.*;
import java.io.*;

class Main{

    public static void gmpwj(int[] arr,int i,int j) {
        //horitzontal
        for(int i=1;i<arr.length-1;i++)
        {
            gmpwj(arr,i,j);
        }
        //diagnal
        for(int i=1;i<arr.length-1;i++)
        {
            gmpwj(arr,i,j);            
        }
        //vertical
        for(int i=1;i<arr.length-1;i++)
        {
            gmpwj(arr,i,j);            
        }    
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[][];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        gmpwj(arr,0,0);
    }
}