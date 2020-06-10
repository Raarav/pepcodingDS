import java.util.*;
import java.util.ArrayList;
public class ratpath
{
    public static int traverse(int cr,int cc,int er,int ec)
    {   
         for(int i=1;cc+i<=ec;i++)
         {
             ArrayList<String> recans = traverse(cr, cc+i, er, ec);
             for(String str: recans)
             {
                 myans.add("h"+i+str);
             }
         }
         for(int i=1;cc+i<=ec;i++)
         {
             ArrayList<String> recans = traverse(cr, cc+i, er, ec);
             for(String str: recans)
             {
                 myans.add("v"+i+str);
             }
         }
         for(int i=1;cc+i<=ec && cr+i<=er ;i++)
         {
             ArrayList<String> recans = traverse(cr, cc+i, er, ec);
             for(String str: recans)
             {
                 myans.add("d"+i+str);
             }
         }
    }
    public static void main(String[] args)
    {
        System.out.print(traverse(0,0,2,2));
    }
}