package DSA_LAB_Practice_LinkedList;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Integer> BuiltInlinkedList = new LinkedList<>();

        BuiltInlinkedList.add(10);
        BuiltInlinkedList.add(20);
        BuiltInlinkedList.add(30);
        BuiltInlinkedList.add(40);

        BuiltInlinkedList.addFirst(50);

        BuiltInlinkedList.addLast(100);

        BuiltInlinkedList.removeFirst();

        BuiltInlinkedList.removeLast();

        System.out.println(BuiltInlinkedList);
    }
}
