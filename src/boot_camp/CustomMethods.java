package boot_camp;

import java.util.Arrays;

public class CustomMethods {


    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = reverse(str);

        System.out.println(result);

      //  "".substr
     //   Arrays.sort()


    }



    public static String reverse(String str){

        String reverse = "";

        for( int i = str.length()-1;  i >= 0; i--  ){

            reverse += str.charAt(i);

        }

        return reverse;
    }


}
