package Arrays;

public class infiniteArray {
    public static void main(String[] args) {

        int[] arr = {2,3,4 ,8,8,10,14,16,
                19,23,35,56,78,78,80,93,108};
        int target = 78;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int [] arr, int target){

        int start = 0;
        int end = 1;

        //condition for target to lie in range
        while(target > arr[end]){
            //start value will be just one index ahead of last end pointer value
            int temp = end + 1;

            // new end pointer will be previous end pointer value + double the previous window size
            end= end + (end-start+1)*2;
            start = temp;
        }

        return search(arr,target,start,end);
    }

    static int search(int[] arr , int target , int start , int end){
        while(start<=end){

            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}


