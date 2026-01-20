package Sliding_Window.Variable_Size_Window;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean flag = false;
       for (int i=0 ; i<nums.length ; i++){
           for (int j=i+1 ; j<nums.length ; j++){
               if (nums[i] == nums[j] && Math.abs(i-j) <= k) {
                   flag = true;
                   break;
               }
           }
           if (flag)
               break;
       }
        System.out.println(flag);
    }
}
