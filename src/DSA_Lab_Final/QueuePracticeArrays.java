package DSA_Lab_Final;

import java.util.NoSuchElementException;

public class QueuePracticeArrays {
    int[] arrayQueue;
    int max;
    int front;
    int rear;
    int nItems;

    public QueuePracticeArrays(int max) {
        this.arrayQueue = new int[max];
        this.max = max;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }
    public boolean isEmpty(){
        return nItems == 0;
    }
    public boolean isFull(){
        return nItems == max;
    }
    public void enqueue(int data){
        if (isFull()){
            throw new NoSuchElementException();
        }
        rear++;
        arrayQueue[rear] = data;
        nItems++;
    }
    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int temp = arrayQueue[front];
        front++;
        nItems--;
        return temp;
    }
    public void displayQueue(){
        for (int i=0 ; i<nItems ; i++){
            int index = (front + i) % max;
            System.out.println(arrayQueue[index] + " ");
        }
    }

}
