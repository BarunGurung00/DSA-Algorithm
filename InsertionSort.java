public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 9, 8, 4, 8, 2 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // The insertion sort algorithm sorts an array by inserting elements one by one by comaaring elements on the left and shifts them right if they are greater than the current element.
    // Less efficient than bubble sort and selection sort.
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
