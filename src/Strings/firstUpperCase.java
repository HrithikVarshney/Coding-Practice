package Strings;

public class firstUpperCase {

    public static void main(String[] args) {
        String str = "hi, i am hrithik varshney";
        StringBuilder newStr = new StringBuilder();
        newStr.append(Character.toUpperCase(str.charAt(0)));


        for(int i=1;i<str.length();i++){

            if(str.charAt(i) == ' ' &&  i< str.length()-1){
                newStr.append(str.charAt(i));
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                newStr.append(str.charAt(i));
            }
        }

        System.out.println(newStr);

    }


}
