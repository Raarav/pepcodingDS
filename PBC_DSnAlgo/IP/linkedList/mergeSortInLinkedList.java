import java.util.*;
import java.io.*;
import java.lang.*;

class mergeSortInLinkedList{
    static class Node{
        int data;
        Node next;
    }

    public static Node sorting(Node a, Node b) {
        Node result = null;

        if(a == null) return b;
        if(b == null) return a;

        if(a.data<b.data){
            result = a;
            result.next = sorting(a.next,b);
        }else{
            result = b;
            result.next = sorting(a,b.next);
        }
        return result;
    }

    public static Node mergeSort(Node h) {
        if(h == null || h.next == null) return h;

        Node mid = middleNode(h); 
        Node middleNext = mid.next;
        mid.next = null;
        Node left = mergeSort(h);
        Node right = mergeSort(middleNext);

        return sorting(left,right);
    }

    public static Node middleNode(Node h) {
        
        Node slow = h; 
        Node fast = h;
       
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            if(fast!=null) slow=slow.next;
        }        
        
        return slow;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inp = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(inp[i]);
        }

        Node head = new Node();
        head.data = arr[0];
        head.next = null;
        int i = 1;
        Node temp = head;         
        while(i++<n){
            Node node = new Node();
            node.data=arr[i-1];
            node.next=null;
            temp.next = node;
            temp=temp.next;
        }
        Node ans = mergeSort(head);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}