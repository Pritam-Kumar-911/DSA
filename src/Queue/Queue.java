package Queue;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public int peekFront(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public void Enqueue(int x){
        if (nItems == queueArray.length){
            throw new IllegalStateException("Queue is Full!");
        }
        rear++;
        queueArray[rear] = x;
        nItems++;
    }
    public int Dequeue(){
        int temp = queueArray[front];
        front++;
        if (front == maxSize){
            front = 0;
        }
        nItems--;

        return temp;
    }
    public void DisplayQueue(){
        System.out.print("{");
        for (int i=0 ; i< queueArray.length ; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("}");
    }

    public void processQueue(){
        while (!isEmpty()){
            System.out.print(Dequeue()+"-->");
        }
    }
    public boolean isComplete(){
        return (maxSize == nItems);
    }

    public int max(){
        int max = queueArray[front];
        while (!isEmpty()){
            if (max < queueArray[front]){
                max = queueArray[front];
            }
            Dequeue();
        }
        return max;
    }

}
