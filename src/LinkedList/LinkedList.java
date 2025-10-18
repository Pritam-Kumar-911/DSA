package LinkedList;

public class LinkedList {
    private Node firstNode;

    public LinkedList() {
        this.firstNode = null;
    }

    public void displayNode(){
        Node current = firstNode;
        while (current != null){
            System.out.print(current.data+ ", ");
            current = current.next;
        }
    }

    public void setFirstNode(Node node){
        firstNode = node;
    }

    public void insertFirst(int n){
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = firstNode;
        firstNode = newNode;
    }
}
