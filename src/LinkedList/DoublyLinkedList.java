package LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public void setFirst(Node node){
        first = node;
    }
    public void setLast(Node node){
        last = node;
    }

    public Boolean isEmpty(){
        return (first == null);
    }

    public void InsertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            last = newNode;
        }
        else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }
    public void DisplayList(){
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
    }

    public boolean insertAfter(int key , int data){

        if (isEmpty())
            throw new NoSuchElementException();

        Node current = first;
        while (current.data != key){
            current = current.next;
            if (current == null){
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if (current == last){
//            current.next = null;
            last = newNode;

        }else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous =current;
        current.next = newNode;
        return true;
    }
}
