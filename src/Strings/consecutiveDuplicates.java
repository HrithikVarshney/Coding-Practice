package Strings;

public class consecutiveDuplicates {

    public static void main(String[] args) {

        String str = "aaabbccccdd";
        String sample = "";

        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) == str.charAt(i+1)){

            }
            else{
                sample += str.charAt(i);
            }
        }

        System.out.println(sample);


    }


}
