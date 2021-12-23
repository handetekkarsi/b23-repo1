package boot_camp;

public class WrapperClasses {

    public static void main(String[] args) {

        String str = "123";

        int num1 = Integer.parseInt(str); // primitive

        Integer num2 = Integer.valueOf(str); // Wrapper class object


        String str2 = "12.5";

        Double d1 = Double.valueOf(str2);
        double d2 = Double.parseDouble(str2);



    }


}
