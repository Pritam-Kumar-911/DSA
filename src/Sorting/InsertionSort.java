public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Current element to insert
            int j = i - 1;

            // Move elements greater than key one step ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Insert key at correct position
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
