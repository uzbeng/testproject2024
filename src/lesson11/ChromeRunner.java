package lesson11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRunner {

    public static void main(String[] args) {
        // Driver location:
        // key=value,  name=london
        // webdriver.chrome.driver={location}
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();  // opens chrome browser

        // Move the window to left screen: (do not do it)
        driver.manage().window().setPosition(new Point(-1800, 0));

        // Interacting with chrome browser:
        // 1] Open certain URL:
        driver.get("https://www.amazon.com/");


    }
}
