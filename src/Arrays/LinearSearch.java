package Arrays;

import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] arr = {23 , 48 , 67 , 3 , 108 , -22 , 0 , 33};
        System.out.println(Arrays.toString(arr));
        int target = in.nextInt();
        int index  = linear_Search(arr,target);
        System.out.println(index);
        int ans = linear_Search2(arr , target , 1 ,4);
        System.out.println(ans);
        int result  = minElement(arr);
        System.out.println(result);
        int answer = maxElement(arr);
        System.out.println(answer);


        String name = "Hrithik";
        char check = 't' ;

        System.out.println(Arrays.toString(name.toCharArray()));
        int res = linear_Search3(name , check);
        System.out.println(res);





    }
    static int maxElement(int[] arr){

        if(arr.length==0){
            return -1;
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int minElement(int[] arr){

        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int linear_Search3(String name , char value ){
        if(name.isEmpty()){
            return -1;
        }
        for(int i = 0; i<=name.length();i++){
            if(value == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static int linear_Search2(int[] arr , int value , int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<=end;i++){
            if(value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    static int linear_Search(int[] arr , int value ){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i< arr.length;i++){
            if(value == arr[i]) {
                return i;
            }
        }
        return -1;
    }


}
