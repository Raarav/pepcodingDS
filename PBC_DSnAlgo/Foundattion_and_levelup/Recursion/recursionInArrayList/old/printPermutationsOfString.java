import java.util.Scanner;

// import javafx.scene.control.ResizeFeaturesBase;

import java.util.*;


class printPermutationsOfString{
    //? Through Recursion
    public static void printPermuationsOfStringFunc(String st,String ans){
        if(st.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            String res = st.substring(0,i) + st.substring(i+1);
            printPermuationsOfStringFunc(res,ans+ch);
        }
    }

    //?
    public static void throughSubString(String st){
        for(int i=0;i<st.string;i++){
            
        }
    }

    //?
    public static void  throughBacktracking(String st){

    } 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();


        // printPermuationsOfStringFunc(st,"");

        throughSubString(st);
        // throughBacktracking(st);

    }
}