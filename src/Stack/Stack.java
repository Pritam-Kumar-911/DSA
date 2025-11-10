package Stack;

import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }
    public long peak(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (maxSize-1 == top);
    }
    public void push(int j){
        if (isFull()){
            System.out.println("Stack is full!");
        }
        else {
            top++;
            stackArray[top] = j;
        }
    }
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public void printStack(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            System.out.println("Popping out elements from stack!");
            while (!isEmpty()){
                System.out.println(pop() +" ");
            }
        }
    }
}
