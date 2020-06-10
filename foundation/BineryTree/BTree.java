import java.util.*;

class BTree
{
    static node root = null;
    static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    //constructing tree

    public static void treeConstruct(int[] data)
    {
        ArrayList<node> cplist = new ArrayList<>();
        for(int i=0;i<data.length;i++)
        {
            if(data[i]==-1)
            {
                cplist.remove(cplist.size()-1);
            }
            else{
                node currNode = new node(data[i]);
                if(root==null)
                {
                    root = currNode;
                }
                else 
                {
                    node cp = cplist.get(cplist.size()-1);
                    if(cp.left == null)
                    {
                        cp.left = currNode;
                    }
                    else{
                        cp.right = currNode;
                    }
                }
                cplist.add(currNode);
            }
        }
    }

    ///display tree
    
    public static void display(node root) {
        if(root == null)
        {
            return;
        }
        if(root.left!=null)
        {
            System.out.print(root.left.data + " -> ");
        }
        System.out.print(root.data+ " ");

        if(root.right!=null)
        {
            System.out.print(root.right.data + " -> ");
        }
        System.out.println(root.data+ " . ");
        if(root.left!=null)
        {
            display(root.left);
        }
        if(root.right!=null)
        {
            display(root.right);
        }
    }

    ///size of treee

    public static int size(node root)
    {
        if(root == null)
        {
            return 0;
        }
        int tsize = 1;
        if(root.left!=null) tsize += size(root.left);
        if(root.right!=null) tsize += size(root.right);
        return tsize;
    }

    ///height
    
    public static int height(node root) {
        if(root == null)
        {
            return 0;
        }
        int ht = 0;

        if(root.left!=null)
        {
            ht = height(root.left);
        }
        if(root.right!=null)
        {
            ht = Math.max(ht,height(root.right));
        }
        return ht;
    }

    ///max

    // public static int max(node root) {
    //     if(root==null)
    //     {
    //         return 0;
    //     }
    //     int mx = 0;


    //     return ;
    // }

    ///preorder
    
    public static void preOrder(node root) {

        if(root == null)
        {
            return ;
        }
        
        System.out.print(root.data+", ");
        if(root.left!=null)
        {
            preOrder(root.left);
        }
        if(root.right!=null)
        {
            preOrder(root.right);
        }
    }

    ///postOrder

    public static void postOrder(node root) {

        if(root == null)
        {
            return ;
        }
        
        
        if(root.left!=null)
        {
            postOrder(root.left);
        }
        if(root.right!=null)
        {
            postOrder(root.right);
        }
        System.out.print(root.data+", ");
    }

    ///inorder

    public static void inOrder(node root) {

        if(root == null)
        {
            return ;
        }
        
        
        if(root.left!=null)
        {
            inOrder(root.left);
        }
        System.out.print(root.data+", ");
        if(root.right!=null)
        {
            inOrder(root.right);
        }
        
    }

    ///construsting tree through preorder with the help of inorder Array

    public static node preInCost(int[] pre,int[] in,int ps,int pe,int is,int ie)
    {
        if( is == ie || ps == pe)
        {
            node baseNode = new node(pre[pe]);
            return baseNode;
        }
        node croot = new node(pre[ps]);
        int i=is;
        int count = 0;
        while(pre[ps]!=in[i])
        {
            i++;
            count++;
        }
        croot.left = preInCost(pre, in, ps+1, pe, is, i-1);
        croot.right = preInCost(pre, in, ps, pe, i+1, ie);
        return croot;
    }    

    public static void main(String[] args)
    {
        // Scanner scn = new Scanner(System.in);
        int[] data = {10,20,50,80,-1,-1,40,-1,-1,50,70,-1,60};
        //constructing tree
        treeConstruct(data);
        // dispaly tree

        display(root);
        System.out.println(
        
        ///size
        // System.out.println(size(root));

        ///height

        // System.out.println(height(root));

        ///max

        // System.out.println(max(root);

        //preodrder

        // preOrder(root);
        // System.out.println();

        // //postodrder

        // postOrder(root);
        // System.out.println();

        // //inodrder

        // inOrder(root);
        // System.out.println();


        //converting preorder/inorder/postorder into tree

        int[] preArray = {10,20,30,4,5,40,1,80,50,60,2,90,70,100,3};
        int[] inArray = {4,30,5,20,1,40,80,10,2,60,90,50,100,70,3};
        int is = 0;
        int ie = 0;
        int ps = preArray.length-1;
        int pe = preArray.length-1;
        preInCost(preArray, inArray, ps, pe, is, ie);

        display(root);

    }
}
