import java.util.*;
public class arrangeBuilding {

    public static int aB(int n){
        if(n==0) return 0;
        if(n==1) return 2;
        if(n==2) return 3;
        int ans = aB(n-2) + aB(n-1);
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = aB(n);
        System.out.print(ans*ans);
    }    
}