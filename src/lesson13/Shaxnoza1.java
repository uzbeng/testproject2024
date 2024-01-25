package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaxnoza1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin");

//System.out.println(driver.getPageSource());
        WebElement elementName = driver.findElement(By.id("username"));
        elementName.sendKeys("shahnaza.ruzimova@gmail.com");

        driver.findElement(By.id("password")).sendKeys("Yannaz.95");
        Thread.sleep(2000);
        driver.findElement(By.id("keepMeSignedIn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();
    }

}
