class Node{
    int data;
    Node next=null;
    public void display(Node node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
// class LL{
//     public void display(Node node){
//         while(node!=null){
//             System.out.println(node.data);
//             node=node.next;
//         }
//     }
// }
class LinkedList{
    public static void main(String[] args){
        Node n = new Node();
        n.data=25;
        n.next=new Node();
        n.next.data=27;
        n.next.next=new Node();
        n.next.next.data=28;
        n.next.next.next=new Node();
        n.next.next.next.data=29;
        n.next.next.next.next=new Node();
        n.next.next.next.next.data=30;
        // LL d = new LL();
        n.display(n);
    }
}