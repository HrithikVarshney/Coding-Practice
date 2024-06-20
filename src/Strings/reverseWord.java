package Strings;

import java.util.Arrays;

public class reverseWord {
    public static void main(String[] args) {

        String str = "hello world";
        String newStr = "";

        String [] words = str.split(" ");

        for(int i = 0 ; i< words.length ;i++){
            newStr += reverse(words[i]) + " ";
        }
        System.out.println(newStr);
    }

    static String reverse(String str){
        String reverseStr = "";
        for(int i = str.length()-1 ;i>=0;i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
