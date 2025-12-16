package Sorting_DSA_Theory;

import java.awt.desktop.AboutEvent;
import java.util.Random;

public class QuickSort {
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
    public static void quickSort(int[] arr , int low , int high){
        if (low >= high){
            return;
        }
        int pivotIndex = partition(arr , low , high);
        quickSort(arr , low , pivotIndex - 1);
        quickSort(arr , pivotIndex+1 , high);

    }
    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(100);
        }

        //array before sorting
        for (int array : arr){
            System.out.print(array + ", ");
        }
        quickSort(arr , 0 , arr.length-1);
        System.out.println(" ");
        //array after sorting
        for (int array : arr){
            System.out.print(array + ", ");
        }
    }

}
