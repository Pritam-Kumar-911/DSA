public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {3,7,8,2,9};

        for(int i=0 ; i<arr1.length - 1 ; i++){
            int small = i;
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[j] < arr1[small]){
                    small = j;
                }
            }
            int temp = 0;
            temp = arr1[small];
            arr1[small] = arr1[i];
            arr1[i] = temp;
        }
        for (int num : arr1){
            System.out.printf("%d , ",num);
        }
    }
}
