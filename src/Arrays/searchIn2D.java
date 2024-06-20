package Arrays;

import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {21 , 34 , 19 , 90},
                {92 , 12 , 60},
                {12 , 40 , 24 , 76 , 108},
                {0 , 3 }
        };

        int target = 0;
        int[] ans = linearSearch(arr , target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] arr, int target){

        for(int rows = 0; rows < arr.length ; rows++){
            for(int cols = 0 ; cols < arr[rows].length  ; cols++){
                if(arr[rows][cols] == target){
                    // here new int is added because we are returning an array and
                    // arr is not initialised within this linear search function
                    // so we have create new object pointing to this 1d array
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
