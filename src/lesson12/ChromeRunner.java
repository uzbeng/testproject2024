package lesson12;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRunner {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.get("https://demostore.x-cart.com/");

        // some test steps here
        System.out.println(driver.getPageSource());

        //pause 2 sec
        Thread.sleep(2000);

//        driver.navigate().to("https://google.com");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().forward();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//
//        Thread.sleep(2000);

        // close the window:
//        driver.close();
        driver.quit();


    }
}
