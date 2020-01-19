import java.util.*;

public class CountDigit
{
    public static int count = 0;
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        
        while(n>=1)
        {             
            n=n/10;
            count += 1;                        
        }
        System.out.println(count);
    }
}