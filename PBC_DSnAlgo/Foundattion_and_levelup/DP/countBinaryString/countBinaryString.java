import java.util.*;

public class countBinaryString {

    //? through fabonacii
    public static int cbsfabo(int n)
    {
        if(n==0) return 0;
        if(n==1) return 2;
        if(n==2) return 3;
        
        return cbs(n-2)+cbs(n-1);
        
    }

    public static int cbs(int zero,int one,int n,int idx){
        if(n==idx) return zero + one;
        int count = cbs(one,zero+one,n,idx+1);
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.print(cbs(1,1,n,1));
        System.out.print(cbsfabo(n));
    }
    }
    
}