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
    
    // lca
    public static int lca(Node root, int lo, int hi){
        Stack<Integer> lo_path = new Stack<>();
        boolean fl1 = nodeToPath(root,lo,lo_path);
        Stack<Integer> hi_path = new Stack<>();
        boolean fl2 = nodeToPath(root,hi,hi_path);

        ArrayList<Integer> ans = new ArrayList<Integer>();
        int lo_size=lo_path.size();
        for(int i=0;i<lo_size;i++){
            ans.add(lo_path.pop());
        }
        int i=0;
        int size = ans.size();
        while(i<size){
            int vl1 = ans.get(i);
            int vl2;
            if(hi_path.size()>0){
                vl2 = hi_path.pop();
            }else{
                i--;
                break;
            }
            if(vl1 != vl2){
                i--;
                break;                
            }
            i++;
        }
        return ans.get(i);
    }

    public static boolean nodeToPath(Node node,int lo,Stack<Integer> lo_path){
        if(node.data == lo) {
            lo_path.push(node.data);
            return true;
        }

        for(Node child : node.children){
            boolean ans = nodeToPath(child,lo,lo_path);
            if(ans){
                lo_path.push(node.data);
                return true;
            }
        }

        return false;
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
        // System.out.print(height(root));

        //? Lowest Common Ancestor (generic Tree)
        int lo = Integer.parseInt(br.readLine());
        int hi = Integer.parseInt(br.readLine());
        System.out.print(lca(root,lo,hi));
    }
}

// 12
// 10 20 -1 30 50 -1 60 -1 -1 40 -1 -1