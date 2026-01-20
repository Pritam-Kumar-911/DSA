package DSA_LAB_Practice_LinkedList;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Node nodeA = new Node();
        nodeA.data = 10;

        Node nodeB = new Node();
        nodeB.data = 20;

        Node nodeC = new Node();
        nodeC.data = 30;

        Node nodeD = new Node();
        nodeD.data = 40;

        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        nodeD.next=null;

        singlyLinkedList.setFirst(nodeA);
        singlyLinkedList.insertAtHead(23);
        singlyLinkedList.insertAtTail(67);
        singlyLinkedList.DeleteFromHead();
        singlyLinkedList.DeleteFromAnyWhere(67);
        singlyLinkedList.DeleteFromTail();
        singlyLinkedList.DisplayList();

//
//        nodeA.previous=null;
//        nodeB.previous=nodeA;
//        nodeC.previous=nodeB;
//        nodeD.previous=nodeC;
//
//        doublyLinkedListPractice.setFirst(nodeA);
//        doublyLinkedListPractice.setLast(nodeD);

//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");
//        doublyLinkedListPractice.DisplayBackward();
//        System.out.println("");
//        doublyLinkedListPractice.InsertFirst(23);
//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");
//        doublyLinkedListPractice.InsertLast(56);
//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");
//        doublyLinkedListPractice.DeleteFirst();
//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");
//        doublyLinkedListPractice.DeleteLast();
//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");
//        doublyLinkedListPractice.InsertAfter(10 , 67);
//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");
//        doublyLinkedListPractice.DeleteByNode(67);
//        doublyLinkedListPractice.DisplayForward();
//        System.out.println("");


    }
}
