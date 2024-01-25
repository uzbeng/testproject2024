package lesson14;

import lesson14.Vehicle;

public class Truck extends Vehicle {

    // final keyword:
    // 1. final variable - constant, cannot be changed after initializing it.
    // 2. final method - cannot change/override method
    // 3. final class - cannot be inherited

    String capacity;
    final String name = "Truck";

    // Method signature - method name + arguments + return type
    // Access modifier should be the same level or more accessible level
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Truck sound!");
        System.out.println("name: " + super.name);
//        name = "somethins else";
    }
}
