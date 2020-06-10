import java.util.*;

class find_subarray_with_given_sum_Set1{
    // * Approch 1:- Brute force 
    public static void fswgs(int[]arr,int sum){
        for(int i=0;i<arr.length;i++)
        {
            int ans=0;
            for(int j=i;j<arr.length;j++)
            {
                ans=ans+arr[j];
                if(ans==sum)
                {
                    System.out.print("Sum found between indexes " + i + " and " + j);
                    return;
                }else if(ans!=sum && i==arr.length && j == arr.length)
                {
                    System.out.print("No subarray found");
                }     
            }
        }        
    }
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int j=0;j<t;j++){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int sum = scn.nextInt();
        fswgs(arr,sum);
        }
    }
}
