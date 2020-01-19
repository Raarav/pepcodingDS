import java.util.*;

public class digitInLine
{
    public static int res=0,tens=1;
    public static void main(String[] args)
    { 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1=n;
        scn.close();        
        
        while(n>=9)
        {             
            n=n/10; 
            tens = tens*10;                     
        }

        while(n1>0)
        {
            int n2=n1;
            n1=n1/tens;
            int rem=n2%tens;
            System.out.println(n1);
            n1=rem;
            tens=tens/10;            
        }  
        
    }

}