package Mid_Practice;

public class LinkedList {
    private Node first;

    public LinkedList() {
        this.first = null;
    }
    public void setFirst(Node node){
        first = node;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }
    public void insertAtLast(int data){
        Node current = first;
        Node newNode = new Node();
        newNode.data = data;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
    public Node deleteLast(){
        Node current= first;
        while (current.next.next!= null){
            current = current.next;
        }
        current.next = null;
        return current;
    }


}
