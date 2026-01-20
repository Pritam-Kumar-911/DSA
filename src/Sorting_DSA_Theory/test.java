package Sorting_DSA_Theory;

public class test {
    public static void sort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int boundary = partition(array, start, end);
        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++)
            if (array[i] <= pivot) {
                boundary++;
                swap(array, i, boundary);
            }
        return boundary;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3};
        sort(numbers, 0, numbers.length - 1);
        for (int index : numbers){
            System.out.println(index + ", ");
        }
    }

}
