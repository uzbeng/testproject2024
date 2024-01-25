package lesson14;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.move();

        Animal cat = new Cat();
//        cat.move();
//
//        WebDriver driver = new ChromeDriver();

        animalMovements(cat);
    }

    public static void animalMovements(Animal animal) {
        animal.move();
    }

}
