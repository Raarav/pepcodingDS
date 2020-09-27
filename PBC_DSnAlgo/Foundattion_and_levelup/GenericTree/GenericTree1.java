// package Foundattion_and_levelup.BineryTree;
import java.util.*;

public class GenericTree {
    public static class Node{
        int data;
        ArrayList<Node> children;
        Node(int d,ArrayList<Node> child){
           this.data = d;
           this.children = child;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Node n = new Node(5, new ArrayList<Node>());
        Node temp = new Node(10, new ArrayList<>());
        Node temp1 = new Node(20, new ArrayList<>());
        Node temp2 = new Node(30, new ArrayList<>());
        Node temp3 = new Node(40, new ArrayList<>());
        Node temp4 = new Node(50, new ArrayList<>());
        Node temp5 = new Node(60, new ArrayList<>());
        Node temp6 = new Node(70, new ArrayList<>());
        Node temp7 = new Node(80, new ArrayList<>());
        n.children.add(temp);
        n.children.add(temp1);
        temp.children.add(temp2);
        temp.children.add(temp3);
        temp.children.add(temp4);
        temp1.children.add(temp5);
        temp1.children.add(temp6);
        temp1.children.add(temp7);
        System.out.println(n.children);
        //  ArrayList<Integer> dvjvj;
        //  System.out.println(temp.data+" "+temp.children.);
        //  System.out.println(temp1.data+" "+temp1.children);
        //  System.out.println(temp2.data+" "+temp2.children);
        //  System.out.println(temp3.data+" "+temp3.children);
        //  System.out.println(temp4.data+" "+temp4.children);
        //  System.out.println(temp5.data+" "+temp5.children);
        //  System.out.println(temp6.data+" "+temp6.children);
        //  System.out.println(temp7.data+" "+temp7.children);
         
        sd(n);
    }

    public static void sd(Node n){
        if(n==null){
            return;
        }
        // System.out.print(n.data+" ");
        for(Node child : n.children){
            sd(child);
            // System.out.print(child.data+" ");
        }
        System.out.print(n.data+" ");
    }

}