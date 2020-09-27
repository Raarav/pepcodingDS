import java.util.*;
import java.io.*;
import java.util.LinkedList; 
import java.util.Queue; 

class bTree{
    static class stackPair{
        Node nod;
        int state;
        stackPair(Node nod,int state){
            this.nod=nod;
            this.state=state;
        }            
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static void display(Node node){
        // node self work
        if(node == null){
            return;
        }
        String st = "";
        st += node.left == null? "." : node.left.data + "";
        st += " <- " + node.data + " -> ";
        st += node.right == null? "." : node.right.data + "";
        System.out.println(st);

        display(node.left);
        display(node.right);    
    }
    // size
    public static int size(Node node){
        if(node == null) return 0;
        int lc = size(node.left);   
        int rc = size(node.right);
        int tc = lc + rc + 1;
        return tc;
    }
    // sum
    public static int sum(Node node){
        if(node == null) return 0;
        int ls = sum(node.left);   
        int rs = sum(node.right);
        int ts = ls + rs + node.data;
        return ts;
    }
    // max
    public static int max(Node node){
        if(node == null) return Integer.MIN_VALUE;
        int lm = max(node.left);   
        int rm = max(node.right);
        int tm = Math.max(Math.max(lm,rm),node.data);
        return tm;
    }
    // height
    public static int height(Node node){
        if(node == null) return -1;
        int lh = height(node.left);   
        int rh = height(node.right);
        int th = Math.max(lh,rh) + 1;
        return th;
    }

    //traverse
    public static void traverse(Node node) {
        if(node == null) return;
        System.out.println(node.data + " in preorder");
        traverse(node.left);
        System.out.println(node.data + " in inorder");
        traverse(node.right);
        System.out.println(node.data + " in postorder");    
    }
    
    //level order traversal
    public static void lot(Node node) {
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);    
        while(qu.size()>0){
            int count = qu.size();
            for(int i=0;i<count;i++){
                node = qu.remove();
                System.out.print(node.data + " ");

                if(node.left != null){
                    qu.add(node.left);
                }

                if(node.right != null){
                    qu.add(node.right);
                }
            }
            System.out.println();
        }     
    }

    //print preorder inorder postorder
    public static void pipOrders(Node node){
        pre(node);
        System.out.println();
        in(node);
        System.out.println();
        post(node);    
    }

    public static void pre(Node node) {
        if(node == null) return;

        System.out.print(node.data + " ");
        pre(node.left);
        pre(node.right);  
    }

    public static void in(Node node) {
        if(node == null) return;

        in(node.left);
        System.out.print(node.data + " ");
        in(node.right);  
    }

    public static void post(Node node) {
        if(node == null) return;

        post(node.left);
        post(node.right);  
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Integer[] arr = new Integer[n];
        for(int i=0;i<arr.length;i++){
            if(str[i].equals("n") == false){
                arr[i]=Integer.parseInt(str[i]);
            } else{
                arr[i] = null;
            }
        } 
        
        Node root = new Node(arr[0],null,null);
        stackPair p = new stackPair(root,1);
        Stack<stackPair> st = new Stack<>();
        st.push(p);
        int idx = 0;
        while(st.size()>0){
            stackPair top = st.peek();
            if(top.state == 1){
                idx++;
                if(arr[idx]!=null){
                    top.nod.left = new Node(arr[idx],null,null);
                    stackPair pushingEle = new stackPair(top.nod.left,1);
                    st.push(pushingEle);
                } else {
                    top.nod.left = null;                                        
                }   
                top.state++;                
            } else if(top.state == 2) {
                idx++;
                if(arr[idx]!=null){
                    top.nod.right = new Node(arr[idx],null,null);
                    stackPair pushingEle = new stackPair(top.nod.right,1);
                    st.push(pushingEle);
                } else {
                    top.nod.right = null;                                        
                }   
                top.state++;                                 
            } else {
                st.pop();
            }
        } 
        
        //? display(root);
        // display(root);

        // size
        // System.out.println(size(root));

        // sum
        // System.out.println(sum(root));

        // max
        // System.out.println(max(root));

        // height
        // System.out.println(height(root));
        
        // traverse
        // traverse(root);

        //level order traversal
        // lot(root); 

        //print preorder inorder postorder
        pipOrders(root);
    }
}

// 19
// 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n