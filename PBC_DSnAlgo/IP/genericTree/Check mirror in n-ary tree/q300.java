/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
    
    public static boolean checkMirror(Node node,Node a_node){
        if(node.children.size()!=a_node.children.size()){
            return false;
        }
        
        for(int i=0;i<node.children.size();i++){
            Node ch1 = node.children.get(i);
            Node ch2 = a_node.children.get(a_node.children.size() - (i+1));
            if(ch1.data != ch2.data) {
                return false;
            }
            if(checkMirror(ch1,ch2) == false){
                return false;
            }
        }
         
        return true;
    }
    
    public static Node construct(Node root,int[] arr){
        HashMap<Integer,Node> hm = new HashMap<>();
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
        //display(root);
        return root;
    }
    
    public static void arrInput(int[] arr,String[] str){
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
    }
    
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    String[] str = br.readLine().split(" ");
		    int node = Integer.parseInt(str[0]);
		    int edge = Integer.parseInt(str[1]);
		    
		    str = br.readLine().split(" ");
		    int[] arr = new int[2*edge];
		    arrInput(arr,str);
		    
		    String[] a_str = br.readLine().split(" ");
		    int[] a_arr = new int[2*edge];
		    arrInput(a_arr,a_str);
		    
		    Node root = new Node();
		    root = construct(root,arr);

		    Node a_root = new Node();
		    a_root = construct(a_root,a_arr);
		    
		    boolean ans = checkMirror(root,a_root);
		    
		    if(ans) {
		        System.out.println("1");
		    } else {
		        System.out.println("0");
		    }
		}
	}
}