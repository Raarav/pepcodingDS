/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Q306  {
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

    static int maxSum = 0;
    static Node maxNode; 
    public static void maxSumOf_node(Node node){  

        int curSum = 0;
        for(Node child : node.children){
            curSum += child.data;
            if(curSum > maxSum){
                maxNode = node;
                maxSum = curSum;
            }
        }

        for(Node child : node.children){
            maxSumOf_node(child);
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

            maxSumOf_node(root);
            System.out.println("maxSum Node = " + maxNode.data + " with a maximum sum of " + maxSum);
		}
	}
}

// input:-
// 1
// 18
// 1 3 1 2 1 4 3 6 3 5 4 7 4 8 4 9 4 10