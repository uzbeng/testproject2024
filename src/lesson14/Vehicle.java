package lesson14;

public class Vehicle {

    public String name = "Vehicle";
    protected String model;

    protected String strProtected;
    String strDefault;  // default - available in the same package
    private String strPrivate;


    public void makeSound() {
        System.out.println("Some sound");
    }
}
