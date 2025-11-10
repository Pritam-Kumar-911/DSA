package Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        s1.pop();

        s1.printStack();

    }
}
