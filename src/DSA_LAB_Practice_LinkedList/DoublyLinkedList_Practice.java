package DSA_LAB_Practice_LinkedList;

public class DoublyLinkedList_Practice {
    private Node first;
    public Node last;

    public DoublyLinkedList_Practice() {
        this.first = null;
        this.last = null;
    }
    public void setFirst(Node node){
        first = node;
    }
    public void setLast(Node node){
        last = node;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void DisplayForward(){
        if (isEmpty()){
            System.out.println("List is Empty!");
        }
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
    }

    public void DisplayBackward(){
        Node current = last;
        while (current != null){
            current.displayNode();
            current=current.previous;
        }
    }
    public void InsertFirst(int data){
        Node current = first;
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
            last=newNode;
            return;
        }

        newNode.next=current;
        current.previous=newNode;
        first = newNode;

    }
    public void InsertLast(int data){

        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            first=newNode;
            last=newNode;
            return;
        }
        newNode.previous=last;
        last.next=newNode;
        last = newNode;
    }
    public void DeleteFirst(){
        if (isEmpty()){
            System.out.println("List is Empty!");
        }
        first=first.next;
        first.previous=null;
    }
    public void DeleteLast(){
        if (isEmpty()){
            System.out.println("List is Empty!");
        }
        last=last.previous;
        last.next=null;
    }
    public void InsertAfter(int key, int data){
        if (isEmpty()){
            System.out.println("List is empty!");
        }
        Node current = first;

        while (current != null && current.data != key){
            current = current.next;
        }

        if (current == null){
            System.out.println("Key is not found!");
            return;
        }

        Node newNode = new Node();
        newNode.data = data;
        if (current == last){
            newNode.previous=last;
            last.next=newNode;
            last=newNode;
            return;
        }

        newNode.previous=current;
        newNode.next=current.next;
        current.next.previous=newNode;
        current.next=newNode;

    }
    public void DeleteByNode(int key){
        Node current = first;
        if (isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        while (current != null && current.next.data != key){
            current = current.next;
        }
        if (current == null){
            System.out.println("key not found!");
            return;
        }
        current.next=current.next.next;
        current.next.next.previous=current;

    }


}
