/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Q301 {
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

    public static String serializer(Node node){
        String str = node.data+"";
        for(Node child : node.children){
            str += serializer(child);
        }
        return str + ")";
    }

    public static Node deserializer(String str){
        Stack<Node> st = new Stack<>();
        Node root = new Node();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                st.pop();                
            } else {
                Node temp = new Node();
                temp.data = ch;
                if(st.size()>0){
                    st.peek().children.add(temp);                   
                }else{
                    root = temp;                    
                }
                st.push(temp);
            }
        }   
        return root;     
    }

    public static void serializerDeserializer(Node root){
        String str = serializer(root);
        System.out.println(str);
        Node after_ser_root = deserializer(str);
        display(after_ser_root);    
    }
    
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            // char[] charsFromString = str.toCharArray();
            char[] arr = new char[n];
            for(int i=0;i<arr.length;i++){
                char c = str[i].charAt(0);
                arr[i] = c;
            }

            Node root = new Node();
            root = construct(root,arr);

            serializerDeserializer(root);
		}
	}
}

// input:-
// 1
// 20
// A B A C A D B E B F F K D G D H D I D J