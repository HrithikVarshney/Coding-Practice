package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class highestOccurences {

    public static void main(String[] args) {

        String  str = "ababcdefsdbecadsa";
        HashMap<Character , Integer> countChar = new HashMap<>();

        for(int i = 0 ; i<str.length(); i++){
            if(countChar.containsKey(str.charAt(i))){
                int count = countChar.get(str.charAt(i));
                countChar.put(str.charAt(i) , ++count);
            }
            else{
                countChar.put(str.charAt(i),1);
            }
        }


    }
}
