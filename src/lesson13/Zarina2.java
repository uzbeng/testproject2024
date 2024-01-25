package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zarina2 {

    public static void main(String[] args) throws InterruptedException {

        //Driver loaction has to be specified
        //key=value, name = London
        //webdriver.chrome.driver={location}
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//automatically opens chrome
        //Move the window to the left
        //driver.manage().window().setPosition(new Point(x:2000; y=0));
        //Interacting with chrome browser:
        //1)open certain URL:
        driver.get("https://www.delta.com/");
        //finding element
        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.manage().window().maximize();

        driver.findElement(By.id("login-modal-button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helloworld");
//        driver.findElement(By.xpath("//input[@name='textfield']")).sendKeys("zarina");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hellonyc");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.partialLinkText("SIGN")).click();
//        driver.findElement(By.id("search_input")).sendKeys("JFK");
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("Forgot password")).click();
    }
}
