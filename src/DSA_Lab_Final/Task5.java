package DSA_Lab_Final;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void SelectionSort(int[] arr){
        for (int i=0 ; i<arr.length ; i++){
            int small = arr[i];
            int loc = i;
            for (int j=i+1 ; j<arr.length ; j++){
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
    public static void BinarySearch(int[] arr , int key){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == key){
                System.out.println("Key Found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            }else
                high = mid - 1;
        }
        System.out.println("Key not Found!");
    }

    public static void main(String[] args) {
        int[] arr = {23,56,33,21,87,57,43,99};

        //before sort
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        BinarySearch(arr , 99);
        //after sort
        System.out.println(Arrays.toString(arr));
    }
}
