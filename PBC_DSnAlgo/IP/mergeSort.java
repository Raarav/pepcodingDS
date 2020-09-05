import java.util.*;

class mergeSort{
    public static void merge(int arr[], int s, int e){
        int mid = (s+e)/2;
        int i = s;
        int j = mid + 1;
        int k = s;
        
        int[] temp = new int[100]; 
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=e){
            temp[k++] = arr[j++];
        }
        for(int p=s;p<=e;p++){
            arr[p] = temp[p];
        }
    }
    public static void mergeSortRecursive(int[] arr,int startId,int endId){
        if(startId>=endId){
            return;
        }
        int mid = (startId+endId)/2;
        mergeSortRecursive(arr,startId,mid);
        mergeSortRecursive(arr,mid+1,endId);
        merge(arr,startId,endId);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        mergeSortRecursive(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}