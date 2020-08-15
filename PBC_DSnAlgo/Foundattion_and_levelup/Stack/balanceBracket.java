import java.util.*;

class balanceBracket{
    
    public static boolean bB(String str) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if((ch==')' || ch=='}' || ch==']')){
                if(ch==')' && (stk.empty()==true||stk.peek()!='(')) return false;
                else if(ch=='}' && (stk.empty()==true||stk.peek()!='{')) return false;
                else if(ch==']' && (stk.empty()==true||stk.peek()!='[')) return false;
                else stk.pop();     
            }else if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }
            
        }
        boolean flag;
        if(stk.size()==0) flag=true;
        else flag=false;
        return flag;  
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(bB(str));        
    }
}