package LinkedList;

public class LinkedListPractice_Main {

    public static void main(String[] args) {
        LinkedListSingly_Practice linkedListSinglyPractice = new LinkedListSingly_Practice();
        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        nodeA.data = 2;
        nodeA.next = nodeB;

        nodeB.data = 3;
        nodeB.next = nodeC;

        nodeC.data = 4;
        nodeC.next = nodeD;

        nodeD.data = 5;
        nodeD.next = null;

        linkedListSinglyPractice.setHead(nodeA);
        linkedListSinglyPractice.insertFirst(50);
        linkedListSinglyPractice.insertLast(100);
        linkedListSinglyPractice.displayNodeList();
        System.out.println(" ");
        linkedListSinglyPractice.deleteFirst();
        linkedListSinglyPractice.deleteLast();
        linkedListSinglyPractice.displayNodeList();
        System.out.println(" ");
        linkedListSinglyPractice.deleteFromAnywhere(2);
        linkedListSinglyPractice.displayNodeList();
        System.out.println(" ");
        linkedListSinglyPractice.insertAfter(4 , 50);
        linkedListSinglyPractice.displayNodeList();
    }

}
