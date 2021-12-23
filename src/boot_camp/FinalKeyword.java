package boot_camp;

import java.time.LocalDate;

final class A extends Primitives{

}


public class FinalKeyword{

    public static void main(String[] args) {

        final double PI = 3.14;

    //    PI = 6.14;


        final String gender = "Female";

     //   gender = "Male";

        final LocalDate DoB = LocalDate.of(2000, 1, 5);

      //  DoB = LocalDate.of(2000, 2, 5);

    }

}
