// import circularQueue;
public class circularQueueClient {
    public static void main(String[] args){
        circularQueue q = new circularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.display();
        System.out.print(q.peek());
        System.out.println();
        System.out.print(q.size());
    }             
}