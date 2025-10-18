package LinkedList;

public class Search_List {
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


        linkedList.setFirstNode(nodeA);

        //The position of given data
        System.out.println(linkedList.searchList(3));
    }
}
