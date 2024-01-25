package lesson13;

import java.util.Random;

public class HowToGetRandomValues {

    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0; i<10; i++) {
            String username = "Name" + random.nextInt(10000,99999);
            String password = "password" + random.nextInt(10000,99999);
            System.out.println(username + " : " + password);
        }
    }

    // Homework: Explore random value generating libraries
}
