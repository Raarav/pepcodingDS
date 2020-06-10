import java.util.*;
public class nStrairCase
{
    public static void nstair(int n,String path)
    {    
        if(n==0)
        {
            System.out.println(path);
            return;          
        }
        if(n>=0){
        nstair(n-1,path + "1");}
        if(n>=0){
        nstair(n-2,path + "2");}
        if(n>=0){
        nstair(n-3,path + "3");}
    }
    public static void main(String[] args)
    {
        nstair(4,"");
    }
}