import java.util.*;

public class primeFactorisation
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();         
        int i=2;
        while(n!=1)
        {
            while(n%i==0)
            {
                n=n/i;
                System.out.print(i + " ");
            }
            i++;
        }                    
    }
    
    /*public static void main(String[] args)
    {
        
        int[] arr = input(); 
        System.out.println(arr);                     
    }
    static int[] input()
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }        
        return arr;
    }*/
}                  