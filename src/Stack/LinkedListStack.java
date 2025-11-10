package Stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedListStack {
    private Node first;

    public LinkedListStack() {
        this.first = null;
    }

    public void push(int value){
        Node Old_First = first;
        first = new Node();
        first.data = value;
        first.next = Old_First;
    }

    public int pop(){
        if (first == null){
            throw new NoSuchElementException("Stack is Empty!");
        }
        else {
            int value = first.data;
            first = first.next;
            return value;
        }
    }

    public int peek(){
        return first.data;
    }

    public boolean isEmpty(){
        return (first == null);
    }


    public void DisplayStack(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            System.out.println("Displaying Stack");
            while (!isEmpty()){
                System.out.println(pop());
            }
        }
    }
    public int Max(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            int max = first.data;
            while (!isEmpty()){
                if (max < first.data) {
                    max = first.data;
                }
                    pop();
                }
            return max;
        }

    }
    public int Min(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            int min = first.data;
            while (!isEmpty()){
                if (min > first.data){
                    min = first.data;
                }
                pop();
            }
            return min;
        }
    }
    public int product(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            int product = 1;
            while (!isEmpty()){
                product *= first.data;
                pop();

            }
            return product;
        }
    }
    public void even(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            while (!isEmpty()){
                if ((first.data%2)==0){
                    System.out.println(first.data);
                }
                pop();
            }
        }
    }

    public void odd(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            while (!isEmpty()){
                if (first.data%2 != 0){
                    System.out.println(first.data);
                    pop();
                }
            }
        }
    }
    public float average(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            int sum = 0;
            int counter = 0;
            while (!isEmpty()){
                sum += first.data;
                counter++;
                pop();
            }
            float average = (float)sum/counter;
            return average;
        }
    }
}
