import java.util.*;

class nQeens{
    public static void nQeensFunc(boolean[][] arr,int i,int j,ArrayList<String> ans,int count){
        if(i==arr.length-1&&j==arr.length-1&&count==arr.length){
            ans.add(".");
            System.out.println(ans);
        }
                                                                                                                                                                                                               
        nQeens();    
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        boolean[][] arr = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<String>();
        nQeensFunc(arr,0,0,ans,0);
    }
}