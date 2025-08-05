package Sliding_Window;

import java.util.ArrayList;

public class First_Negative_Number_Size_K {
    public static void main(String[] args) {
        int[] arr = {-12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int negNum = 0;
        int i=0;
        int j=0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (j < arr.length){
            if (arr[j] < 0){
                arrayList.add(arr[j]);
            }
            int window = j - i + 1;
            if (window < k){
                j++;
            } else if (window == k) {
                if (!arrayList.isEmpty()){
                    int number = arrayList.get(0);
                    System.out.println(number);
                }else
                    System.out.println(0);
                if (!arrayList.isEmpty() && arr[i] == arrayList.get(0)){
                    arrayList.remove(0);
                }
                i++;
                j++;
            }
        }
    }
}
