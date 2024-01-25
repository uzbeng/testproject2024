package lesson11;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxRunner {

    public static void main(String[] args) {
//        String url = "https://google.com";
        String url = "https://facebook.com";

        System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().setPosition(new Point(-1800, 0));

        driver.get(url);
    }
}
