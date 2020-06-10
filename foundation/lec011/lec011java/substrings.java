import java.util.*;

public class substrings
{    
    public static void substringsfunc(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length()+1;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }        
    }


    public static void main(String[] args) {
        String str = "abcd"; 
        substringsfunc(str);   
        //String str1 = new String("abcd");
    }    
}