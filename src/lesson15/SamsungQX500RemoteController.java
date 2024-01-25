package lesson15;

import lesson14.Animal;

// If you are extending and implementing, then extend class should be first and then implement interface as second
// Only one class can be extended from, but multiple interfaces can be implemented from
public class SamsungQX500RemoteController extends SamsungTV implements RemoteController, FireStick {
    @Override
    public void turnOn() {
        System.out.println("Turn on the QX TV and show all the applications available");
    }

    @Override
    public void turnOff() {
        System.out.println("Close all running applications and then turn off the TV with special effects");
    }

    @Override
    public int moveUp(int steps) {
        System.out.println("Move the cursor up " + steps + " steps");
        return steps;
    }

    @Override
    public void turnOnAmazonApp() {

    }

    @Override
    public void turnOffAmazonApp() {

    }

    @Override
    public void openPrimeVideos() {

    }

    @Override
    public void abstractMethod() {
        // Some implementation of abstract method
    }
}
