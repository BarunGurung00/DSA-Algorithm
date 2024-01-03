public class InterpolationSearch {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = interpolationSearch(array, 10);

        if(index == -1) System.out.println("The element is not present in the array");
        else System.out.println("The element is present at index: "+index+" in the array");
    }


    //contrary to binary search, in interpolation search we don't divide and the conquer instead we use a formula to find the index of the closest element to the target value
    public static int interpolationSearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;
    
        while(value >=arr[low] && value <= arr[high] && low <= high){

            int possibility = low + ((value - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            
            if(arr[possibility] == value) return possibility;

            else if(arr[possibility] < value){
                low = possibility + 1;  
            } 
            else {
                high = possibility - 1;
            }
        }

        return -1;
    }
}
