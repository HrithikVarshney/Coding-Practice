package Arrays;

import java.util.Arrays;

public class firstLastOccurence {
    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;

        /*int [] res = bruteForce(arr,target);
        System.out.println(Arrays.toString(res));*/

        int [] check = optimisedApproach(arr, target);
        System.out.println(Arrays.toString(check));


    }

    static int[] optimisedApproach(int[] arr , int target ){

        int [] ans = {-1,-1};

        ans[0]= search(arr,target,true);

        if(ans[0]!=-1){
              ans[1]= search(arr,target,false);
        }

        return ans;


    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //we got the potential answer but it may not be the right answer
                ans = mid;
                // we will check if there is another instance of target present in left side of the array
                if(findStartIndex){
                    end = mid-1;
                }
                //it will find out last occurrence of the target
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }



    static int[] bruteForce(int[] arr , int target){
        int start = -1;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                start = i ;
                break;
            }
        }
        int end = arr.length-1;
        for(; end>=0 ; end--){
            if(target == arr[end]){
                break;
            }
        }
        return new int[]{start,end};
    }
}
