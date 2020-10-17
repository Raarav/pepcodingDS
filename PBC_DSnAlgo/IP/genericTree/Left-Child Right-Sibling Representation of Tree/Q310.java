/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Q310 {
    static class Node{
        char data;
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
    
    public static Node construct(Node root,char[] arr){
        HashMap<Character,Node> hm = new HashMap<>();
        root.data = arr[0];
        hm.put(arr[0],root);
        for(int i=1;i<arr.length;i++){
            
            if(hm.containsKey(arr[i])==false){
                Node temp = new Node();
                temp.data = arr[i];
                hm.put(arr[i],temp);
                hm.get(arr[i-1]).children.add(temp);
            } 
        }
        return root;
	}
	
	public static void 
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    String[] str = br.readLine().split(" ");
	    char[] arr = new char[n];
	    for(int i=0;i<n;i++){
			char c = str[i].charAt(0);
			arr[i] = c;
		}
		
		Node root = new Node();
		root = construct(root,arr);
		// display(root);	
		
		
	}
}

// input:-
// 32
// A B A C A D A E A F A G B H B I B J H N H O E K E L K P L Q G M