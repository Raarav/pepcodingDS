import java.util.*;
import java.util.ArrayList;
public class SbsqncOfArrayThroughRecurDuringPost
{
    public static ArrayList<String> subSet(String Q)
    {
        if(Q.length()==0)
        {
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        String rest = Q.substring(1);
        ArrayList<String> recAns = subSet(rest);
        ArrayList<String> myAns = new ArrayList<>();
        for(int i=0;i<recAns.size();i++)
        {
            myAns.add(Q.charAt(0)+recAns.get(i));
        }
        for(int i=0;i<recAns.size();i++)
        {
            myAns.add(recAns.get(i));
        }
        return myAns;
        
    }
    public static void main(String[] args)
    {
        System.out.print(subSet("abc"));
    }
}