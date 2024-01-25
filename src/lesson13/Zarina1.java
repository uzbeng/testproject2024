package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Zarina1 {
    public static void main(String[] args) throws InterruptedException {

        //Driver loaction has to be specified
        //key=value, name = London
        //webdriver.chrome.driver={location}
        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
        //automatically opens chrome
        WebDriver driver = new EdgeDriver();
        driver.manage().window().setPosition(new Point(-1800, 0));
        //Move the window to the left
        //driver.manage().window().setPosition(new Point(x:2000; y=0));
        //Interacting with chrome browser:
        //1)open certain URL:
        driver.get("https://www.netflix.com/");
        //finding element
        driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(2000);
        WebElement accountNameBox = driver.findElement(By.id("id_userLoginId"));
        accountNameBox.sendKeys("whoknows");
        driver.findElement(By.id("id_password")).sendKeys("thisismypassword");
        driver.findElement(By.className("login-remember-me-label-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("create a new account")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign up now")).click();
        Thread.sleep(2000);
        driver.quit();




    }
}
