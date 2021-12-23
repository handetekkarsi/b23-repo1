package boot_camp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5) );
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5) );
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5) );

        System.out.println(list);

        /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0){
                list.remove(i);
            }
        }

        System.out.println(list);
*/
        System.out.println("---------------------------------------------------");

        Iterator<Integer>  it = list.iterator();

        while(it.hasNext()){

            if(it.next()%2 != 0){
                it.remove();
            }

        }

        System.out.println(list);


        System.out.println("-------------------------------------");

        list.removeIf( p -> p%2 != 0 );




    }

}
