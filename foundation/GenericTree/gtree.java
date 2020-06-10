
///generic tree


import java.util.*;

import javax.sound.midi.SysexMessage;

import sun.awt.AWTAccessor.SystemTrayAccessor;


class gtree
{
    static node root = null;
    static class node{
        int data;
        ArrayList<node> child;
        node(int d)
        {
            this.data = d;
            this.child = new ArrayList<>();
        }
    }

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
                    cp.child.add(currNode);
                }
                cplist.add(currNode);
            }
        }
    }

    ///display tree

    public static void display(node root)
    {
        if(root == null)
        {
            return;
        }        
        System.out.print(root.data+"->");
        for(int i=0;i<root.child.size();i++){
            System.out.print(root.child.get(i).data+", ");
        }
        System.out.println(".");
        for(int i=0;i<root.child.size();i++)
        {
            display(root.child.get(i));
        }
    }

    ///size of gtree

    public static int size(node root)
    {
        if(root == null)
        {
            return 0;
        }
        int mysize = 1;
        for(int i=0;i<root.child.size();i++)
        {
            mysize += size(root.child.get(i));
        }
        return mysize;
    }

    ////max of gtree

    public static int max(node root)
    {
        if(root == null)
        {
            return -1;
        }
        int max = root.data;
        for(int i=0;i<root.child.size();i++)
        {
            int a=max(root.child.get(i));
            if(max<a)
            {
                max=a;
            }
        }
        return max;
    }


    ////find exist data in tree

    public static boolean existData(node root,int x)
    {
        if(root == null)
        {
            return false;
        }
        // boolean flag = false;
        if(x==root.data)
        {
            return true;
        }
        for(int i=0;i<root.child.size();i++)
        {
            boolean flag=existData(root.child.get(i),x);

            if(flag==true)
            {
                return true;
            }
        }
        return false;
    }


    /////11/april/2020

    ////find path from node to root

    public static ArrayList<Integer> nodePath(node root,int x)
    {
        if(root==null)
        {
            return null;
        }

        if(root.data == x)
        {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(root.data);
            return res;
        }

        for(int i=0;i<root.child.size();i++)
        {
            ArrayList<Integer> recAns = nodePath(root.child.get(i),x);
            if(recAns != null)
            {
                recAns.add(root.data);
                return recAns;
            } 
        }
        return null;
    }

    ////find common ansister

    public static int commonAnsister(node root,int a,int b)
    {
        ArrayList<Integer> fora = nodePath(root,a);
        ArrayList<Integer> forb = nodePath(root,b);
        
        int i = fora.size()-1;
        int j =forb.size()-1; 
        while(i>=0 && j>=0)
        {
            if(fora.get(i)!=forb.get(j))
            {
                break;
            }
            i--;
            j--;
        }

        return fora.get(i+1);
    }

    ///traversing on tree

    public static void pLWEle(node root)
    {
        Queue<node> qu = new LinkedList<>();
        qu.add(root);
        while(qu.size()>0)
        {
            node currNode = qu.remove();
            System.out.print(currNode.data + " ");
            for(int i=0;i<currNode.child.size();i++)
            {
                qu.add(currNode.child.get(i));
            }
        }        
    }

    ///traversing on tree and displayzigzack

    public static void displayzigzack(node root)
    {
        Queue<node> qu = new LinkedList<>();
        qu.add(root);
        // int s = qu.size();
        while(qu.size()>0)
        {
            int s=qu.size();            
            if(s%2!=0){
                node currNode = qu.remove();
                System.out.print(currNode.data + " ");
            
            for(int i=0;i<currNode.child.size();i++)
            {
                qu.add(currNode.child.get(i));
            }
            }
            else{
                node currNode = qu.remove();
                System.out.print(currNode.data + " ");
                for(int i=currNode.child.size()-1;i>=0;i--)
            {
                qu.add(currNode.child.get(i));  
            }
            }
        }        
    }

    public static int htOfTree(node root)
    {
        if(root == null)
        {
            return 0;
        }

        int ht=0;

        for(int i = 0; i<root.child.size();i++)
        {
            ht = Math.max(ht, htOfTree(root.child.get(i)));
        }


        return ht+1;
    }


    public static void main(String[] args)
    {
        // Scanner scn = new Scanner(System.in);
        int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        treeConstruct(data);
        // display(root);       
        // System.out.print("size "+ size(root));
        // System.out.print("size "+  max(root));
        // System.out.println(existData(root,90));
        
        /////11/april/2020
        ////find path from node to root


        // ArrayList<Integer> ans=nodePath(root,120); 
        // System.out.print(ans);

        ////find common ansister

        // System.out.print(commonAnsister(root, 70, 120));

        /////Queue in LinkedList

        // Queue<Integer> x = new LinkedList<>();

        // x.add(10);
        // x.add(20);
        // x.add(30);
        
        // while(x.size()>0)
        // {
        //     System.out.println(x.remove());
        // }


        ///print the o/p levelwise
        ///leveoder traversing on tree  ////breath first search


        // pLWEle(root);

        ///leveoder traversing on tree zigzack  ////breath first search 


        // displayzigzack(root);


        ////height of tree

        System.out.print(htOfTree(root));

        
        

    }
}