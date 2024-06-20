package Arrays;
import java.util.*;
//LINK: https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class allMissingNumbers {

    public static void main(String[] args) {
        int[]arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = allMissingNumbers.logic(arr);
        System.out.println(ans);
    }


    public static List<Integer> logic(int[] arr){

        int i = 0 ;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex])
                swapIndex(arr,i,correctIndex);
            else
                i++;
        }

        List<Integer> res = new ArrayList<>();

        for(int index = 0 ; index<arr.length ; index++){
            if(arr[index] != index+1)
                res.add(index+1);
            else
                index++;
        }
        return res;
    }


    static void swapIndex(int[] arr , int i , int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
