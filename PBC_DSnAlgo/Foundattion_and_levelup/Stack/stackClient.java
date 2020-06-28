import java.util.*;

public class stackClient {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
    }
}