package LinkedList;

import java.util.Scanner;

public class Insert_Node_At_Beginning {
    public static void main(String[] args) {
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

        System.out.println("Input the Data to be inserted!");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        Node newNode = new Node();
        newNode.data = n;

        Node START = nodeA;

        if (START == null){
            newNode.next = null;
        }else{
            newNode.next = START;
            START = newNode;
        }

        Node temp = START;
        while (temp != null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
    }
}
