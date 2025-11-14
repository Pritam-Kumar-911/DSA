package Array2D_DSATheory_Lec2;

public class LinerSearch {
    public int Lsearch(int[] arr , int value){
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int RecursiveLSearch(int[] arr , int i , int value){
        if (i>arr.length-1){
            return -1;
        } else if (arr[i] == value) {
            return i;
        }else {
            return RecursiveLSearch(arr,i+1,value);
        }

    }
}
