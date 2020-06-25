import java.util.*;

public class countEncoding {
    public static int cE(String str,String ans){
        if(str.length()==0) return 1;
        int count=0;
        if(str.charAt(0)!='0'){
            char chs = str.charAt(0);
            count+=cE(str.substring(1),ans+chs);
        }
        if(str.length()>1){
            String stcheck = str.substring(0,2);        
            if(Integer.parseInt(stcheck)<27 && str.length()>1){
                int n = Integer.parseInt(stcheck)+64;
                char ch = (char)n;
                count += cE(str.substring(2),ans+ch);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(cE(str,""));     
    }    
}