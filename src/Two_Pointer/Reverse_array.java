package Two_Pointer;

public class Reverse_array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

        int left = 0;
        int right = array.length-1;
        while (left < right){
            int temp;
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int i=0 ; i< array.length ; i++){
            System.out.printf("%d, ",array[i]);
        }
    }
}
