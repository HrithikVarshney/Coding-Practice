package Strings;

public class palindromeStrings {
    public static void main(String[] args) {
        String str = "racecars";
        boolean status = true;

        //approach 1
      /*  for(int i = 0 ; i<str.length()/2 ;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                status =  false;
            }
        }*/

        //approach 2
        /*
           int start = 0;
           int end = str.length()-1;

           while(start<=end){
           char a = str.charAt(start);
           char b = str.charAt(end);
           if(a==b){
               start++;
               end--;
           }
           else {
               status = false;
               break;
           }
       }*/



        //System.out.println(status);

        //approach 3
        //create a reverse string of original string and check it using equalsto function

        String reverseStr = "";
        for(int i = str.length()-1 ; i>=0 ;i--){
            reverseStr += str.charAt(i);
        }

        if(reverseStr.equals(str)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not Pallindrome");
        }
    }
}
