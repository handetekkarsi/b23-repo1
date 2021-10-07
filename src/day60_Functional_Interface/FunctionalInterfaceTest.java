package day60_Functional_Interface;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        // create a function that can merge two strings
        StringsFunction mergeTwoStrings = (s1, s2) ->  s1+s2; ;

        String word1 = "Wooden";
        String word2 = "Spoon";

       String result1 =  mergeTwoStrings.function(word1, word2);

        System.out.println("result1 = " + result1);


        // create a function that can return the longest string between two strings
        StringsFunction longestString = (f, s) -> {
            if(f.length() > s.length()){
                return f;
            }else{
                return s;
            }
        };

        String result2 = longestString.function("Cybertek", "Cydeo");
        System.out.println("result2 = " + result2);


        // create a function that can return the initials of a person.   ex: Wooden Spoon ==> W.S
        StringsFunction initials = (f, l) ->   f.charAt(0) +"."+l.charAt(0);

       // longestString.function("Cybertek", "School");
        String result3 = initials.function("Cybertek", "School");
        System.out.println("result3 = " + result3);






    }





}
