import java.util.*;

public class fab{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int a=0,b=1;
        int n=scn.nextInt();
        int i=0;
        int c=0;
        scn.close();
        while(i<=n)
        {
            System.out.println(a + " ");
            c=a+b;
            a=b;
            b=c;            
            i++;
        }      
    
    }
    
}
