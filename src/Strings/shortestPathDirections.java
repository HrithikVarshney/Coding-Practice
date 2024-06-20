package Strings;

public class shortestPathDirections {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for(int i= 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'W'){
                x = x-1;
            } else if (ch == 'N') {
                y = y+1;
            } else if (ch == 'E') {
                x = x+1;
            }
            else{
                y = y-1;
            }
        }

        double shortestPath = Math.sqrt(x*x + y*y);
        System.out.println(shortestPath);
    }
}
