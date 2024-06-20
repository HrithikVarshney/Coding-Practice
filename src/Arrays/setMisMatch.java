package Arrays;
import java.util.*;
public class setMisMatch {

    public static void main(String[] args) {
        int[]arr = {4,1,2,3,1};
        List<Integer> res = setMisMatch.repeatMissing(arr);
        System.out.println(res);
    }
    static List<Integer> repeatMissing(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int currentIndex = arr[i] -1;
            if(arr[i] != arr[currentIndex]){
                swapIndex(arr,i,currentIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0 ; index<arr.length ; index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swapIndex(int[] arr , int i , int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
