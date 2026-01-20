package Sorting_DSA_Theory;

import java.util.Arrays;

public class BinarySearchPrac {
    public static void quickSort(int[] arr , int low , int high){
        if (low >= high){
            return;
        }
        int pivotIndx = partition(arr , low , high);
        quickSort(arr , low , pivotIndx - 1);
        quickSort(arr , pivotIndx + 1 , high);
    }
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int bound = low-1;
        for (int i=low ; i<high ; i++){
            if (arr[i] < pivot){
                bound++;
                int temp = arr[i];
                arr[i] = arr[bound];
                arr[bound] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[bound+1];
        arr[bound+1] = temp;
        return bound+1;
    }
    public static void BinarySearch(int[] arr , int key){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int middle = low + (high - low) /2;
            if (arr[middle] == key){
                System.out.println("Key is Found at: " + middle);
                return;
            } else if (arr[middle] < key) {
                low = middle + 1;
            }
            else
                high = middle - 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {67,34,89,21,67,22};
        System.out.println(Arrays.toString(arr));
        quickSort(arr , 0 , arr.length-1);
        BinarySearch(arr , 89);
        System.out.println(Arrays.toString(arr));
    }
}
