package lesson13;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        int a = 5;
        Integer b = 7;
        System.out.println(a + b);

        // 1. Some classes require object type, not primitive type
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        // 2. Wrapper classes provide additional functionality with its fields and methods
        String numberAsString = b.toString();
        System.out.println(b.byteValue());
        System.out.println(Integer.max(5, 8));

        String number = "155";
        int intValue = Integer.parseInt(number);
        System.out.println(intValue + 15);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Boolean booleanObj = true;
        Long longObj = 42342L;
        Character charObj = 'a';
        System.out.println(Character.isDigit('x'));
        System.out.println(Character.isUpperCase('5'));

        // Automatic
        // Autoboxing - changing primitive type to class/object type: int >> Integer
        // Unboxing - changing class type to primitive type: Integer >> int
        int intPrimitive = 10;
        Integer intObject = intPrimitive; // Autoboxing

        int anotherIntPrim = intObject; // Unboxing

        // Explore all the methods in these classes
        // Integer, Long, Character, Boolean, Double
    }
}
