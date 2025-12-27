package DSA_Lab_Final;

public class Task2 {
    char[] stackArr;
    int max;
    int top;

    public Task2(int max) {
        this.stackArr = new char[max];
        this.max = max;
        this.top = -1;
    }

    public void push(char character) {
        top++;
        stackArr[top] = character;
    }

    public char pop() {
        char temp = stackArr[top];
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void checkExp(char[] arr, String exp) {
        Task2 stack = new Task2(exp.length());

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            char c = exp.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    flag = false;
                }
                char open = stack.pop();

                if (open == '(' && c != ')' || open == '{' && c != '}' || open == '[' && c != ']') {
                    flag = false;
                }
            }
        }
        if (!stack.isEmpty()){
            flag = false;
        }
        if (flag){
            System.out.println("Expression is Balanced!");
        }else
            System.out.println("Expression is not balanced!");
    }



    public static void main(String[] args) {
        String exp = "(a+b*[c-d)";
        char[] arr = new char[exp.length()];
        checkExp(arr , exp);

    }
}
