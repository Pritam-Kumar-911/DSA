import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ",arr[i]);
        }
        System.out.println("");
        System.out.println("Array after sorting");
        for (int i=0 ; i<arr.length - 1 ; i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ",arr[i]);
        }
    }
}
