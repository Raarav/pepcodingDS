import java.util.*;

class getKPC{
    static String[] code = {""};

    public static ArrayList<String> getKPCFunc(String st){
        if(st.length()==0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> res = getKPCFunc(st.substring(1));
        ArrayList<String> myans = new ArrayList<>();
        char ch = st.charAt(0);
        String clength = code[ch-'0'];
        for(int i=0;i<clength.length();i++){
            myans.add();    
        }
        return finalans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        System.out.print(getKPCFunc(st));    
    }
}