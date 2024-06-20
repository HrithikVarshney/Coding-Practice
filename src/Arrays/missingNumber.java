package Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[]arr = {1,0,3,2};
        int ans = missing(arr);
        System.out.println(ans);
    }


    static int missing(int[]arr){

        int i =0 ;
        while(i<arr.length){
            int current = arr[i];
            //number should be less the array size and if arr[i]!=arr[arr[i]]
            //then swap both numbers
            if( arr[i]<arr.length && arr[i] != arr[current]){
                swap(arr , i , current);
            }
            else{
                i++;
            }
        }

        for(int index = 0 ; index <arr.length ; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;

    }

    private static void swap(int[] arr, int i, int current) {
        int temp = arr[i];
        arr[i] = arr[current];
        arr[current] = temp;
    }
}
