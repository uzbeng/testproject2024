package java_collections;

import java.util.HashMap;

public class MapInterface {

    public static void main(String[] args) {

        // key = value
        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Umid", 55);
        studentGrades.put("Shaxnoza", 67);
        studentGrades.put("Sohiba", 56);

        System.out.println(studentGrades.get("Umid"));

        System.out.println(studentGrades);

        for(String key : studentGrades.keySet()) {
            if (key.equals("Umid")) {
                System.out.println(studentGrades.get(key));
                break;
            }

        }
    }
}
