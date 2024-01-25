package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xonzoda {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        String myUrl = driver.getCurrentUrl();
        driver.navigate().to("https://google.com");
        myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
        Thread.sleep(5000);

        //driver.navigate().back();
        //Thread.sleep(5000);

        //driver.navigate().forward();
        //Thread.sleep(2000);

        driver.navigate().refresh();
        driver.findElement(By.id("APjFqb")).sendKeys("BMW");


        Thread.sleep(5000);
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        driver.close();



    }
}
