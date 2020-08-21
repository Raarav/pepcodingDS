import java.io.*;
import java.util.*;

public class Main{
    
    public static int infixEvalu(String exp){
        Stack<Integer> stInt  = new Stack<>();
        Stack<Character> stChar  = new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(Character.isDigit(exp[i])){
                stInt.push(exp(i));
            }else if(ch == ')'){
                while(ch != '('){
                    int op = stChar.pop();
                    int b = stInt.pop();
                    int a = stInt.pop();
                    int c = a + op + b;
                    stInt.push(c);
                }
            }
            else{
                while(precedence(stChar.peek())>=precedence(exp(i)){
                    int op = stChar.pop();
                    int b = stInt.pop();
                    int a = stInt.pop();
                    int c =  a + op + b;
                    stInt.push(c);
                }
                stChar.push(exp(i));
            }
            
        }
    }
    
    public static int precedence(char ch){
        if(ch == '+'){
            return 1;
        }else if(ch == '-'){
            return 1;
        }else if(ch == '*'){
            return 2;
        }else if(ch == '-'){
            return 2;
        }
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    System.out.print(infixEvalu(exp));
 }
}