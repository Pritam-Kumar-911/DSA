package DSA_LAB_Practice_LinkedList;

public class Main4 {
    public static void main(String[] args) {
        DLL_Practice dllPractice = new DLL_Practice();

//        Node nodeA = new Node();
//        nodeA.data = 10;
//
//        Node nodeB = new Node();
//        nodeB.data = 20;
//
//        Node nodeC = new Node();
//        nodeC.data = 30;
//
//        Node nodeD = new Node();
//        nodeD.data = 40;
//
//        nodeA.next=nodeB;
//        nodeB.next=nodeC;
//        nodeC.next=nodeD;
//        nodeD.next=null;
//
//        nodeD.previous=nodeC;
//        nodeC.previous=nodeB;
//        nodeB.previous=nodeA;
//        nodeA.previous=null;
//
//        dllPractice.setFirst(nodeA);
//        dllPractice.setLast(nodeD);
//
//        dllPractice.InsertFirst(34);
//        dllPractice.InsertLast(56);
//        dllPractice.DeleteFirst();
//        dllPractice.DeleteLast();
//        dllPractice.InsertFromAnywhere(10, 67);
//        dllPractice.DisplayList();

        dllPractice.InsertLast(20);
        dllPractice.InsertFirst(45);
        dllPractice.InsertFirst(67);
        dllPractice.InsertFromAnywhere(67 , 89);
        dllPractice.DeleteByKey(87);
        dllPractice.DisplayList();
    }
}
