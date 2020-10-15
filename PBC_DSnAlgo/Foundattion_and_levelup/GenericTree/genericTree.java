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

    // construct generic Tre
    public static Node construct(int[] arr){
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
        return root;
    }

    // sum
    public static int sum(Node node){
        int sm = 0;
        for(Node child : node.children){
            sm += child.data + sum(child);
        }   
        return node.children.size() == 0 ? sm : sm + node.data;
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

    // Distance Between two nodes
    public static int dis_bt_2node(Node root,int lo,int hi){
        Stack<Integer> lo_path = new Stack<>();
        boolean fl1 = nodeToPath(root,lo,lo_path);
        Stack<Integer> hi_path = new Stack<>();
        boolean fl2 = nodeToPath(root,hi,hi_path);

        // int i=0;
        // int size = lo_path.size();
        while(lo_path.size()>0){
            int vl1 = lo_path.peek();
            int vl2;
            if(hi_path.size()>0){
                vl2 = hi_path.peek();
            }else{
                break;
            }
            if(vl1 != vl2){
                break;                
            }
            lo_path.pop();
            hi_path.pop();
        }

        return lo_path.size()+hi_path.size();
    }

    // Are Trees Similar In Shape
    public static boolean similar_tree(int[] arr,int[] a_arr,Node root,Node another_root){
        boolean ans = false;
        if(arr.length != a_arr.length){
            ans = false;
        } else {
            ans = st_check(root,another_root);
        }
        return ans;
    }

    public static boolean st_check(Node node,Node anode){
        if(node.children.size()!=anode.children.size()) return false;

        for(int i=0;i<node.children.size();i++) {
            Node c1 = node.children.get(i);
            Node c2 = node.children.get(i);
            if(st_check(c1,c2)==false){
                return false;
            }
        }

        return true;
    }

    // Are Trees Mirror In Shape
    public static boolean mirror_image(int[] arr,int[] a_arr,Node root,Node another_root){
        boolean ans = false;
        if(arr.length != a_arr.length){
            ans = false;
        } else {
            ans = mi_check(root,another_root);
        }
        return ans;
    }

    public static boolean mi_check(Node node,Node anode){
        if(node.children.size() != anode.children.size()) return false;

        for(int i=0;i<node.children.size();i++){
            Node c1 = node.children.get(i);
            Node c2 = anode.children.get(anode.children.size()-(i+1));
            if(mi_check(c1,c2) == false){
                return false;
            }
        }

        return true;
    } 

    // Is Generic Tree Symmetric
    public static boolean genericTree_smtric(Node node,Node anode){
        if(node.children.size() != anode.children.size()){
            return false;
        }

        int size = node.children.size()%2 == 0?node.children.size()/2:node.children.size()/2+1;

        for(int i=0;i<size;i++){
            Node c1 = node.children.get(i);
            Node c2 = anode.children.get(anode.children.size()-(i+1));
            if(genericTree_smtric(c1,c2) == false){
                return false;
            } 
        }

        return true;
    }

    // Predecessor And Successor Of An Element
    static Node pred = null;
    static Node succ = null;
    static int psState;
    public static void preNsucc_ele(Node node,int val){
        if(psState == 0){
            if(node.data == val){
                psState = 1;
            } else {
                pred = node;
            }
        } else if(psState == 1){
            succ = node;
            psState = 2;
        }
        for(Node child: node.children){
            preNsucc_ele(child,val);
        }
    }

    // Ceil And Floor In Generic Tree
    static int ceil;
    static int floor;
    public static void ceil_floor(Node node,int val){
        if(node.data < val && node.data > floor){
                floor = node.data;
        } else if (node.data > val && node.data < ceil){
                ceil = node.data;
        }
        for(Node child: node.children){
            ceil_floor(child,val);
        }
    }

    // Kth Largest Element In Tree
    public static int kLarge_ele(Node node, int k){
        floor = Integer.MIN_VALUE;
        int factor = Integer.MAX_VALUE;        
        for(int i=0;i<k;i++){
            ceil_floor(node,factor);
            factor = floor;
            floor = Integer.MIN_VALUE;
        }
        return factor;
    }

    // Node With Maximum Subtree Sum
    static int msn = 0;
    static int ms = Integer.MIN_VALUE;
    public static int nodeMaximum_sum(Node node){

        int sm = 0;
        for(Node child : node.children){
            sm += nodeMaximum_sum(child); 
        } 
        
        sm += node.data;

        if(sm>ms){
            msn = node.data;
            ms = sm;
        }
        return sm;       
    }

    // Diameter Of Generic Tree 
    static int dia = 0;
    public static int dia_genTree(Node node){
        int dch = -1;
        int sdch = -1;
        for(Node child : node.children){
            int ch = dia_genTree(child);
            if()    
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inp = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<inp.length;i++){
            arr[i]=Integer.parseInt(inp[i]);
        }

        Node root = construct(arr);
        
        //?display
        // display(root);
        //?size
        // System.out.print(size(root));     
        //?max
        // System.out.print(max(root));
        //?height
        // System.out.print(height(root));
        //? sum
        // System.out.print(sum(root));

        //? Lowest Common Ancestor (generic Tree)
        // int lo = Integer.parseInt(br.readLine());
        // int hi = Integer.parseInt(br.readLine());
        // System.out.print(lca(root,lo,hi));

        //? Distance Between Two Nodes In A Generic Tree
        // int lo = Integer.parseInt(br.readLine());
        // int hi = Integer.parseInt(br.readLine());
        // System.out.print(dis_bt_2node(root,lo,hi));

        //? Are Trees Similar In Shape
        // int another_n = Integer.parseInt(br.readLine());
        // int[] a_arr = new int[another_n];
        // String[] a_str = br.readLine().split(" ");
        // for(int i=0;i<a_arr.length;i++) {
        //     a_arr[i]=Integer.parseInt(a_str[i]);
        // }

        // Node another_root = construct(a_arr);   
        
        // System.out.print(similar_tree(arr,a_arr,root,another_root));

        //? Are Trees Mirror In Shape
        // int another_n = Integer.parseInt(br.readLine());
        // int[] a_arr = new int[another_n];
        // String[] a_str = br.readLine().split(" ");
        // for(int i=0;i<a_arr.length;i++) {
        //     a_arr[i]=Integer.parseInt(a_str[i]);
        // }

        // Node another_root = construct(a_arr);

        // System.out.print(mirror_image(arr,a_arr,root,another_root));

        //? Is Generic Tree Symmetric
        // System.out.print(genericTree_smtric(root,root));

        //? Predecessor And Successor Of An Element
        // int val = Integer.parseInt(br.readLine());
        // psState = 0;
        // preNsucc_ele(root,val);
        // if(pred == null){
        //     System.out.println(pred);
        // } else {
        //     System.out.println(pred.data);
        // }
        // if(succ == null){
        //     System.out.println(succ);
        // } else {
        //     System.out.println(succ.data);
        // }

        //? Ceil And Floor In Generic Tree
        // int val = Integer.parseInt(br.readLine());
        // ceil = Integer.MAX_VALUE;
        // floor = Integer.MIN_VALUE; 
        // ceil_floor(root,val);
        // System.out.println("CEIL = " + ceil);
        // System.out.println("FLOOR = " + floor);
        
        //? Kth Largest Element In Tree
        // int val = Integer.parseInt(br.readLine());
        // System.out.print(kLarge_ele(root,val));

        //? Node With Maximum Subtree Sum
        // nodeMaximum_sum(root);
        // System.out.print(msn + "@" + ms);

        //? Diameter Of Generic Tree
        System.out.print(dia_genTree(root));
    }
}

// 12
// 10 20 -1 30 50 -1 60 -1 -1 40 -1 -1