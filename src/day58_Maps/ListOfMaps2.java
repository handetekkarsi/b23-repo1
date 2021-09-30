package day58_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] familyMember = {"John","Kevin","Lik"};
        LocalDate[] DOBFamilyMember = {LocalDate.of(1992,01,02),LocalDate.of(1993,01,03),LocalDate.of(1994,01,04)};

        String[] classMates = {"Jerry","Karim","Merk","Clark"};
        LocalDate[] DOBClassMates = {LocalDate.of(1995,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};

        String[] friends = {"Erik","Kahri","Morh","Jonny"};
        LocalDate[] DOBFriends = {LocalDate.of(1997,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};


        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(
                new HashMap<>(), // add family members & their DoB
                new HashMap<>(), // add class mates & their DoB
                new HashMap<>() // add friends & their DoB
        ));

        System.out.println("------------------------------------------");
        // add family members & their DoB into the first Map of listOfMap

        System.out.println("------------------------------------------");
        // add class mates & their DoB into the second map of listOfMap

        System.out.println("------------------------------------------");
        // add friends & their DoB into the third map of listOfMap


    // come back at 3:18 pm




    }
}
