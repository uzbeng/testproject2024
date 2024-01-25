package lesson18;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {


    @Parameters({"username", "password"})
    @Test
    public void testUsingParams(String username, String password) {
        System.out.println("Test with parameters: " + username + "/" + password);
    }
}
