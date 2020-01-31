import java.util.*;

public class markstudent{
    public static void main(String[] args)
    {
        int mark;
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks>90 && marks<100)
        {
            System.out.print("excellent");            
        }
        else if(marks>80 && marks<90)
        {
            System.out.print("good");            
        }
        else if(marks>70 && marks<80)
        {
            System.out.print("fair");            
        }
        else if(marks>60 && marks<70)
        {
            System.out.print("meets expectations");            
        }
        else
        {
            System.out.print("below par");
        }
    }
}