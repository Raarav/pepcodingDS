import java.io.*;
import java.util.*;

public class getSubSqence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0) {
            ArrayList<String> base =  new ArrayList<String>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        // String chstr = Character.toString(ch); 
        String restStr = str.substring(1);
        ArrayList<String> restList = gss(restStr);
        ArrayList<String> myans = new ArrayList<>();
        for(String st: restList){
            myans.add("" + st);
        }
        for(String st: restList){
            myans.add(ch + st);
        }
        return myans;
    }

}