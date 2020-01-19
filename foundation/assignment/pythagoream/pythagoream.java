import java.util.*;

public class pythagoream
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int p = scn.nextInt();
        int b = scn.nextInt();
        if(h*h == p*p+b*b)
        {
            System.out.print(true);
        }
        else if(b*b == h*h+p*p)
        {
            System.out.print(true);
        }
        else if(p*p == h*h+b*b)
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }

    }
}
