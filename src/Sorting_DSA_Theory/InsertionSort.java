package Sorting_DSA_Theory;

import java.util.Random;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i=1 ; i<arr.length ; i++){
            int swap = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > swap){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = swap;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(100);
        }

        //array before sort
        for (int array : arr){
            System.out.print(array + ", ");
        }

        System.out.println(" ");
        insertionSort(arr);

        //array after sort
        for (int array: arr){
            System.out.print(array + ", ");
        }
    }
}
