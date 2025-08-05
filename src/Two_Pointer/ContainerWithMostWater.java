package Two_Pointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
//        Brute-Force Method
//        for(int i=0 ; i< height.length ; i++){
//            for (int j=i+1 ; j<height.length ; j++){
//                int width = j - i;
//                int length = Math.min(height[i] , height[j]);
//                int Area = length * width;
//                maxArea = Math.max(maxArea , Area);
//            }
//        }
//        System.out.println(maxArea);

        //Two-Pointer Method
        int i=0;
        int j= height.length -1 ;
        while( i < j){
            int width = j - i;
            int length = Math.min(height[i] , height[j]);
            int Area = length * width;
            maxArea = Math.max(maxArea , Area);
            if (height[i] < height[j]){
                i++;
            }
            else
                j--;
        }
        System.out.println(maxArea);
        Arrays.sort(height);
        for(int n : height){
            System.out.printf("%d" , n);
        }
        int[] target = new int[10];
    }

}
