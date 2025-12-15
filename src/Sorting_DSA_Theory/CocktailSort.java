package Sorting_DSA_Theory;

import java.util.Random;

public class CocktailSort {
    public static void cocktailSort(int[] arr){
        boolean swapped;
        int start = 0;
        int end = arr.length - 1;
        do {
            swapped = false;
            for (int j=start ; j < end ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            end--;
            if (!swapped){
                break;
            }
            swapped = false;
            for (int j= end - 1 ;  j >= start ; j--){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            start++;

        } while (swapped);
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[10];

        for (int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(100);
        }

        //array before sort
        for (int array : arr){
            System.out.print(array + ", ");
        }

        cocktailSort(arr);

        System.out.println(" ");
        //array before sort
        for (int array : arr){
            System.out.print(array + ", ");
        }

    }
}
