/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Q308  {
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    
    public static void display(Node node) {
        System.out.print(node.data+"->");
        
        for(int i=0;i<node.children.size();i++) {
            Node child=node.children.get(i);
            System.out.print(child.data+" ,");
        }
        System.out.println(".");
        
        for(int i=0;i<node.children.size();i++) {
            Node child=node.children.get(i);
            display(child);
        }
    }
    
    static int idx;    
    public static void preorder_contruct(Node node,int[] arr,int k,int idx){
        int stable_idx = idx;
        while(idx<arr.length && idx<stable_idx+k){
            Node temp = new Node();
            temp.data = arr[idx];
            node.children.add(temp);
            idx++;
        }    

        for(Node child : node.children){
            preorder_contruct(child,arr,k,idx);
        }
    }

    
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            // char[] charsFromString = str.toCharArray();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Node root = new Node();
            root.data = arr[0];
            preorder_contruct(root,arr,k,1);
            display(root);
		}
	}
}

// input:-
// 1
// 10
// 1 2 5 6 7 3 8 9 10 4