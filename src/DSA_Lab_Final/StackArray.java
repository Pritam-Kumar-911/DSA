package DSA_Lab_Final;

import java.util.Scanner;

public class StackArray {
    int[] stackArr;
    int max;
    int top;

    public StackArray(int max) {
        this.stackArr = new int[max];
        this.max = max;
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == max-1;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stackArr[top];
    }
    public void push(int data){
        if (isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        top++;
        stackArr[top] = data;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return 0;
        }
        int temp = stackArr[top];
        top--;
        return temp;
    }
    public void displayStack(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        for (int i = top ; i>=0 ; i--){
            System.out.println(stackArr[i]);
        }
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(5);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("");
            System.out.println("---------Welcome to XYZ Text Editor--------");
            System.out.println("1. Store a new action");
            System.out.println("2. Undo the last action");
            System.out.println("3. Display the last performed action");
            System.out.println("4. Show all stored actions");
            System.out.println("5. Exit");
            System.out.println("Select any option from above: ");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter a new action you want to store:");
                    int n = sc.nextInt();
                    stackArray.push(n);
                    System.out.println("Action added successfully!");
                    break;
                case 2:
                    int removed = stackArray.pop();
                    System.out.println("Removed the last operation Successfully!");
                    System.out.println("Removed Action: " + removed);
                    break;
                case 3:
                    System.out.println("Last performed Action: " + stackArray.peek());
                    break;

                case 4:
                    System.out.println("Displaying all actions: ");
                    stackArray.displayStack();
                    break;

                case 5:
                    System.out.println("Closing the program, Thank you!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }

        }while (flag);
    }

}
