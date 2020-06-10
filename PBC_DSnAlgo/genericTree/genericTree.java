import java.util.*;

public class genericTree{
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    //* display of tree
    public static void display(Node node){                
        String str = node.data+"->";
        for(Node child: node.children){
            str += node.data + ", ";
        }
        str+=".";
        System.out.println(str);
        for(Node child : node.children){
            display(child);
        }
    }
    //* size of tree
    public static int size(Node node){
        int sz = 0;
        for(Node child: node.children)
        {
            sz = sz + size(child);
        }   
        sz = sz + 1; 
        return sz;    
    }

    //? maximum node in a tree
    public static int max(Node node){
        int idx = 0;
        for(Node child: node.children){
            idx = max(node);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else{
                Node t=new Node();
                t.data = arr[i];
                if(st.size()>0)
                {
                    st.peek().children.add(t);
                }
                else{
                    root = t;
                }
                st.push(t);
            }
        }
        //? display of tree
        // display(root);

        //? size of tree
        // System.out.print(size(root));

        //? maximum node in a tree
        System.out.print(max(root));
    }
}