package Array2D_DSATheory_Lec2;

public class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] arr = {3,45,67,78,88};
        //int result = binarySearch.binarySearch(arr,88);
        //System.out.println(result);

        int result = binarySearch.RecursiveBinarySearch(arr,0,arr.length-1,78);
        System.out.println(result);
    }
}
