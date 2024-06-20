package Strings;
import java.util.*;

public class possibleSubstrings {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String str = "java";


        for(int startIndex = 0 ; startIndex<str.length() ;startIndex++){
            for(int endIndex = startIndex ; endIndex<=str.length();endIndex++){
                System.out.print(str.substring(startIndex,endIndex)+" ");
            }


        }

//        for(int i=str.length()-1 ; i>=0 ; i--){
//            System.out.println(str.substring(i));
//        }
//        for(int i=0 ; i<str.length() ; i++){
//            System.out.println(str.substring(i));
//        }




    }
}
