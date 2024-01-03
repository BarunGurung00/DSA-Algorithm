public class SelectionSort {
    public static void main(String[] args){

        int[] array = { 1, 6, 3, 8, 2, 4, 9, 5, 7, 0 };
        selectionSort(array);
        for(int i: array){
            System.out.print(i+" ");
        }
    }

    //Selection sort search through min value and keep swapping with first element of the array;
    //Time complexity: O(n^2)

     public static int[] selectionSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int min = i;
            for(int j= i + 1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
     }
}
