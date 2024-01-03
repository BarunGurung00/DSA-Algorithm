public class BubbleSort {
    public static void main(String[] args){
        int  arr [] = {3 , 5, 12, 9, 1, 2, 4, 6, 8, 7};
        
        bubbleSort(arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static int[] bubbleSort(int[] array){
        for(int i=0; i< array.length -1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        return array;
    }
}
