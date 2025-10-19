package LinkedList;

public class Insertfirst_DLL {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        nodeA.data = 4;
        nodeA.next=nodeB;

        nodeB.data = 3;
        nodeB.next = nodeC;

        nodeC.data = 20;
        nodeC.next = nodeD;

        nodeD.data = 8;
        nodeD.next = null;

        doublyLinkedList.setFirst(nodeA);
        doublyLinkedList.InsertFirst(45);
        doublyLinkedList.DisplayList();
    }
}
