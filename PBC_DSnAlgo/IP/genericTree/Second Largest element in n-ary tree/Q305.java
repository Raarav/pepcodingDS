/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Q305 {
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

    static int floor; 
    public static void ceil_floor(Node node,int val){
        if(node.data < val && node.data > floor){
            floor = node.data;
        }
        for(Node child : node.children){
            ceil_floor(child,val);
        }
    } 

    public static int secondLargerEle(Node node){
        floor = Integer.MIN_VALUE;
        int factor = Integer.MAX_VALUE;
        for(int i=0;i<2;i++){
            ceil_floor(node,factor);
            factor = floor;
            floor = Integer.MIN_VALUE;
        }
        return factor;
    }

    //second method 
    static int first = Integer.MIN_VALUE;
    static int second = Integer.MIN_VALUE;
    public static void sec_secondLargerEle(Node node){ 
        if(node.data > first){
            second = first;
            first = node.data;
        }  
        if(node.data < first && node.data > second){
            second = node.data;
        }
        for(Node child : node.children){
            sec_secondLargerEle(child);
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
            // ceil_floor(root,7);
            // System.out.print(floor);
            //? firts method O(n) in two way
            // System.out.println(secondLargerEle(root));

            //? second method O(n) in one way
            sec_secondLargerEle(root);
            System.out.print(second);
		}
	}
}

// input:-
// 1
// 20
// 1 2 1 3 1 4 2 5 2 6 6 11 4 7 4 8 4 9 4 10