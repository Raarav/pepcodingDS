import java.util.*;
import java.io.*;

class sortKsortedArray{

    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void sKsA(int[] arr) {
        for(int ele: arr){
            pq.add(ele);
        }        
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }   
        sKsA(arr); 
    }
}