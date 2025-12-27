package DSA_Lab_Final;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void quickSort(int[] arr , int low , int high){
        if (low > high){
            return;
        }
        int pivotIndex = partition(arr , low , high);
        quickSort(arr , low , pivotIndex - 1);
        quickSort(arr , pivotIndex+1 , high);
    }
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int boundary = low - 1;
        for (int i=low ; i<=high ; i++){
            if (arr[i] <= pivot){
                boundary++;
                swap(arr , i , boundary);
            }
        }
        return boundary;
    }
    public static void swap(int[] arr , int value1 , int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
    public static void linearSearch(int[] arr, int key){
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] == key){
                System.out.println("key Found!");
                return;
            }
        }
        System.out.println("Key Not Found!");
    }

    public static void main(String[] args) {
        int[] arr = {23 , 45, 66, 21 , 11 , 78 , 54 , 3};
        System.out.println("Array before Sort: ");
        System.out.println(Arrays.toString(arr));

        quickSort(arr , 0 , arr.length - 1);

        System.out.println("Array after Sort: ");
        System.out.println(Arrays.toString(arr));

        linearSearch(arr , 45);

    }
}
