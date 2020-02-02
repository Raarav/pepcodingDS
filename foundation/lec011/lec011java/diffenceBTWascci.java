import java.util.*;

public class diffenceBTWascci
{
    public static String diffenceBTWasciifunc(String str)
    {
        String ans="";
        for(int i=0;i<str.length()-1;i++)
        {
            ans+=str.charAt(i);
            ans+=str.charAt(i+1)-str.charAt(i);
        }
        ans+=str.charAt(str.length()-1);
        return ans;
    }
    public static void main(String[] args)
    {
        String str = "abcdef";
        String str1=  diffenceBTWasciifunc(str);
        System.out.print(str1);
    }
}