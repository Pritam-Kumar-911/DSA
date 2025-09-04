package Two_Pointer;

public class practice {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        for(int j=m ; j<nums1.length; j++){
            nums1[j] = nums2[j-m];
        }
        System.out.println();
        for(int i =0 ; i< nums1.length -1; i++){
            for (int j=0 ; j<nums1.length -i- 1 ; j++){
                if (nums1[j] > nums1[j+1]){
                    int temp;
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        for(int num : nums1){
            System.out.printf("%d, " , num);
        }
    }
}
