package LinkedList;

public class singlyLinkedList {

    public static void main(String[] args) {

        //Traverse and print the data the linkedList

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

        //Check if the list is empty (Exit if it is)
        Node START = nodeA;
        if (START == null){
            System.out.println("The List is Empty");
            return;
        }

        //Traverse and print
        Node temp = START;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
