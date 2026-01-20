package DSA_LAB_Practice_LinkedList;

import java.util.Scanner;

public class Quiz_Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        arr[0] = "ali";
        arr[1] = "ahmed";
        arr[2] = "ahsan";
        arr[3] = "amna";

        int size = 4;
        int count = 0;

        System.out.println("Enter Element to Delete!");
        String n = sc.next();
        System.out.println("");

        for (int i=0 ; i<size; i++){
            if (arr[i].equals(n)){
               count = i;
            }
        }

        for (int i=count ; i<size ; i++){
            arr[i] = arr[i+1];
        }
        size--;

        System.out.println("Array after deletion!");
        for (int i=0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
}
