package Sorting_DSA_Theory;

public class BubbleSort {
    public static void bubbleSort(int[] arr){

        for (int i=0 ; i<arr.length-1 ; i++){
            boolean swapped = false;
            for (int j=0 ; j<arr.length-1-i ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};

        //Array before sort
        for (int array : arr){
            System.out.print(array+", ");
        }

        bubbleSort(arr);
        System.out.println("");
        //Array after sort
        for (int array : arr){
            System.out.print(array+", ");
        }


    }
}
