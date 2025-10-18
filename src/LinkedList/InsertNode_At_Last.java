package LinkedList;

import java.util.Scanner;

public class InsertNode_At_Last {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        nodeA.data = 4;
        nodeA.next=nodeB;

        nodeB.data = 3;
        nodeB.next = nodeC;

        nodeC.data = 7;
        nodeC.next = nodeD;

        nodeD.data = 8;
        nodeD.next = null;

        System.out.println("Input the Data to be inserted at Beginning");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        linkedList.setFirstNode(nodeA);
        linkedList.insertAtLast(n);
        linkedList.displayNode();

    }
}
