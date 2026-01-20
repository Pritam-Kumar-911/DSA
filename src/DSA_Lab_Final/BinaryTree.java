package DSA_Lab_Final;

public class BinaryTree {
    class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    Node root = null;
    public void printInorder(Node node){
        if (node == null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.data+ " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root=binaryTree.new Node(7);
        binaryTree.root.left=binaryTree.new Node(5);
        binaryTree.root.left.left=binaryTree.new Node(4);

        System.out.println("InorderTraversal Of the Tree: ");
        binaryTree.printInorder(binaryTree.root);
    }
}
