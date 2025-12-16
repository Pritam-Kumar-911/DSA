package Sorting_DSA_Theory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void sort(int[] arr){
        if (arr.length < 2){
            return;
        }
        int middle = arr.length/2;
        int[] left = new int[middle];
        for (int i=0 ; i<middle ; i++){
            left[i] = arr[i];
        }
        int[] right = new int[arr.length - middle];
        for (int i=middle ; i<arr.length ; i++){
            right[i - middle] = arr[i];
        }
        sort(left);
        sort(right);
        merge(left , right , arr);
    }

    public static void merge(int[] left , int[] right , int[] result){
        int i=0 , j=0 , k=0;
        while (i < left.length && j< right.length){
            if (left[i] <= right[j]){
                result[k++] = left[i++];
            }else
                result[k++] = right[j++];
        }
        while (i<left.length){
            result[k++] = left[i++];
        }
        while (j<right.length){
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
