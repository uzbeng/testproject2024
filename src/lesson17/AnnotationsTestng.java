package lesson17;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

@Test
public class AnnotationsTestng extends CommonStuff {

    @Test(groups = {"Smoke", "UI", "DB"})
    public void test1() {
        System.out.println("Test1");
    }

//    @Test
    public void test2() {
        System.out.println("Test2");
    }
}

//    BeforeSuite
//    BeforeTest
//    BeforeClass
//    BeforeMethod
//    Test1
//    Test2
//    AfterMethod
//    AfterClass
//    AfterTest
//    AfterSuite

