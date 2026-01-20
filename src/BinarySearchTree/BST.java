package BinarySearchTree;

public class BST {
    public class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node data =" + data;
        }
    }
     Node root = null;

    public void Insert(int value){
        if (root == null){
            root = new Node(value);
            return;
        }
        var current = root;
        while (true){
            if (current.data > value){
                if (current.left == null){
                    current.left = new Node(value);
                    break;
                }
                current = current.left;
            }else {
                if (current.right == null){
                    current.right = new Node(value);
                    break;
                }
                current = current.right;
            }
        }
    }
    public void InOrderTraversal(Node node){
        if (node == null){
            return;
        }
        InOrderTraversal(node.left);
        System.out.print(node.data + " ");
        InOrderTraversal(node.right);
    }
    public void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);;
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public boolean find(int value){
        var current = root;
        while (current != null){
            if (current.data > value){
                current = current.left;
            } else if (current.data < value) {
                current = current.right;
            }else
                return true;
        }
        return false;
    }
    public int height(){
        return height(root);
    }
    public int height(Node root){
        if (root == null){
            return -1;
        } else if (root.left == null && root.right == null) {
            return 0;
        }
        return 1+Math.max(height(root.left) , height(root.right));
    }
    public int minNode(){
        return minNode(root);
    }
    private int minNode(Node root){
        if (root == null){
            throw new IllegalStateException();
        }
        var current = root;
        while (current.left != null){
            current = current.left;
        }
        return current.data;
    }
    public int maxNode(){
        return maxNode(root);
    }
    private int maxNode(Node root){
        if (root == null){
            throw new IllegalStateException();
        }
        var current = root;
        while (current.right != null){
            current = current.right;
        }
        return current.data;
    }
    public void printNodesAtDistance(int distance){
        printNodesAtDistance(root , distance);
    }
    private void printNodesAtDistance(Node node, int distance){
        if (node == null){
            return;
        } else if (distance == 0) {
            System.out.println(node.data);
            return;
        }
        else {
            printNodesAtDistance(node.left, distance - 1);
            printNodesAtDistance(node.right, distance - 1);
        }
    }
    public Node findSuccessor(int value){
        Node current = root;
        Node successor = null;
        while (current != null){
            if(value < current.data){
                successor = current;
                current = current.left;
            } else if (value > current.data) {
                current = current.right;
            }
            else
                if (current.right != null){
                    successor = findMin(current.right);
                }
                break;
        }
        return successor;
    }
    public Node findPredecessor(int value){
        Node predecessor = null;
        Node current = root;
        while (current != null){
            if (value > current.data){
                predecessor = current;
                current = current.right;
            } else if (value < current.data) {
                current = current.left;
            }
            else {
                if (current.left != null) {
                    predecessor = findMax(current.left);
                }
                break;
            }

        }

        return predecessor;
    }
    public Node findMax(Node node){
        while (node.right != null){
            node = node.right;
        }
        return node;
    }
    public Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    public void delete(int value){
        root = delete(root , value);
    }
    private Node delete(Node node, int value){
        if (node == null){
            return null;
        }
        if (value > node.data){
            node.right = delete(node.right , value);
        } else if (value < node.data) {
            node.left = delete(node.left , value);
        }
        else{
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
}
