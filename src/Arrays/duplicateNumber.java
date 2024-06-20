package Arrays;
import java.util.*;
public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4};
        int repeated = dupFunction(arr);
        System.out.println(repeated);
    }

    static int dupFunction(int[] arr){

        int i = 0 ;
        while(i<arr.length){
            //first check , if element is present on its correct position or not
            //then use cyclic sort otherwise move forward
            // element will be i+1
           if(arr[i] != i+1) {
               int correctIndex = arr[i] - 1;
               if (arr[i]!=arr[correctIndex]){
                   swapIndex(arr,i,correctIndex);
               }
               //will return duplicate number if number didn't get swapped
               else{
                   return arr[i];
               }
           }
           else {
               i++;
           }

        }
        return -1;
    }
    static void swapIndex(int[] arr , int i , int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
