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

    public Node DeleteFirst() {
        Node current = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return current;
    }

    public Node DeleteLast(){
        Node current = last;
        if (isEmpty())
            throw new NoSuchElementException();
        else if (first.next == null) {
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
        return current;
    }

    public void DisplayForward(){
        Node current = first;
        if (isEmpty())
            throw new NoSuchElementException();

        while (current != null){
            current.displayNode();
            current = current.next;
        }
    }
    public void DisplayBackward(){
        if (isEmpty())
            throw new NoSuchElementException();
        Node current = last;
        while (current != null){
            current.displayNode();
            current = current.previous;
        }
    }
}
