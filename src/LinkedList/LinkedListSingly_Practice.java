package LinkedList;

import java.util.NoSuchElementException;

public class LinkedListSingly_Practice {
    private Node head;

    public LinkedListSingly_Practice() {
        this.head = null;
    }

    void setHead(Node node){
        head = node;
    }
    void insertFirst(int Data){
        Node current = head;
        Node newNode = new Node();
        newNode.data = Data;

        if (current == null){
            current = newNode;
            current.next = null;
        }
        newNode.next = current;
        current = newNode;
        head = current;
    }
    void displayNodeList(){
        Node current = head;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
    }

    void insertLast(int data){
        Node current = head;
        Node newNode = new Node();
        newNode.data = data;

        if (current == null){
            current = newNode;
            newNode.next = null;
        }
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    void deleteFirst(){
        Node current = head;
        if (current == null){
            System.out.println("No Node avalible!");
        }
        current = current.next;
        head = current;
    }
    void deleteLast(){
        Node current = head;
        if (current == null){
            throw new NoSuchElementException();
        }
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;

    }
    void deleteFromAnywhere(int data){
        Node current = head;
        if (current == null){
            throw new NoSuchElementException();
        }
        if (current.data == data){
            current = current.next;
            head = current;
            return;
        }
        while (current.next.data != data){
            current = current.next;
        }
        current.next = current.next.next;
    }

    void insertAfter(int data , int data1){
        Node current = head;

        Node newNode = new Node();
        newNode.data = data1;

        if (current == null){
            System.out.println("list is empty!");
        }
        while (current.data != data){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }
}
