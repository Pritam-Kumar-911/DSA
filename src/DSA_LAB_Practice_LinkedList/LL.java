package DSA_LAB_Practice_LinkedList;

public class LL {
    private Node head;

    public LL() {
        this.head = null;
    }

    void setNode(Node node){
        head = node;
    }


    void atFirst(int data){

    Node current = head;
    Node newNode = new Node();
    newNode.data = data;

    if (head == null){
        current = newNode;
        current.next = null;
    }else {

        newNode.next = current;
        current = newNode;
    }
    head = current;

    }
    void InsertLast(int data){
        Node current = head;

        Node newNode = new Node();
        newNode.data = data;

        if (current == null) {
            current = newNode;
            newNode.next = null;
            head = current;
        }

        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        current = newNode;

    }

//    void displayList(){
//        Node current = head;
//
//        while (current != null){
//            current.display();
//            current = current.next;
//        }
//    }

    void deleteHead() {
        Node current = head;
        if (current == null) {
            return;
        }
        current = current.next;
        head = current;
    }
    void deleteTail(){
        Node current = head;
        if (current == null){
            return;
        }
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    void deleteFromAnywhere(int data) {
        Node current = head;
        Node previous = null;

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        if (current.data == data) {
            head = current.next;
            current.next = null;
            return;
        }

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with value " + data + " not found.");
            return;
        }

        previous.next = current.next;
        current.next = null;
    }


}
