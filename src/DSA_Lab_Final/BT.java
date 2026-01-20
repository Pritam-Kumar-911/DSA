package DSA_Lab_Final;
import java.util.Queue;
import java.util.LinkedList;
public class BT {
    class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    Node root = null;

    public void InorderTraversal(Node node){
        if (node == null){
            return;
        }
        InorderTraversal(node.left);
        System.out.print(node.data + " ");
        InorderTraversal(node.right);
    }
    public void PreOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        PreOrder(node.left);
        PreOrder(node.right);

    }
    public void PostOrder(Node node){
        if (node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data + " ");
    }
    public void LevelOrder(Node node){
        if (node == null){
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(node);
        while (!q.isEmpty()){
            Node current = q.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BT binaryTree = new BT();

        binaryTree.root = binaryTree.new Node(7);
        binaryTree.root.left = binaryTree.new Node(5);
        binaryTree.root.left.left = binaryTree.new Node(4);

        binaryTree.InorderTraversal(binaryTree.root);
        System.out.println("");
        binaryTree.PreOrder(binaryTree.root);
        System.out.println("");
        binaryTree.PostOrder(binaryTree.root);
        System.out.println(" ");
        binaryTree.LevelOrder(binaryTree.root);
    }
}
