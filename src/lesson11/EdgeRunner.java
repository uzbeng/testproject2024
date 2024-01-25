package lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeRunner {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().setPosition(new Point(-1800, 0));

        driver.get("https://facebook.com");

    }
}
