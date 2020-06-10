import java.util.*;

public class SbsqncOfArrayThroughRecur
{
    public static void SubSeq(String Q,String ans)
    {
        if(Q.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch = Q.charAt(0);
        String rest = Q.substring(1);
        SubSeq(rest, ans+ch);
        SubSeq(rest, ans);
    }   
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = new String("abc");
        SubSeq(str,".");
    }

}