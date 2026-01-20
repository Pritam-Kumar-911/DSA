package Sorting_DSA_Theory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Practice {
    public static void InsertionSort(int[] arr){
        for (int i=0 ; i<arr.length -1; i++){
            int small = arr[i];
            int loc = i;
            for (int j=i+1 ; j<arr.length -1; j++){
                if (arr[j] < small){
                    small = arr[j];
                    loc = j;
                }
            }
            if (loc != i){
                int temp = arr[i];
                arr[i] = arr[loc];
                arr[loc] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
