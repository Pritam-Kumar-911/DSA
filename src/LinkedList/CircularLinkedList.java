package LinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void setFirst(Node node){
        first = node;
    }

    public void setLast(Node node){
        last = node;
    }



    boolean isEmpty(){
        return (first == null);
    }

    public void DisplayLinked(){
        Node current = first;
        while (current != last){
            current.displayNode();
            current = current.next;
        }
    }

    public void InsertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
        last.next = first;
    }
    public void InsertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            first = newNode;
            last = newNode;
            last.next = first;
        }
        else {
            last.next = newNode;
            last = newNode;
            last.next = first;
        }
    }
}
