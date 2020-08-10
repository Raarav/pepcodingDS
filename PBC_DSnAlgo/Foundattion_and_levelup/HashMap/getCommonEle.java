import java.util.HashMap;
import java.util.Map;
import java.util.*;

class getCommonEle{
    
    public static char printComm(int[] a1, int[] a2){
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for(int i=0;i<a1.length;i++)
        {
            if(hmp.get(arr[i])==null){
                
            }
            else{
                
            }   
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            a1[i]=scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2]; 
        for(int i=0;i<n2;i++)
        {
            a2[i]=scn.nextInt();
        }       
        printComm(a1,a2);
    }
}