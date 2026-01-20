package Array2D_DSATheory_Lec2;

import java.util.Scanner;

public class Question3_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int size = 5;
        int[] arr = new int[size];
        int lb = 0;
        int up = arr.length - 1;
        int count = 0;

        System.out.println("Enter Elements of Array :");
        for (int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Key to Find: ");
        int key = sc.nextInt();
        while (lb <= up){
            int mid = (lb + up)/2;

            if (arr[mid] == key){
                System.out.println("Element Found at Index "+mid);
                break;
            } else if (arr[mid] > key) {
                up = mid - 1;
            }else {
                lb = mid + 1;
            }
            count++;
        }
        System.out.println("No of Iteration Performed During search: "+count);

        for (int show : arr){
            System.out.print(show + ", ");
        }


    }
}