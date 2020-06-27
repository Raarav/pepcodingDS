import java.util.*;
public class circularQueue {
    int front;
    int size;
    int[] data;
    public circularQueue(int size){
        this.data = new int[size];
        this.front = 0;
        this.size = 0;
    }

    public void display(){
        int idx = this.front;
        int cnt = 0;
        while(cnt<this.size){
            System.out.print(data[idx] + ",");
            cnt++;
            idx = (idx + 1)%data.length;
        }
        System.out.println();
    }

    public void add(int val){
        if(size==data.length){
            System.out.print("Stack OverFlow");    
        }
        int rear = (front+size)%data.length;
        data[rear]=val;
        size++;
    }

    public int size(){
        return this.size;
    }

    public int peek(){
        if(size==0){
            System.out.print("Stack underflow");
            return -1;
        }
        int rv = front;        
        return rv;
    }

    public int remove(){
        if(size==0){
            System.out.print("Stack underflow");
            return -1;
        }
        int re = this.data[this.front%data.length];
        front = front + 1;
        return re;
    }
}