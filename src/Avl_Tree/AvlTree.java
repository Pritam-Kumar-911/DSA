package Avl_Tree;

public class AvlTree {
    public class avlNode{
        int data;
        avlNode right;
        avlNode left;
        int height;

        public avlNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data=" + data;
        }
    }
    avlNode root;

    public avlNode insert(avlNode node , int value){
        if (node == null){
            return new avlNode(value);
        }
        if (value > node.data){
            node.right = insert(node.right , value);
        }else
            node.left = insert(node.left , value);

        node.height = Math.max(height(node.left) , height(node.right)) + 1;

        return balance(root);
    }
    public int height(avlNode node){
        return  (node == null) ? 0 : node.height;
    }
    public avlNode balance(avlNode node){
        if (isLeftHeavy(node)){

        } else if (isRightHeavy(node)) {

        }
        return node;
    }
    public avlNode rotateLeft(avlNode root){
        avlNode newNode = root.right;
        root.right = newNode.left;
        newNode.left = root;
        root.height = Math.max(height(root.left) , height(root.right)) + 1;
        newNode.height = Math.max(height(newNode.left) , height(newNode.right)) + 1;
        return newNode;
    }
    public avlNode rotateRight(avlNode root){
        avlNode newNode = root.left;
        root.left = newNode.right;
        newNode.right = root;
        root.height = Math.max(height(root.left) , height(root.right)) + 1;
        newNode.height = Math.max(height(newNode.left) , height(newNode.right)) + 1;
        return newNode;
    }
    public int balanceFactor(avlNode node){
        return node == null ? 0 : height(node.left) - height(node.right);
    }
    public boolean isLeftHeavy(avlNode node){
        return balanceFactor(node) > 1;
    }
    public boolean isRightHeavy(avlNode node){
        return balanceFactor(node) < -1;
    }
}
