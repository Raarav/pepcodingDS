import java.util.*;

public class toogleOfChar
{
    public static String toogleOfCharfunc(String str)
    {
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch = (char) (ch - 'a' + 'A');
            }
            else
            {
                ch = (char) (ch - 'A' + 'a');
            }
            ans=ans+ch;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String str = "abcDeF";
        String str1=  toogleOfCharfunc(str);        
        System.out.print(str1);
    }
}