package Two_Pointer;

public class sum_of_pair {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,8,9};
        int target = 12;

        int left = 0;
        int right = arr.length-1;

        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                System.out.println("{"+arr[left]+","+arr[right]+"}");
                break;
            } else if (sum < target) {
                left++;
            }
            else
                right++;
        }
    }
}
