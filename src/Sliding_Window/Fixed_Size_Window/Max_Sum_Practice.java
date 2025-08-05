package Sliding_Window;

public class Max_Sum_Practice {
    public static void main(String[] args) {
        int[] arr2 = {2,5,1,8,2,9,1};
        int k = 3;
        int sum = 0;
        int Maximum = 0;
        int i=0;
        int j=0;

        while (j < arr2.length){
            int window = j - i +1;
            sum = sum + arr2[j];
            if (window < k){
                j++;
            } else if (window == k) {
                Maximum = Math.max(Maximum,sum);
                sum = sum - arr2[i];
                i++;
                j++;
            }
        }
        System.out.println(Maximum);
    }
}
