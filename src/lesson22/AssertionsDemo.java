package lesson22;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {

    @Test
    public void testWithAssertions() {

        SoftAssert softAssert = new SoftAssert();

        // Test case:
        // Requirement --> expected results
        // Action: --> actual results
        // 1. Passed = actual == expected
        // 2. Failed = actual != expected

        String expectedAlertText = "Hello, welcome!";
        String alertText = "Hello, Welcome";

        double expectedProfit = 155.56;
        double totalProfit = 155.56;

//        Assert.fail("Failed it for fun!");
//        Assert.assertEquals(expectedAlertText, alertText, "Alert popup text messages mismatched");
        softAssert.assertEquals(expectedAlertText, alertText, "Alert popup text messages mismatched");
        Assert.assertEquals(totalProfit, expectedProfit, "Profit amount mismatch");

//        Assert.assertNotEquals(totalProfit, expectedProfit, "Profit amounts matched");

        // Hard Assertion  - verification
        // major functionality failure can be tested
//        Assert.assertTrue(5 > 6, "Assert true"); // It fails and method code execution will stop here
        softAssert.assertTrue(5 > 6, "Assert true");
        softAssert.assertFalse(5 < 6, "Assert false");

        // Soft Assertion  - validation
        // It does not stop the code if it fails.
        // Advantage is that it collects all the failing tests and generate report
        softAssert.assertAll("Test case: testWithAssertions");

    }

}
