package DSA_Lab_Final;

import java.util.Arrays;

public class SortingPrac {
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int bound = low - 1;
        for (int j=low ; j<high ; j++){
            if (arr[j] < pivot){
                bound++;
                int temp = arr[bound];
                arr[bound] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[bound+1];
        arr[bound+1] = temp;

        return bound+1;
    }
    public static void quickSort(int[] arr , int low , int high){
        if (low >= high){
            return;
        }
        int pivotIndex = partition(arr , low , high);
        quickSort(arr , low , pivotIndex - 1);
        quickSort(arr , pivotIndex + 1 , high);
    }
    public static void main(String[] args) {
        int arr[] = {34,67,22,12,89};
        System.out.println(Arrays.toString(arr));
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
