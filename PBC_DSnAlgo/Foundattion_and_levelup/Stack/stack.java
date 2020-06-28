import java.util.*;
public class stack {
    int top;
    int[] data;
    stack(int size){
        this.top = 0;
        this.data = new int[size];
    }

    public void push(int val){
        if(top==data.length){
            System.out.print("Stack overflow");
            System.out.println();
        } 
        this.data[top]=val;
        top++;    
    }

    public int pop(){
        if(top==0){
            System.out.print("Stack underflow");
            System.out.println();
            return -1;
        }
        int val = this.data[top];
        top--;
        return val;
    }
    
    public int peek(){
        if(top==0){
            System.out.print("Stack underflow");
            System.out.println();
            return -1;
        }
        return this.data[top];
    }

    public int size(){
        return this.top;
    }

    public void display(){
        int idx=top-1;
        while(idx>-1){
            System.out.print(data[idx]+" ");
            idx--;
        }
    }
}