import java.util.*;

class gNode {
    int data;
    ArrayList<gNode> children = new ArrayList<gNode>();

    //print height of tree
    public int height(gNode node){
        int height=-1;
        for(gNode child: node.children)
        {
            int hm = height(child);
            height = Math.max(height,hm);            
        } 
        height+=1;
        return height;
    }

    //print max value node 
    public int max(gNode node){
        int m = Integer.MIN_VALUE;
        for(gNode child: node.children){
            int cm = max(child);
            m = Math.max(cm,m);   
        }
        m = Math.max(m,node.data);
        return m;
    }
    // size of generic Tree
    public int size(gNode node) {
        int s = 0;
        for (gNode child : node.children) {
            s += size(child);
        }
        s += 1;
        return s;
    }

    /// display Generic Tree
    public void display(gNode node) {
        String str = node.data + "->";
        for (gNode child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
        for (gNode child : node.children) {
            display(child);
        }
    }
}

class gTree {
    public static void main(String[] args) {
        int[] arr = { 10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1 };
        Stack<gNode> st = new Stack<>();
        gNode root = new gNode();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                gNode t = new gNode();
                t.data = arr[i];
                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        root.display(root);
        System.out.println(root.size(root));
        System.out.println(root.max(root));
        System.out.print(root.height(root));
    }
}