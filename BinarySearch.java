public class BinarySearch {
    public static void main(String[] args){
        
        //Binary search algorithm is logarithmic in time complexity O(log n) as the data increases the time complexity increases logarithmically,
        //It works on the sorted array where it divides the array into two parts and then search for the element in the array. 
        //it checks if it is equal to the middle value is not then it checks is it is greater or smaller, if greater then it checks the right part of the array and if smaller then it checks the left part of the array.
   
        int[] arr =  new int[100];
         int target = 1;
         
         for(int i=0; i<arr.length; i++){
             arr[i] = i+1;
         }

         int result = binarySearch(arr, target);
         if(result == -1) System.out.println("The element is not present in the array");
         else System.out.println("The element is present at index: "+result+" in the array");
         
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
