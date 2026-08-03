package TwoPointers;

public class Container_with_most_water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int output = 0;

        // for(int i=0 ; i<height.length-1 ; i++){

        //     for(int j=i+1 ; j<height.length ; j++){
        //         int length = Math.min(height[i], height[j]);
        //         int width = j - i;
                
        //         int total = length*width;

        //         output = Math.max(output, total);

        //     }
        // }

        int left = 0;
        int right = height.length-1;

        while (left < right) {

            int length = Math.min(height[left], height[right]);
            int width = right - left;
                
            int total = length*width;

            output = Math.max(output, total);

            if (height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }

        System.out.println(output);
    }
}
