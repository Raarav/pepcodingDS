import java.util.*;

import javafx.scene.Node;

class bineryTree{
    //constructor
    public static class Node{
        int data;
        Node right;
        Node left;    
        Node(int d,int l,int r){
            this.data=d;
            this.left=l;
            this.right=r;
        }   
    }
    public static class Pair{
        Node node;
        int level;
        Pair(Node d,int l){
            this.data=d;
            this.level=l;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[i],null,null);
        Pair rtp = new Pair(arr[0],1);
        st.push(rtp);
        int idx=0;       
        while(st.size()>0){
            Pair top = st.peek();
            if(top.level==1){
                idx++;
                if(arr[idx]!=null){
                    Node ln = new Node(arr[i],null,null);
                    Pair pr = new Pair(arr[i],level+1);
                    st.push(pr);
                }
            }else if(top.level==2){
                idx++;
                root.right = new Node(arr[idx],null,null);
                Pair pr = new Pair(arr[i],level+1);
                st.push(pr);
            }else if(top.level==3&&arr[idx]==null){
                st.pop();                
            }
            else if(arr[idx]==null){
                idx++;
                top.level++;
            }
        }
    }
}