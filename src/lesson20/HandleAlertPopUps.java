package lesson20;

import base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class HandleAlertPopUps extends Base {

    @Test
    public void testAlert() {
        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("alertbtn")).click();
        // Alert pupped up:
        Alert alertPopup = driver.switchTo().alert();
        String test = alertPopup.getText();
        System.out.println(test);
        Assert.assertEquals(test, "Some expected text message");
        alertPopup.accept();

        // Click on checkbox
        WebElement checkboxBmw = driver.findElement(By.id("bmwcheck"));
        checkboxBmw.click();

        Assert.assertTrue(checkboxBmw.isSelected(), "Checkbox did not get checked");


    }

    @Test
    public void testIFrames() {
        driver.get("https://www.letskodeit.com/practice");

        // Click on checkbox
        driver.findElement(By.id("bmwcheck")).click();

        // Write into search box of iframe
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("courses-iframe");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.letskodeit.com/courses']")));
//        driver.findElement(By.id("search")).click();
//        driver.findElement(By.id("search")).sendKeys("test");
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();

        // Click on checkbox
//        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("benzcheck")).click();

    }

    // Handling child windows:
    @Test
    public void handlingChildWindows() {
        driver.get("https://www.letskodeit.com/practice");

        Assert.assertEquals(driver.getTitle(), "Practice Page");

        String parentWinId = driver.getWindowHandle();
        System.out.println("Parent Id:" + parentWinId);

        // Open the child window
        driver.findElement(By.id("openwindow")).click();

        Set<String> winHandles = driver.getWindowHandles();
        System.out.println("All ids" + winHandles);
        String childWinId = null;
        for(String id : winHandles) {
            childWinId = id;
        }

        driver.switchTo().window(childWinId);
        Assert.assertEquals(driver.getTitle(), "Child window title");
        // Sign in inside child window
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//        driver.close();
        driver.quit();

//        driver.switchTo().window(parentWinId);
//
//        driver.findElement(By.id("benzcheck")).click();
    }
}
