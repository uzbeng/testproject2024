package lesson15;

public interface RemoteController {

    // Interface is a contract that requires any implementing class to add the method implementation.
    // Interface rules:
    // 1. Methods must be public. (by default all are public)
    // 2. Only method signature is specified
    // 3. Only public static final variables are allowed.

    static final double PI = 3.1415926535897932;

    void turnOn();

    void turnOff();

    int moveUp(int steps);


}
