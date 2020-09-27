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
    //max
    public static int max(Node node){
        int maxValue = Integer.MIN_VALUE;
        for(Node child: node.children){
            int cs = max(child);
            maxValue = Math.max(cs,maxValue);
        }
        maxValue=Math.max(node.data,maxValue);
        return maxValue;
    }
    // height
    public static int height(Node node) {
        int ht = -1;
        for(Node child: node.children){
            int current_ht = height(child);
            ht = Math.max(current_ht,ht);
        }
        ht += 1;
        return ht;
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
        // System.out.print(size(root));     
        //?max
        // System.out.print(max(root));
        //?height
        System.out.print(height(root));
    }
}

// 12
// 10 20 -1 30 50 -1 60 -1 -1 40 -1 -1