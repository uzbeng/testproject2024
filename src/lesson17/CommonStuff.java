package lesson17;

import org.testng.annotations.*;

public class CommonStuff extends BeforeAfterAnnotations{

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @BeforeGroups({"Smoke"})
    public void beforeGroup() {
        System.out.println("BeforeGroup Smoke");
    }

    @AfterGroups({"Smoke"})
    public void afterGroup() {
        System.out.println("AfterGroup Smoke");
    }
}
