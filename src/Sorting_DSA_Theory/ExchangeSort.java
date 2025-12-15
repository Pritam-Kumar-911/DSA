package Sorting_DSA_Theory;

import java.util.Random;

public class ExchangeSort {
    public static void exchangeSort(int[] arr){
        for (int i=0 ; i<arr.length-1 ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i=0 ; i< arr.length ; i++){
            arr[i] = random.nextInt(100);
        }

        //array before sort
        for (int array : arr){
            System.out.print(array + ", ");
        }

        exchangeSort(arr);

        //after sort
        System.out.println(" ");
        for (int array : arr){
            System.out.print(array + ", ");
        }

    }
}
