import java.util.*;

public class countBinaryString {

    public static int cbs(int zero,int one,int n,int idx){
        if(n==idx) return zero + one;
        int count = cbs(one,zero+one,n,idx+1);
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(cbs(1,1,n,1));
    }
    
}