class GfG
{
    Node compute(Node head)
    {
        // your code here
        if(head==null) return head;
        
        Node revLL = reverse(head);
        Node temp = revLL;
        while(temp!=null){
            if(temp.next!=null && temp.data>temp.next.data){
                Node delNode = temp.next;
                temp.next = temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return reverse(revLL);
    }
    
    Node reverse(Node h){
        Stack<Integer> st = new Stack<>();
        Node temp = h;
        
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        
        Node dummyhead = new Node(st.pop());
        dummyhead.next=null;
        Node tempd = dummyhead;
        
        while(st.size()>0){
            Node tm = new Node(st.pop());
            tm.next=null;
            tempd.next=tm;
            tempd=tempd.next;
            // dummyNode=dummyNode.next;
        }
        return dummyhead;
    }
}