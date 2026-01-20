package DSA_Lab_Final;

public class StackPrac {
    int[] stackArray;
    int max;
    int top;

    public StackPrac(int max) {
        this.stackArray = new int[max];
        this.max = max;
        this.top = -1;
    }
    public boolean IsEmpty(){
        return top == -1;
    }
    public boolean IsFull(){
        return top == max -1;
    }
    public int peek(){
        if (IsEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stackArray[top];
    }
    public void push(int data){
        if(IsFull()){
            System.out.println("Stack is Full!");
            return;
        }
        top++;
        stackArray[top] = data;
    }
    public int pop(){
        if (IsEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int temp = stackArray[top];
        top--;
        return temp;
    }
    public void displayStack(){
        if (IsEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for (int i=top ; i>=0 ; i--){
            System.out.print(stackArray[i]);
        }
    }
}
