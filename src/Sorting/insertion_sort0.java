package Sorting;

public class insertion_sort0 {
    public static void main(String[] args) {
        int[] arr = {3,1,8,6,2};

        for (int i=1 ; i< arr.length ; i++){
            int currentNum = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentNum){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentNum;
        }
        for (int num : arr){
            System.out.printf("%d, " , num);
        }
    }
}
