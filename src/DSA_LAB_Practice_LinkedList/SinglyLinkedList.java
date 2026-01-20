package DSA_LAB_Practice_LinkedList;

public class SinglyLinkedList {
    Node first;

    public SinglyLinkedList() {
        this.first = null;
    }

    public void setFirst(Node node){
        first = node;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertAtHead(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
            newNode.next = null;
            return;
        }
        newNode.next=first;
        first = newNode;

    }
    public void insertAtTail(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
            newNode.next=null;
            return;
        }
        Node current = first;
        while (current.next!=null){
            current = current.next;
        }
        current.next=newNode;
        newNode.next=null;

    }
    public void DeleteFromHead(){
        Node current = first;

        if (isEmpty()){
            System.out.println("List is Empty!");
        }

        if (current.next == null){
            current = null;
        }

        current=current.next;
        first = current;
    }
    public void DeleteFromAnyWhere(int key) {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        // If head needs to be deleted
        if (first.data == key) {
            first = first.next;
            return;
        }

        Node current = first;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // Key not found
        if (current.next == null) {
            System.out.println("Key not Found!");
            return;
        }

        // Delete the node
        current.next = current.next.next;
    }
    public void DeleteFromTail(){
        if (isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        if (first.next == null){ //if the tail is head itself
            first = null;
        }
        Node current = first;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void DisplayList(){
        Node current = first;
        while (current != null){
            current.displayNode();
            current=current.next;
        }
    }

}