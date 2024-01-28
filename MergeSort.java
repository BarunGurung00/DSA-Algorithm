public class MergeSort {
    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(array);
 
        for(int i: array){ 
            System.out.print(i+" ");
        }
    }

    public static void mergeSort(int[] arr){ 
        int length = arr.length;
        if(length <=1) return;//base case

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for(int i=0,j=0; i< length; i++){
            if(i<middle){
                leftArray[i] = arr[i];
            }else{
                rightArray[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);

    }

    public static void merge(int[] leftArray, int[] rightArray, int[] arr) { 
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0; // index for arr, leftArray, and rightArray
    
        while (l < leftSize && r < rightSize) { 
            if (leftArray[l] < rightArray[r]) {
                arr[i] = leftArray[l];
                i++;
                l++;
            } else {
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }
        // Copy remaining elements of leftArray if any
        while (l < leftSize) {
            arr[i] = leftArray[l];
            i++;
            l++;
        }
        // Copy remaining elements of rightArray if any
        while (r < rightSize) {
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }
    
}
