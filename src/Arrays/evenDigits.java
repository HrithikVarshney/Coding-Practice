package Arrays;

public class evenDigits {
    public static void main(String[] args) {

        int [] arr = {23 , 4878 , 637 , 3 , 10 , -221 , 0  , 333};

        int ans = evenDigitsNumbers(arr);
        // we will print total no of elements having even no. of digits
        System.out.println(ans);
    }

    // we can use Math.log10(number)+1 to count no. of digits in a number
    static int evenDigitsNumbers(int[] arr){
        int count = 0 ;

        for(int element :  arr){
            if(even(element)){
                count++;
            }
        }
        return count;
    }


    static boolean even(int number){

        if(number == 0){
            return false;
        }

        if(number < 0){
            number *= -1;
        }

        int count = 0 ;
        while(number>0){
            count++;
            number /= 10;

        }
        return count % 2 == 0;
    }
    static int countEvenNoOfDigits(int[] arr){

        int count = 0;
        for (int j : arr) {
            String digit = Integer.toString(j);
            int length = digit.length();
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
