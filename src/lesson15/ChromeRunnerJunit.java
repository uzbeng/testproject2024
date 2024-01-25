package lesson15;

import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChromeRunnerJunit extends Base {


    @Test // Annotation (it starts with @ sign and we need to place directly above method)
    public void test1() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void test2() {
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("blabla")).click();
    }

    @Test
    public void test3() {
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("blabla")).click();
    }
}
