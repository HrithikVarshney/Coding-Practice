package Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int [] arr = {2,4,8,10,12,14,16,18};
        int target = 15;
        int index = binSearch(arr,target);
        System.out.println(index);


    }

    static int binSearch(int[] arr , int target){

        int start = 0 ;
        int end = arr.length-1;

        while(start<end){

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

        return end ;
    }
}
