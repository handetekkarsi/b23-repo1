package day58_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractice {

    public static void main(String[] args) {

        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ibrahim",95);
        students.put("Merve",90);
        students.put("John",72);
        students.put("Daniela",70);
        students.put("Akbar",89);
        students.put("Nazli",81);
        students.put("Yasin",850);
        students.put("Halil",95);
        students.put("Nemo",85);
        students.put("Yuliaa",80);
        students.put("Stranger",45);
        students.put("Atila",90);
        students.put("Marina",100);
        students.put("Joe",70);
        students.put("Smith",80);
        students.put("Sabir",95);



    }

}

/*
Tasks:
    1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80

    2. create a map that can contains name and Date Of Birth.
            put 5 of your classmates' names and their date of birth
            print out the names of the students who were born before 1980 January 1st

    3. create a map that can contain names of countries and their capitals
                use for each loop to print out all the capitals
 */