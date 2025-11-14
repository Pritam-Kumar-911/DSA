package Array2D_DSATheory_Lec2;

import java.util.Scanner;

public class Pratice_Quiz {
    public static void main(String[] args) {




       int[] arr = new int[5];
       arr[0] = 100;
       arr[1] = 200;
       arr[2] = 300;
       arr[3] = 400;

       int size = 4;

        //Delete Given Index of an Array
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter index you want to delete!");
//       int n = sc.nextInt();
//
//       for (int i=n ; i<size ; i++){
//           arr[i] = arr[i+1];
//       }
//
//       for (int i=0 ; i<size ; i++){
//           System.out.println(arr[i]);
//       }


        //Insert Element at a particular index

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Value of Element!");
//        int element = sc.nextInt();
//        System.out.println("Enter index!");
//        int index = sc.nextInt();
//
//        for (int i = size ; i > index ; i--){
//            arr[i] = arr[i-1];
//        }
//        arr[index] = element;
//        size++;
//
//        for (int i=0 ; i<size ; i++){
//            System.out.println(arr[i]);
//        }


        //Delete Element by giving value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to delete!");
        int value = sc.nextInt();
        int counter = -1;
        for (int i=0 ; i<size ; i++){
            if (arr[i] == value){
                counter = i;
            }
        }

        if (counter == -1){
            System.out.println("Value not valid!");
        }else {
            for (int j=counter ; j<size ; j++){
                arr[j] = arr[j+1];
            }
            size--;
        }


        for (int i=0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
}
