package DSA_Lab_Final;

import java.util.NoSuchElementException;

public class QueueSLL {
    public Node first;

    public QueueSLL() {
        this.first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public void enqueue(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            first = newNode;
            return;
        }
        Node current = first;

        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = first;
        first = first.next;
        return temp.data;
    }
    public void displayList(){
        Node current = first;
        while (current != null){
            current.printNode();
            current = current.next;
        }
    }


    public static void main(String[] args) {
        QueueSLL queueSLL = new QueueSLL();

        queueSLL.enqueue(10);
        queueSLL.enqueue(20);
        queueSLL.enqueue(30);

        queueSLL.displayList();

    }
}
