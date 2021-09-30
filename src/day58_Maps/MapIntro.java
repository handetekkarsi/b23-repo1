package day58_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {


    public static void main(String[] args) {

        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Selda", 100000);
        employeeMap.put("Dilem", 100000); // value can be duplicated
        employeeMap.put("Selda", 110000);  // key can not be duplicated
        employeeMap.put("Mucahit", 110000);
        employeeMap.put("John", 120000);

        System.out.println(employeeMap);
        int n1 = employeeMap.get("Mucahit");
        System.out.println(n1);

        System.out.println("--------------------------------------");

        System.out.println(employeeMap);
        employeeMap.remove("John");

        System.out.println(employeeMap);

        boolean r1 = employeeMap.containsKey("Muhtar"); // false
        boolean r2 = employeeMap.containsKey("John"); // false
        boolean r3 = employeeMap.containsKey("selda"); // false
        boolean r4 = employeeMap.containsKey("Selda"); // true

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("--------------------------------------");
        boolean r5 = employeeMap.containsValue(100000); // true
        boolean r6 = employeeMap.containsValue(200000); // false
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

        System.out.println("---------------------------------");
        System.out.println(employeeMap);

        employeeMap.replace("Selda", 120000);
        employeeMap.replace("Mucahit", employeeMap.get("Mucahit")+20000 );
        employeeMap.replace("Selda", employeeMap.get("Selda") - 5000 );

        System.out.println(employeeMap);

        System.out.println("-----------------------------------------");

        for (String eachName : employeeMap.keySet()) {
            System.out.println(eachName +" : "+employeeMap.get(eachName) );
        }




    }


}
