import java.util.*;

public class nokiaKeyPad
{
    public static void nokiaKey(String Q,String ans,String[] codes)
    {
        if(Q.length()==0)
        {
            System.out.print(ans + " ");
            return;
        }
        char ch = Q.charAt(0);
        int num = ch-'0';
        String word = codes[num];
        for(int i=0;i<word.length();i++)
        {
            char ch1 = word.charAt(i);
            nokiaKey(Q.substring(1),ans+ch1,codes);

        }        
    }
    public static void main(String[] args)
    {
        String[] codes = {"?.",".:","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        nokiaKey("234", "", codes);
    }
}