package Arrays;

public class searchInRotatedSortedArray {

    public static void main(String [] args){

        int [] arr = {3,4,5,6,7,0,1,2};
        int ans = search(arr , 1 );
        System.out.println(ans);
    }

    static int search(int[] arr , int target){
        int pivot = RBS(arr);
        //if array is not rotated this means there is no pivot(peak) element
        if(pivot == -1){
            return binSearch(arr , target , 0 , arr.length-1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binSearch(arr,target,0, pivot-1);
        }

        return binSearch(arr,target,pivot+1,arr.length-1);
    }


    static int binSearch(int[] arr , int target , int start , int end){

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
    static int RBS(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int mid = start + (end-start)/2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            //case 2
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //case 3
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        } 
        return -1;
    }
}


