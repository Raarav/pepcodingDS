import java.util.*;
import java.util.ArrayList;

public class nokiaKeyPadThroughPost
{
    public static ArrayList<String> nokiaKey(String Q,String[] codes)
    {
        if(Q.length()==0)
        {
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;

        }
        ArrayList<String> recAns = nokiaKey(Q.substring(1), codes);
        ArrayList<String> myAns = new ArrayList<>();
        int num = Q.charAt(0)-'0';
        String word = codes[num];
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            for(String str: recAns)
            {
                myAns.add(ch + str);
            }
        }
        return myAns;
    }
    public static void main(String[] args)
    {
        String[] codes = {"?.",".:","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.print(nokiaKey("234",codes));
    }
}