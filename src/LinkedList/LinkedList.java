package LinkedList;

public class LinkedList {
    private Node firstNode;

    public LinkedList() {
        this.firstNode = null;
    }

    public void displayNode(){
        Node current = firstNode;
        while (current != null){
            System.out.print(current.data+ ", ");
            current = current.next;
        }
    }

    public void setFirstNode(Node node){
        firstNode = node;
    }

    public void insertFirst(int n){
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = firstNode;
        firstNode = newNode;
    }

    public void insertAtLast(int n){
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = null;

        Node current = firstNode;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public Node deleteFirst(){
        Node temp = firstNode;
        firstNode = firstNode.next;
        return temp;
    }

    public Node deleteLast(){
        Node current = firstNode;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return current;
    }

    public int searchList(int n){
        int pos = 1;
        Node current = firstNode;
        while (current.next != null){
            if (current.data == n){
                return pos;
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
}
