package Stack;

public class Stack_LL_Implementation {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(11);
        linkedListStack.push(56);
        linkedListStack.push(9);

        //System.out.println(linkedListStack.peek());
        //System.out.println(linkedListStack.Max());
        //linkedListStack.DisplayStack();
        //System.out.println(linkedListStack.Min());
        //System.out.println(linkedListStack.product());
        //linkedListStack.even();
        System.out.println(linkedListStack.average());


    }
}
