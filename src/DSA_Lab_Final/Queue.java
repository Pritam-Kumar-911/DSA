package DSA_Lab_Final;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
    int[] queueArray;
    int max;
    int front;
    int rear;
    int nItems;

    public Queue(int max) {
        this.queueArray = new int[max];
        this.max = max;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == max);
    }
    public int peekFront(){
        return queueArray[front];
    }

    public void enqueue(int value){
        if (isFull()){
            throw new IllegalStateException("Queue is Full!");
        }
        rear++;
        queueArray[rear] = value;
        nItems++;
    }
    public int dequeue(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int temp = queueArray[front];
        front++;
        if (front == max){
            front = 0;
        }
        nItems--;
        return temp;
    }
    public void displayQueue(){
        for (int i = 0 ; i<nItems ; i++){
            int index= (front + i) % max;
            System.out.println(queueArray[index] + " ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.enqueue(13);
        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(59);
        queue.enqueue(23);


        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
    }
}
