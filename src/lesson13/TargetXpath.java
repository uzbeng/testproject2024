package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetXpath {

    public static void main(String[] args) throws InterruptedException {
        // Driver location:
        // key=value,  name=london
        // webdriver.chrome.driver={location}
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();  // opens chrome browser

        // Move the window to left screen: (do not do it)
        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.manage().window().maximize();

        // Interacting with chrome browser:
        // 1] Open certain URL:
        driver.get("https://target.com/");

        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
//        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("email@mail.com");
//        driver.findElement(By.xpath("//*[contains(@id,'login-p')]")).sendKeys("mypassword");
//        driver.findElement(By.xpath("//button/span[text()='Sign in']")).click();
    }
}
