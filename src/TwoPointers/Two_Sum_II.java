package TwoPointers;

public class Two_Sum_II {
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;

        int left = 0;
        int right = numbers.length - 1;
        int[] arr = new int[2];

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
            else if(numbers[left] + numbers[right] > target){
                right--;
            }
            else{
                left++;
            }
                
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
