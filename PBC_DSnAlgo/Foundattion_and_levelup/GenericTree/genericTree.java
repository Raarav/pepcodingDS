import java.util.*;
import java.io.*;

class genericTree{
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<Node>();
    }
    //display
    public static void display(Node node) {
        String str = node.data + " -> ";
        for(Node child: node.children){
            str +=  child.data + ".";
        }    
        str += ",";
        System.out.println(str);
        
        for(Node child: node.children){
            display(child);
        }
    }
    //size
    public static int size(Node node) {
        int s = 0;
        for(Node child: node.children){
            int cs = size(child);
            s = s + cs;
        }  
        s = s + 1;
        return s;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inp = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<inp.length;i++){
            arr[i]=Integer.parseInt(inp[i]);
        }

        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{ 
                Node temp = new Node();
                temp.data = arr[i];
                if(st.size()>0){
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            }
        }
        
        //?display
        // display(root);
        //?size
        System.out.print(size(root));        
    }
}