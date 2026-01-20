package Sorting;

public class Sorting_practice1 {
    public static void main(String[] args) {
       int[] arr = {6,2,7,4,1,9};

       for(int i=0 ; i< arr.length - 1 ; i++){
           int smallest = i;
           for (int j = i+1; j < arr.length; j++) {
               if (arr[smallest] > arr[j]){
                   smallest = j;
               }
           }
           int temp;
           temp = arr[i];
           arr[i] = arr[smallest];
           arr[smallest] = temp;
       }
       for (int array : arr){
           System.out.printf("%d, " , array);
       }
}
}
