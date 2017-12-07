package pl.waw.sgh;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Anna", 4);
        myMap.put("John", 3);
        myMap.put("Cristina", 6);

        int howManyPeople = 0;


        for (String key : myMap.keySet()) {
            System.out.println(key + "=" + myMap.get(key));
            howManyPeople += myMap.get(key);
        }


        System.out.println("sum of people = " + howManyPeople);
    }
}