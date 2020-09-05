class Solution {
    public void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void reverse(int i,int j,int[] arr){
        while(i<j){
            swap(i,j,arr);
            i++;
            j--;
        }        
    }
    public void nextPermutation(int[] arr) {
        int i=arr.length-1;
        if(arr.length<=1){
            return;
        }
        while(i>1 && arr[i]<=arr[i-1])
        {
            i--;
        }
        int j = i-1;
        int k = arr.length-1;            
        while(k>=0&&k>=j){
            if(arr[j]<arr[k]){
                break;
            }
            k--;
        }
        if(k>=0){
            swap(k,j,arr);
            reverse(i,arr.length-1,arr);
        }else {
            reverse(0,arr.length-1,arr);
        }
       
                
    }
}