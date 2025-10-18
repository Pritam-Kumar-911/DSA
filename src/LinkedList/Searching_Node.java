package LinkedList;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class Searching_Node {
    public static void main(String[] args) {

        //Traverse and Search the Input Data from node

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

        System.out.println("Input the Data to be searched!");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        Node START = nodeA;
        Node temp = START;
        int POS = 1;

        while (temp != null){
            if (temp.data == n){
                System.out.println("The Data is Found at POS: "+POS);
                return;
            }
            temp = temp.next;
            POS++;
        }

        if (temp == null){
            System.out.println("The data is not found in List!");
            return;
        }
    }
}
