package lesson17;

import org.testng.annotations.*;

public class AnnotationsTestng2 extends CommonStuff{


    @Test
    public void test3() {
        System.out.println("Test3");
    }

    @Test
    public void test4() {
        System.out.println("Test4");
    }


//    BeforeSuite
//    BeforeTest
//================================================================
//    BeforeClass
//    BeforeMethod
//    Test1
//    AfterMethod
//    BeforeMethod
//    Test2
//    AfterMethod
//    AfterClass
//================================================================
//    BeforeClass
//    BeforeMethod
//    Test3
//    AfterMethod
//    BeforeMethod
//    Test4
//    AfterMethod
//    AfterClass
//================================================================
//    AfterTest
//    AfterSuite
}
