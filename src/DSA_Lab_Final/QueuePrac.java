package DSA_Lab_Final;

import java.util.Queue;

public class QueuePrac {
    int[] QueueArray;
    int max;
    int front;
    int rear;
    int nItems;

    public QueuePrac(int max) {
        QueueArray = new int[max];
        this.max = max;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }
    public boolean IsEmpty(){
        return nItems == 0;
    }
    public boolean isFull(){
        return nItems == max;
    }
    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        QueueArray[rear] = data;
        nItems++;
    }
    public int dequeue(int data){
        if (IsEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int temp = QueueArray[front];
        front++;
        nItems--;
        return temp;
    }
    public void displayQueue(){
        if (IsEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        for (int i=0 ; i<nItems ; i++){
            int index = (front + i) % max;
            System.out.println(QueueArray[index] + " ");
        }
    }
}
