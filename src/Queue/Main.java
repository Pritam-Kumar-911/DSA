package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);


        System.out.println(queue.max());
    }
}
