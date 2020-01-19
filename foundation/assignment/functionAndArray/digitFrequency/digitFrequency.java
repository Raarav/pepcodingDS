import java.util.*;

public class digitFrequency 
{
    public static void main(String[] args)
    {
        int res = count();
        System.out.print(res);
    }
    public static int count(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int rem = 0;
        int count = 0;
        scn.close();
        while(n>0)
        {
            rem = n%10;
            n = n/10;
            if(rem==d)
            {
                count++;
            }
        }
        return count;        
    }
    
}