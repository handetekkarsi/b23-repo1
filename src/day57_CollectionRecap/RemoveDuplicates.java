package day57_CollectionRecap;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,7,7,7,5,5,5,6,6,6,10,10,8,8,9,9,9));

        // convert one collection type to another:
        list =   new ArrayList<>(new TreeSet<>(list)) ;

        System.out.println(list);

        System.out.println("-------------------------------------------------------");
        Integer[] nums = {1,1,1,2,2,2,3,3,3,4,4,7,7,7,5,5,5,6,6,6,10,10,8,8,9,9,9};

        // converting collectionType to Array data structure
        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));


    }


}
