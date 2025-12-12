package Sorting_DSA_Theory;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i=0 ; i<arr.length - 1 ; i++){
            int small = arr[i];
            int loc = i;
            for (int j=i+1 ; j<arr.length - 1 ; j++){
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
        int[] arr = {67,44,34,22,89,99};

        //array before sort
        for (int array: arr){
            System.out.print(array + ", ");
        }

        selectionSort(arr);
        System.out.println(" ");
        //array after sort
        for (int array: arr){
            System.out.print(array + ", ");
        }

    }
}
