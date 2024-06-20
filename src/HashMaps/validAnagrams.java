package HashMaps;
import java.util.*;
public class validAnagrams {

    static HashMap<Character,Integer> makeMap(String str){

        HashMap<Character , Integer> mp = new HashMap<>();
        for(char ch : str.toCharArray()){

            if(!mp.containsKey(ch)){
                mp.put(ch , 1);
            }
            else{
                mp.put(ch , mp.get(ch) + 1);
            }
        }
        return mp;
    }


    static boolean checkAnagram(String str1 , String str2){

        if(str1.length()!=str2.length()) return false;

        HashMap<Character , Integer> mp1 = makeMap(str1);
        HashMap<Character , Integer> mp2 = makeMap(str2);

        return mp1.equals(mp2);
    }


    public static void main(String[] args) {

        //Anagrams: Two strings are called anagrams if characters of
        // 1st string can be reassembled to get the 2nd string
        //if length of two strings are not equal then they are not anagrams
        //eg: silent , listen are anagrams
        //eg: knee , keen are anagrams
        //eg: world , hello are not anagrams

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(checkAnagram(str1,str2));
    }


}
