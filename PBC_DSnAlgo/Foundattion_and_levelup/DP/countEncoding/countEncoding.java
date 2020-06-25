import java.util.*;

public class countEncoding {
    public static void cE(String str,String ans){
        if(str.length()==0 || str.length()==1) return 
        cE(str.subtring(1),ans);
        String stcheck = str.substring(0,2);
        if(Integer.parseInt(stcheck)<27){
            int n = Integer.parseInt(stcheck)+64;
            char ch = (char)n;
            cE(str.substring(2),ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        cE(str,"");     
    }    
}