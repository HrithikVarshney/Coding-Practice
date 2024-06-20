package HashMaps;

import java.util.HashMap;

public class isomorphicStrings {

    static boolean checkIsomorphic (String str1 , String str2){

        HashMap<Character,Character> mp = new HashMap<>();

        for(int i = 0 ; i<str1.length() ; i++){
            Character str1Ch = str1.charAt(i);
            Character str2Ch = str2.charAt(i);

            //agar str1 ka character already hai map mai toh
            if(mp.containsKey(str1Ch)){
                if(mp.get(str1Ch) != str2Ch) {return false;}
            }
            else if(mp.containsValue(str2Ch)){
                    return false;
            }
            else{
                    mp.put(str1Ch,str2Ch);
                }
            }

        return true;
    }

    public static void main(String[] args) {

        //Isomorphic : two strings are called isomorphic
        // if the characters in 1st strings can be replaced to get 2nd string
        //all occurrences of a character must be replaced with another character
        //while preserving the order of characters
        //No two character should be mapped to same character ,
        // but a character may map to itself

        System.out.println(checkIsomorphic("aabd","xxyx"));
    }
}
