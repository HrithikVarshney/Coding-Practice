package Arrays;
import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[] arr){
        //for checking if array is already sorted
        boolean swapped;

        //for each pass one loop will run
        for(int i = 0 ; i <arr.length ;i++){
            //no swapping done till now
            swapped = false;
            // j<arr.length-i because we dont have to compare to those
            // which are already in sorted array after a pass
            for(int j = 1 ; j<arr.length - i ; j++){
                if(arr[j]< arr[j-1]){
                    //swap those numbers
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
