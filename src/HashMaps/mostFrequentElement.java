package HashMaps;
import java.util.*;
public class mostFrequentElement {
    public static void main(String[] args) {


        int [] arr = {1,3,2,1,1,4,2,1,1,4};
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int element : arr){
            if(!mp.containsKey(element)){
                mp.put(element , 1);
            }
            else{
                mp.put(element, mp.get(element) + 1);
            }
        }

        System.out.println(mp.entrySet());
        int mxvalue = -1 , ansKey = 0 ;
        int sum = 0 ;

        for(Map.Entry<Integer,Integer> element : mp.entrySet()){
            if(element.getValue() > mxvalue){
                mxvalue = element.getValue();
                ansKey = element.getKey();

            }
        }

        System.out.printf("%d element is occuring %d times" , ansKey, mxvalue );


    }
}
