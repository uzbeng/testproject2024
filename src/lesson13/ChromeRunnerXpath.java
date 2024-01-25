package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRunnerXpath {

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
        driver.get("https://demostore.x-cart.com/");

        driver.findElement(By.xpath("(//button[@class='btn  regular-button  popup-button popup-login'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("email@mail.com");
        driver.findElement(By.xpath("//*[contains(@id,'login-p')]")).sendKeys("mypassword");
        driver.findElement(By.xpath("//button/span[text()='Sign in']")).click();
    }
}
