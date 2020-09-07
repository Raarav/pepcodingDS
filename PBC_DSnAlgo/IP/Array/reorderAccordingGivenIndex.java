import java.util.*;
import java.lang.*;
import java.io.*;

class reorderAccordingGivenIndex{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int n = Integer.parseInt(br.readLine());
            String[] inpArray = br.readLine().split(" ");
            String[] inpIdx = br.readLine().split(" ");
            int[] arr = new int[n];
            int[] idxs = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(inpArray[i]);
            }
            for(int i=0;i<n;i++){
                idxs[i]=Integer.parseInt(inpIdx[i]);
            }
            for(int i=0;i<n;){
                if(idxs[i]==i){
                    i++;
                }
                else {
                    swap(i,idxs[i],arr);
                    swap(i,idxs[i],idxs);
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(idxs[i]+" ");
            }
            t--;
        }
    }
    public static void swap(int a,int b,int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;    
    }
}