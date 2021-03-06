/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Q307  {
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
        return root;
    }
    
    static int count = 0;
    static int nodeEe = 0;
    public static void maxChildren_thanParents(Node node){
        
        int cur_count = 0;
        cur_count = node.children.size();
        if(cur_count>count){
            nodeEe = node.data;
            count = cur_count;
        }

        for(Node child : node.children){
            maxChildren_thanParents(child);
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

            Node root = new Node();
            root = construct(root,arr);
            // display(root);

           maxChildren_thanParents(root);
           System.out.print("Node of " + nodeEe + " have childrean " + count);
		}
	}
}

// input:-
// 1
// 16
// 1 2 1 3 2 4 2 5 2 6 5 7 5 8 3 9 