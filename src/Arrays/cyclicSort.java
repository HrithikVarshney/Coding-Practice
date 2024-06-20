package Arrays;
import java.util.*;



public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[]arr){
        int i = 0;
        while(i<arr.length){
            int current = arr[i] - 1;
            if(arr[i] != arr[current]){
                swap(arr , i , current);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int current) {
        int temp = arr[i];
        arr[i] = arr[current];
        arr[current] = temp;
    }
}
