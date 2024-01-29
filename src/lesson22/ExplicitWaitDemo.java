package lesson22;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class ExplicitWaitDemo extends Base {


//    @Test
    public void testAlert() {
        driver.get("file:///C:/Users/Jurabek/OneDrive/Desktop/waits.html");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.id("alert")).click(); //alert will pop up

        wait.until(ExpectedConditions.alertIsPresent());
        // accept the alert
        driver.switchTo().alert().accept();
    }

    @Test
    public void testTextChange() {
        driver.get("file:///C:/Users/Jurabek/OneDrive/Desktop/waits.html");

        driver.findElement(By.id("populate-text")).click();

        wait.until(ExpectedConditions.textToBe(By.id("h2"), "Selenium Webdriver"));
        String text = driver.findElement(By.id("h2")).getText();
        Assert.assertEquals(text, "Selenium Webdriver", "Text message did not match");


    }
}
