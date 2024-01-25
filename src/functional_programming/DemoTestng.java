package functional_programming;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestng {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(groups = {"smoke"})
    public void test2() {
        System.out.println("Test 2");
    }
}
