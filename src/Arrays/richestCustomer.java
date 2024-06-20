package Arrays;

public class richestCustomer {
    public static void main(String[] args) {

        int [][] arr = {
                {2,1,4},
                {1,2,1},
                {3,0,9}
        };

        int maxSum = Integer.MIN_VALUE;
        for ( int[] rows : arr){

            int rowSum =  findSum(rows);

            if(maxSum<rowSum){
                maxSum = rowSum;
            }

        }

        System.out.println(maxSum);

    }

    static int findSum (int[] arr){
        int sum = 0 ;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }



}
