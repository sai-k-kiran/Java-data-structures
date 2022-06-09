// Basic Hashmap

import java.util.HashMap;

public class HM1 {
    public static void main(String[] args) {
        HashMap<String, Integer> emp = new HashMap<>();

        emp.put("Saik", 111);
        emp.put("Bob", 112);
        emp.put("Tom", 113);
        emp.put("John", 114);

        int SaiID = emp.get("Saik");

        System.out.println("Emp ID of Saik is: " + SaiID);

        System.out.println("Emp IDs of all employees: " + emp);

        emp.put("Tom", 118); // This replaces the emp ID of Tom

        emp.containsKey("Bob"); // True

        emp.containsValue(112); // True

        emp.replace("Tim", 116, 112); // Does nothing coz Tim key isnt present

        System.out.println("Emp IDs of all employees: " + emp);

    }
}

/*
 * The key and value in hasmap should be classes(Integer, String...)
 * and not primitive data types.(int, float, double...). Use wrapper class of
 * the primitive data types
 */
