import java.util.*;

public class genericTree{
    public static class Node{
        int data;
        int level;
        ArrayList<Node> children = new ArrayList<>();

        Node()
        {

        }

        Node(int d)
        {
            this.data=d;
        }

        Node(int d, int l)
        {
            this.data=d;
            this.level=l;
        }
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
    public static int maxV(Node node){
       int maxValue=0;        
        for(Node child: node.children){
            maxValue=Math.max(maxValue,maxV(child));
        }
        maxValue=Math.max(maxValue,node.data);
        return maxValue;
    }

    //? Height of generic Tree
    //* height is depth of the depest node 
    public static int Height(Node node){
        int ht = -1;
        for(Node child: node.children)
        {
            ht=Math.max(ht,Height(child));
        }
        ht += 1;
        return ht;
    }

    //? traverse of pre and post order of generic tree
    public static void traverse(Node node){
        System.out.println("Node Pre" + node.data);
        for(Node child: node.children)
        {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traverse(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }    
        System.out.println("Node Post " + node.data);
    }

    //? level Order traversal
    public static void levelOrderTraversal(Node node){
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(node);
        while(q.size()>0)
        {
            node=q.remove();
            System.out.print(node.data +" ");
            for(Node child: node.children)
            {
                q.add(child);
            }
        }
        System.out.print(".");
    }

    // //? print levelOrder traversal LineWise
    // //*self
    // public static void levelOrderTraversalLineWise(Node node){
    //     Queue<Node> q = new ArrayDeque<Node>();
    //     Queue<Node> cq = new ArrayDeque<Node>();
    //     q.add(node);
    //     while(q.size()>0){
    //         while(q.size()>0){       
    //         Node remove = q.remove();
    //         System.out.print(remove.data + " ");
    //         for(Node child: remove.children){
    //             cq.add(child);
    //         }  
    //     } 
    //     System.out.println();
    
    //         while(cq.size()>0)
    //         {
    //             q.add(cq.remove());
    //         }
    //     }
       
    // }

    //? print levelOrder traversal LineWise
    //! sir code optimis code
    //* 1st Approch
    // public static void levelOrderTraversalLineWise(Node node){
    //     Queue<Node> q = new ArrayDeque<Node>();
    //     q.add(node);
    //     Queue<Node> cq = new ArrayDeque<Node>();
    //     while(q.size()>0)
    //     {
    //         Node remove = q.remove();
    //         System.out.print(remove.data+" ");
    //         for(Node child: remove.children)
    //         {
    //             cq.add(child);
    //         }
    //         if(q.size()==0)
    //         {
    //             q = cq;
    //             cq = new ArrayDeque<Node>();
    //             System.out.println();
    //         }
    //     }
    // }

    // //? print levelOrder traversal LineWise
    // //! sir code optimis code
    // //* 2nd Approch
    // public static void levelOrderTraversalLineWise(Node node){
    //     Queue<Node> q = new ArrayDeque<Node>();
    //     q.add(node);
    //     q.add(new Node(-1));
    //     while(q.size()>0)
    //     {
    //         node = q.remove();
    //         if(node.data==-1)
    //         {
    //             if(q.size()>0){
    //                 q.add(new Node(-1));
    //                 System.out.println();
    //             }
    //         }else{
    //             System.out.print(node.data + " ");
    //             for(Node child : node.children)
    //             {
    //                 q.add(child);
    //             }
    //         }
    //     }
    // }

    // //? print levelOrder traversal LineWise
    // //! sir code optimis code
    // //* 3rd Approch
    // public static void levelOrderTraversalLineWise(Node node){
    //     Queue<Node> q = new ArrayDeque<Node>();
    //     q.add(node);
    //     while(q.size()>0)
    //     {
    //         int csize=q.size();
    //         for(int i=0;i<csize;i++){
    //             node = q.remove();
    //             System.out.print(node.data + " ");
    //             for(Node child : node.children)
    //             {
    //                 q.add(child);                    
    //             }
    //         }
    //         System.out.println();
            
    //     }
    // }

    //? print levelOrder traversal LineWise
    //! sir code optimis code
    //* 4rth Approch
    public static void levelOrderTraversalLineWise(Node node){
        Queue<Node> q = new ArrayDeque<Node>();
        int level=1;
        q.add(new Node(node.data,node.level));
        while(q.size()>0)
        {
            node=q.remove();
            if(node.level>level){
                level=node.level;
                System.out.println();
            }
            System.out.print(node.data+" ");
            for(Node child : node.children)
            {
                q.add(new Node(child.data,level+1));
            }
        }

    }



    //?print level order linewise Zig-Zag
    public static void levelOrderTraversalLineWiseZigZag(Node node){
        Stack<Node> s = new Stack<Node>();
        s.add(node);
        Stack<Node> cs = new Stack<Node>();
        int level = 0;
        while(s.size()>0){
            Node popEle=s.pop();   
            System.out.print(popEle.data+" ");
            if(level%2==0)
            {
                for(int i=0;i<popEle.children.size();i++){
                    Node child = popEle.children.get(i);
                    cs.push(child);
                }
            }else{
                for(int i=popEle.children.size()-1;i>=0;i--)
                {
                    Node child = popEle.children.get(i);
                    cs.push(child);
                }
            }  
            if(s.size()==0)
            {
                s = cs;
                cs = new Stack<Node>();
                level++;
                System.out.println();
            }                 
        }      
    }

    //?Mirror a genericTree
    public static void mirrorGenericTree(Node node){
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(node);
        while(q.size()>0)
        {
            for(int i=node.children.size()-1;i>=0;i--){
                System.out.print(node.data+" ");                
            }
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
        // System.out.print(maxV(root));

        //? Height of generic Tree
        // System.out.print(Height(root));

        //? traverse of pre and post order of generic tree
        // traverse(root);

        //? level Order traversal
        // levelOrderTraversal(root); 

        //? print levelOrder traversal LineWise
        // levelOrderTraversalLineWise(root);

        //?print level order linewise Zig-Zag
        // levelOrderTraversalLineWiseZigZag(root);

        //?Mirror a genericTree
        mirrorGenericTree(root);
    }
}