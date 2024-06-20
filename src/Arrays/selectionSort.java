package Arrays;
import java.util.*;
public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {25,7,1,9,14,0,-45,23,-78};
        selectionIdea2(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selectionIdea2 (int[] arr){

        for(int i = 0 ; i <arr.length-1 ;i++){
            int minIndex = i ;
            for(int j = i+1 ; j<arr.length ;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap both numbers
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }


    }
    static void selectionIdea1(int[] arr){

        for(int i = 0 ; i< arr.length ; i++){
            //find max element in remaining array and swap with its correct index
            int last = arr.length - i -1;
            int maxIndex = findMaxIndex(arr ,0, last);
            swapFunction(arr,maxIndex,last);
        }

        }
        static int findMaxIndex(int [] arr , int start , int end){
        int max = start;
            for (int i = start ; i<=end; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
        return max;
    }

    static void swapFunction(int[] arr ,int first , int second){
        int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }


}
