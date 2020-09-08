class GfG
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
        // Your code here
        HashMap<Integer ,Integer> hm = new HashMap<>();
        Node temp = head;
        hm.put(temp.data,1);
        temp=temp.next;
        while(temp!=null){
            if(hm.containsKey(temp.data)){
                Node tm = temp;
                if(temp.next!=null){
                    temp.data=temp.next.data;
                    temp.next=temp.next.next;
                }
                tm.next=null;
                
            }else{
                hm.put(temp.data,1);
                temp=temp.next;
            }
        }
        return head;
    }
}
