import java.util.HashMap;
import java.util.Map;
import java.util.*;

class HighestFreqCount{
    
    public static char printFreq(String word){
        HashMap<Character, Integer> hmp = new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            Integer c = hmp.get(ch);
            if(hmp.get(ch)==null)
            {
                hmp.put(ch,1);
            }else{
                hmp.put(ch,++c);
            }
        }
        int max = 0;
        char cha='1';
        for(Map.Entry<Character, Integer> c : hmp.entrySet()){
            if(c.getValue()>max){
                max=c.getValue();
                cha=c.getKey();
            }
        }
        return cha;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        System.out.print(printFreq(word));
    }
}