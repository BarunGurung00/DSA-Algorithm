public class QuickSort {
    public static void main(String[] args) {

        // Quick sort is an recursive algorithm where we divide the array into two parts
        // and the put the
        // smaller elements to the left and larger elements to the right of pivot
        // The time complexity of quick sort is O(nlogn) and the space complexity is
        // O(logn)

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        quickSort(array, 0, array.length - 1);
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {

        if (end <= start)
            return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);

    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
