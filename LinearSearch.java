public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {3,8,2,1,0,9,5,4,7,6};
        int index =  linearSearch(arr, 5);

        if(index !=-1){
            System.out.println("The element is present at index: "+index);  
        }else {
            System.out.println("The element is not present in the array");
        }
    }

    //LinearSearch algorithm is linear in time complexity as the data increases the time complexity increases linearly,
    public static int linearSearch(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==num){
                return i;
            }           
        }
        return -1;
    }
}
