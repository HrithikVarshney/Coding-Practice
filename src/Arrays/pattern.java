package Arrays;

import java.sql.SQLOutput;

public class pattern {
    public static void main(String[] args) {

        /*
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *

         */

        for(int rows = 1 ; rows <= 9;rows++){

            if(rows<=5){
                for(int x = 1; x<=rows;x++){
                    System.out.print("* ");
                }
            }
            else{
                for(int y = 1 ; y<=2*5-rows;y++){
                    System.out.print("*  ");
                }
            }

            System.out.println();
        }


    }

}
