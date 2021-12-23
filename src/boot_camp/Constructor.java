package boot_camp;

public class Constructor {

    public Constructor(int a){
        System.out.println("Constructor with int");
    }

    public Constructor(double a){
        System.out.println("Constructor with double");
    }


    public static void main(String[] args) {

       // new Constructor();

        new Constructor(100);


    }


}
