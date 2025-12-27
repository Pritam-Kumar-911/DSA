package DSA_Lab_Final;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = true;
        QueuePracticeArrays queuePracticeArrays = new QueuePracticeArrays(5);
        do {
            System.out.println("------- Welcome to SZABIST Cafeteria -------");
            System.out.println("1. Add a student at the end of the queue");
            System.out.println("2. Remove a student from the front of the queue");
            System.out.println("3. Display all students currently waiting in the queue");
            System.out.println("Select any option from above: ");
            n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter Token Number: ");
                    int token = sc.nextInt();
                    queuePracticeArrays.enqueue(token);
                    break;
                case 2:
                    System.out.println("Student Removed Successfully!");
                    System.out.println("Token Number : " + queuePracticeArrays.dequeue());
                    break;
                case 3:
                    System.out.println("Display All Students :");
                    queuePracticeArrays.displayQueue();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    flag = false;
                    break;
            }
        } while (flag);

    }
}
