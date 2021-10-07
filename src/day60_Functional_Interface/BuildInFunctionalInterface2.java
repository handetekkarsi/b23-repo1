package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {
      // create a function that can reverse a string
        Function<String, String> reverse = (s) ->  new StringBuilder(s).reverse().toString() ;

        String r1 = reverse.apply("Wooden Spoon");


     // create a function that can check if the string is palindrome
        Function<String, Boolean> isPalindrome = s -> {
            String r = reverse.apply(s);
            return s.equalsIgnoreCase(r);
        };

        boolean r2 = isPalindrome.apply("Anna");


    // create a function that can return the maximum number from array of integers
        Function<Integer[], Integer> maxNumFromArray = arr -> {
            Arrays.sort(arr);
        return arr[arr.length-1];
        };
       Integer[] arr = {1,2,3,4,5};
        maxNumFromArray.apply(arr);


    // create a function that can return the maximum number from arraylist of integers
    Function<ArrayList<Integer>, Integer> maxNumFromArrayList = list -> {
        Collections.sort(list);
        return list.get( list.size()-1 );
    };

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        maxNumFromArrayList.apply(list);



    }

}
