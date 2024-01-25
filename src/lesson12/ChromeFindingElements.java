package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChromeFindingElements {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.get("https://facebook.com");

        // Finding elements:
        WebElement usernameBox = driver.findElement(By.id("email"));
        // Do the action:
//        usernameBox.sendKeys("myusername");


        // Locators:
//        driver.findElement(By.id("pass")).sendKeys("mypassword");
//        driver.findElement(By.className("_6lux"));

//        driver.findElement(By.name("login")).click();


//        driver.findElement(By.linkText("Forgot password?")).click();
//        driver.findElement(By.partialLinkText("got pass")).click();
//        driver.findElement(By.xpath(""));
//        driver.findElement(By.cssSelector(""));

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for(WebElement link: allLinks) {
            System.out.println(link.getAttribute("href"));
        }


    }
}
