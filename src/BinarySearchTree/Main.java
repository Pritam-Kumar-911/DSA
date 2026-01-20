package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        int[] arr = {34,78,33,22,11,10,98};
        BST bst = new BST();

        for (int i=0 ; i<arr.length ; i++){
            bst.Insert(arr[i]);
        }
        bst.InOrderTraversal(bst.root);

        if (bst.find(200)){
            System.out.println("Value Found!");
        }else
            System.out.println("Value Not Found!");

        System.out.println(bst.height());
        System.out.println("Min Node: " + bst.minNode());
        System.out.println("Max Node: " + bst.maxNode());
        bst.printNodesAtDistance(3);

        System.out.println(bst.findSuccessor(33));
        System.out.println(bst.findPredecessor(11));

        bst.delete(33);
        bst.InOrderTraversal(bst.root);
    }
}
