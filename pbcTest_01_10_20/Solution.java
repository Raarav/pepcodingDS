import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        

        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=scn.nextInt();
        // }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}