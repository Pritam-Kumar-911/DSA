package BinarySearchTree;

import java.util.NoSuchElementException;

public class bstPractice {
    public class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data=" + data;

        }
    }

    Node root = null;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        var current = root;
        while (true) {
            if (value > current.data) {
                if (current.right == null) {
                    current.right = new Node(value);
                    break;
                }
                current = current.right;
            } else if (value < current.data) {
                if (current.left == null) {
                    current.left = new Node(value);
                    break;
                }
                current = current.left;
                break;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (current.data > value) {
                current = current.left;
            } else if (current.data < value) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.data + " ");
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.println(node.data + " ");
        preOrder(node.right);
    }

    public void printNodeAtDistance(Node node, int distance) {

        if (node == null) {
            return;
        }
        if (distance == 0) {
            System.out.println(node.data);
            return;
        } else {
            printNodeAtDistance(node.right, distance - 1);
            printNodeAtDistance(node.left, distance - 1);
        }
    }

    private int minNode() {
        return minNode(root);
    }

    private int minNode(Node node) {
        if (node == null) {
            throw new IllegalStateException();
        }
        Node current = node;
        while (node.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int maxNode() {
        return maxNode(root);
    }

    private int maxNode(Node node) {
        if (node == null) {
            throw new IllegalStateException();
        }
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public Node findMin(Node node) {
        if (node == null) {
            throw new NoSuchElementException();
        }
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public Node delete(Node node , int value){
        if (node == null){
            return null;
        }
        if (value > node.data){
            node.right = delete(node.right , value);
        } else if (value < node.data) {
            node.left = delete(node.left , value);
        }else {
            if (node.right == null && node.left == null){
                return null;
            }
            if (node.right == null){
                return node.left;
            }
            if (node.left == null){
                return node.right;
            }
            Node successor = findMin(node.right);
            node.data = successor.data;
            node.right = delete(node.right , successor.data);
        }
        return node;
    }
    public Node findSuccessor(int value){
        Node current = root;
        Node successor = null;
        while (current != null){
            if (value > current.data){
                current = current.right;
            } else if (value < current.data) {
                successor = current;
                current = current.left;
            }else {
                if (current.right != null){
                    successor = findMin(current.right);
                }
                break;
            }
        }
        return successor;
    }
}
