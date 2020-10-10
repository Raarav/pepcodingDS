    import java.util.*;
    import java.io.*;

    class bstAndavl{
        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data,Node left,Node right){
                this.data=data;
                this.left=left;
                this.right=right;    
            }
        }
        static class Pair{
            Node node;
            int state;
            Pair(Node node, int state){
                this.node = node;
                this.state = state;
            }
        }
        public static int size(Node node){
            if(node == null){
                return 0;
            }
            int count = 1 + size(node.left) + size(node.right); 
            return count;   
        }
        public static int sum(Node node){
            if(node == null){
                return 0;
            }
            int sum = node.data + sum(node.left) + sum(node.right);
            return sum;
        }
        public static int max(Node node){
            if(node.right != null){
                return max(node.right);
            } else {
                return node.data;
            }
            // if(node == null){
            //     return Integer.MIN_VALUE;
            // }
            // int max = Math.max(Math.max(node.data,max(node.left)),max(node.right));
            // return max;
        }
        public static int min(Node node){
            
            if(node.left != null){
                return min(node.left);
            } else {
                return node.data;
            }

            // if(node == null){
            //     return Integer.MAX_VALUE;
            // }
            // int min = Math.min(Math.min(node.data,min(node.left)),min(node.right));
            // return min;        
        }
        public static boolean find(Node node,int val){

            if(node == null){
                return false;
            }    

            if( val > node.data){
                return find(node.right,val);
            } else if(val < node.data){
                return find(node.left,val);
            } else {
                return true;
            }

            // if(node == null){
            //     return false;
            // }
            // if(node.data == val){
            //     return true;
            // }

            // boolean left = find(node.left,val);
            // boolean right = find(node.right,val);
            
            // return left || right;        
        }
        public static void display(Node node){
            if(node == null){
                return;
            }

            String str = "";
            str += node.left == null ? "." : node.left.data + "";
            str += " <- " + node.data + " -> ";
            str += node.right == null ? "." : node.right.data + ""; 
            System.out.println(str);

            display(node.left);
            display(node.right);    
        }
        public static Node construct(Integer[] arr){

            // if(lo>hi){
            //     return null;
            // }

            // int mid = (lo + hi)/2;

            // int data = arr[mid];

            // Node lc = construct(arr,lo,mid-1);
            // Node rc = construct(arr,mid-1,hi);
            
            // Node node = new Node(data,lc,rc);
            // return node;

            Node root = new Node(arr[0],null,null);
            Pair rtp = new Pair(root,1);

            Stack<Pair> st = new Stack<>();
            st.push(rtp);

            int idx = 0;
            while(st.size()>0){
                Pair top = st.peek();
                if(top.state == 1){
                    idx++;
                    if(arr[idx] != null){
                        top.node.left = new Node(arr[idx],null,null);
                        Pair lp = new Pair(top.node.left,1);
                        st.push(lp);
                    } else {
                        top.node.left = null;
                    }
                    top.state++;
                } else if(top.state == 2) {
                    idx++;
                    if(arr[idx] != null){
                        top.node.right =  new Node(arr[idx],null,null);
                        Pair rp = new Pair(top.node.right,1);
                        st.push(rp);
                    } else {
                        top.node.right = null;
                    }
                    top.state++;
                } else {
                    st.pop();
                }            
            }
            
            return root;
        }

        public static Node addNode(Node node, int val){
            if(node == null){
                return new Node(val,null,null);
            }
            if(val > node.data){
                node.right = addNode(node.right, val);
            }
            else if(val < node.data){
                node.left = addNode(node.left, val);
            } 
            return node;         
        }

        // Remove Node From Bst
        public static Node remove_node(Node node,int val){
            if(node == null){
                return null;
            }

            if(val > node.data) {
                node.right = remove_node(node.right,val);
            } else if(val < node.data){
                node.left = remove_node(node.left,val);
            } else {
                if(node.left == null && node.right == null){
                    return null;
                }else if(node.left == null && node.right != null){
                    return node.right;
                } else if(node.left != null && node.right == null){
                    return node.left;
                } else {
                    int maxValue = max(node.left);
                    node.data = maxValue;
                    node.left = remove_node(node.left,maxValue);
                    return node;
                }
            }
            
            return node;
        }

        // replace sum Of Larger 
        static int sum = 0;
        public static void replace_sumOfL(Node node){

            if(node == null){
                return;
            }
            
            replace_sumOfL(node.right);

            int od = node.data;
            node.data = sum;
            sum += od;

            replace_sumOfL(node.left);
        }

        // Lca Of Bst
        public static int lca(Node root,int lo,int hi){
            ArrayList<Integer> lo_arrList = new ArrayList<>();
            lca_lo(root,lo,lo_arrList);
            ArrayList<Integer> hi_arrList = new ArrayList<>();
            lca_hi(root,hi,hi_arrList);

            int i=0;
            while(i<lo_arrList.size()){
                if(lo_arrList.get(i)==hi_arrList.get(i)){
                    i++;
                } else{
                    break;                    
                }
            }
            return lo_arrList.get(i-1);
        }

        public static void lca_lo(Node node,int lo,ArrayList<Integer> lo_arrList){
            if(node == null){
                return;
            }
            if(node.data == lo){
                lo_arrList.add(node.data);
                return;
            }
            if(lo > node.data){
                lo_arrList.add(node.data);
                lca_lo(node.right,lo,lo_arrList);
            } else if(lo < node.data) {
                lo_arrList.add(node.data);
                lca_lo(node.left,lo,lo_arrList);
            }
        }

        public static void lca_hi(Node node,int hi,ArrayList<Integer> hi_arrList){
            if(node == null){
                return;
            }
            if(node.data == hi){
                hi_arrList.add(node.data);
                return;
            }
            if(hi > node.data){
                hi_arrList.add(node.data);
                lca_hi(node.right,hi,hi_arrList);
            } else if(hi < node.data) {
                hi_arrList.add(node.data);
                lca_hi(node.left,hi,hi_arrList);
            }
        }

        // Print In Range
        public static void print_inRange(Node node,int lo,int hi,ArrayList<Integer> ans){
            if(node == null){
                return;
            }

            print_inRange(node.left,lo,hi,ans);

            if(lo<=node.data && node.data<=hi){
                ans.add(node.data);                
            }          

            print_inRange(node.right,lo,hi,ans);
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            Integer[] arr = new Integer[n];
            for(int i=0;i<arr.length;i++){
                if(str[i].equals("n")==true){
                    arr[i]=null;
                }else{
                    arr[i]=Integer.parseInt(str[i]);
                }
            }        

            //? construct BST
            Node root = construct(arr);
            
            //? display
            // display(root);

            //? size sum max min find
            // int val = Integer.parseInt(br.readLine());
            // System.out.println(size(root));
            // System.out.println(sum(root));
            // System.out.println(max(root));
            // System.out.println(min(root));
            // System.out.println(find(root,val));

            //? Add Node To Bst
            // int val = Integer.parseInt(br.readLine());
            // root = addNode(root,val);
            // display(root);

            //? Remove Node From Bst
            // int val = Integer.parseInt(br.readLine());
            // display(remove_node(root,val));

            //? Replace With Sum Of Larger
            // replace_sumOfL(root);
            // display(root);

            //? Lca Of Bst
            // int lo = Integer.parseInt(br.readLine());
            // int hi = Integer.parseInt(br.readLine());
            // System.out.print(lca(root,lo,hi));

            //? Print In Range
            int lo = Integer.parseInt(br.readLine());
            int hi = Integer.parseInt(br.readLine());
            ArrayList<Integer> ans = new ArrayList<>();
            print_inRange(root,lo,hi,ans);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
        }
    }