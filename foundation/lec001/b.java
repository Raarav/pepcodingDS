import java.util.*;
public class b
{
    public static void main(String[] args)
    {
        //System.out.print("Hello world");
        /*int a=10,b=20,res;
        res=a+b;
        System.out.print(res);*/
        
        Scanner scn = new Scanner(System.in); 

        System.out.print("enter 1st no.");
        int a = scn.nextInt();
        System.out.print("enter 2nd no.");
        int b = scn.nextInt();
        //System.out.print("enter 3nd no.");
        //int c = scn.nextInt();

        //calculator


        /*int res=a+b;
        int res1=a*b;
        int res2=a-b;
        int res3=a/b;
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);*/

        //calculator in single line
        
        char res = scn.next().charAt(0);

        System.out.println(a + res + b);

        //find smallest no. in three no.s

       /* if(a<b && a<c)
        {
            System.out.println("a is smaller:" +a);
        }
        else if(b<a && b<c)
        {
            System.out.println("b is smaller:"+ b);
        }
        else
        {
            System.out.println("c is smaller:" +c);
        }*/

        //grading system

         /*if(90<mark)
        {
            System.out.println("a is smaller:" +a);
        }
        else if(b<a && b<c)
        {
            System.out.println("b is smaller:"+ b);
        }
        else
        {
            System.out.println("c is smaller:" +c);
        }*/





    } 
}