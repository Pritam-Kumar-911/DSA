package DSA_Lab_Final;

public class Task2Prac {
    char[] stackArr;
    int max;
    int top;

    public Task2Prac(int max) {
        this.stackArr = new char[max] ;
        this.max = max;
        this.top = -1;
    }
    public void push(char data){
        top++;
        stackArr[top] = data;
    }
    public char pop(){
        char temp = stackArr[top];
        top--;
        return temp;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public static void ExpChecker(char[] arr ,String exp){
        Task2Prac task2Prac = new Task2Prac(exp.length());
        boolean flag = true;
        for (int i=0 ; i<arr.length ; i++){
            char c = exp.charAt(i);

            if (c == '(' || c == '{' || c == '['){
                task2Prac.push(c);
            }
            if (c == ')' || c == '}' || c == ']'){
                if (task2Prac.isEmpty()){
                    flag = false;
                }
                char open = task2Prac.pop();
                if (open == '(' && c != ')' || open == '{' && c != '}' || open == '[' && c != ']'){
                    flag = false;
                }

            }
        }
        if (!task2Prac.isEmpty()){
            flag = false;
        }
        if (flag){
            System.out.println("Exp is Balanced!");
        }
        else
            System.out.println("Not Balanced!");
    }
    public static void main(String[] args) {
        String exp = "(a+b)*[c-d]";
        char[] characer = new char[exp.length()];
        ExpChecker(characer , exp);

    }
}
