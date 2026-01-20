package DSA_LAB_Practice_LinkedList;

public class DLL_Practice {
    Node first;
    Node last;

    public DLL_Practice() {
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
    public void DisplayList(){
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
    }
    public void InsertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
            last = newNode;
            return;
        }
        newNode.next = first;
        first.previous = newNode;
        first = newNode;
    }
    public void InsertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
            last = newNode;
            return;
        }
        newNode.previous = last;
        last.next=newNode;
        last = newNode;
    }
    public void DeleteFirst(){
        if (isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        if (first.next == null){
            first = null;
            return;
        }
        first = first.next;
        first.previous=null;
    }
    public void DeleteLast(){
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        if (first.next == null){
            first = null;
        }
        last = last.previous;
        last.next = null;
    }
    public void InsertFromAnywhere(int key, int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            System.out.println("Node is Empty!");
            return;
        }
        if (first.data == key){
            newNode.previous = first;
            newNode.next = first.next;
            first.next.previous = newNode;
            first.next = newNode;
            return;
        }
        if (last.data == key){
            newNode.previous = last;
            last.next = newNode;
            return;
        }

        Node current = first;
        while (current!=null && current.data != key){
            current = current.next;
        }
        if (current == null){
            System.out.println("Key not Found!");
            return;
        }
        newNode.previous = current;
        newNode.next = current.next;
        current.next.previous = newNode;
        current.next = newNode;
    }

    public void DeleteByKey(int key){
        if (isEmpty()){
            System.out.println("List is Empty!");
        }
        if (first.data == key){
            first = first.next;
            first.previous = null;
            return;
        }
        if (last.data == key){
            last = last.previous;
            last.next = null;
            return;
        }
        Node current = first;
        while (current != null && current.data != key){
            current = current.next;
        }
        if (current == null){
            System.out.println("Key not Found!");
            return;
        }
        current.next.previous = current.previous;
        current.previous.next = current.next;


    }
}
