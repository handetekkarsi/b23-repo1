package day59_Maps;

public class CharSequences {

    public static void main(String[] args) {

       String str1 = "cybertek";
       String str2 = new String("cybertek");

       String string = "wooden spoon"; // impossible to change the object once it's created
       string.concat(" is the best"); //"wooden spoon is the best"

        System.out.println(string);

       System.out.println("----------------------------------");

       StringBuilder stringBuilder = new StringBuilder("wooden spoon");
       stringBuilder.append(" is the best");

        System.out.println(stringBuilder);

        stringBuilder.reverse();


        System.out.println(stringBuilder);

        System.out.println("--------------------------------------");
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = "Cat";
        String s4 = "Cat";
        String s5 = "Cat";

        System.out.println("---------------------------------------");
        StringBuilder sb1 = new StringBuilder("Cat");
        StringBuilder sb2 = new StringBuilder("Cat");
        StringBuilder sb3 = new StringBuilder("Cat");
        StringBuilder sb4 = new StringBuilder("Cat");
        StringBuilder sb5 = new StringBuilder("Cat");




    }


    public static String reverse(String str){
       return  new StringBuilder(str).reverse().toString();
    }



}
