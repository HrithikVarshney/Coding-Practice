package Arrays;

import java.util.*;

public class rowColumnSorted {

    public static void main (String[] args){

        int[][] arr = {
                {10,20,30,40,50},
                {15,25,35,45,55},
                {17,27,37,47,57},
                {19,29,38,49,59}
        };

        //to print 2d arrays
        for(int[] elements : arr)
          System.out.println(Arrays.toString(elements));

        int target = 29 ;

        int[] ans = binarySearch(arr,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] binarySearch(int[][] arr , int target ){

        int rows = 0;
        int cols = arr.length-1;


        while(rows <= arr.length-1 && cols>=0){

            if(arr[rows][cols] == target)
                return new int[]{rows,cols};
            else if (arr[rows][cols]<target)
                rows++;
            else
                cols--;

            }

        return new int[]{-1,-1};
        }
    }

