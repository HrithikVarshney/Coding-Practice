package Arrays;

import java.util.Arrays;

public class searchInSortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };

        int target = 16;
        int[] ans = searchInMatrix(arr,target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] searchInMatrix(int[][]arr , int target){

        if(arr.length == 0) {
            return new int[]{-1, -1};
        }
        int rows = arr.length;
        int cols  = arr[0].length;

        int start = 0 ;
        int end = (rows*cols) -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            int rowIndex = mid/cols;
            int colIndex = mid%cols;
            if(arr[rowIndex][colIndex] == target){
                return new int[]{rowIndex,colIndex};
            }
            if(arr[rowIndex][colIndex] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return new int[]{-1,-1};
    }
}
