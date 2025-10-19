package LinkedList;

public class Display_Forward_And_Backward {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        nodeA.data = 4;
        nodeA.next=nodeB;
        nodeA.previous = null;

        nodeB.data = 3;
        nodeB.next = nodeC;
        nodeB.previous = nodeA;

        nodeC.data = 20;
        nodeC.next = nodeD;
        nodeC.previous = nodeB;

        nodeD.data = 8;
        nodeD.next = null;
        nodeD.previous = nodeC;

        linkedList.setFirst(nodeA);
        linkedList.setLast(nodeD);
        linkedList.DisplayForward();
        System.out.println("");
        linkedList.DisplayBackward();

    }
}
