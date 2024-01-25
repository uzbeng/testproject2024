package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sohiba1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
        String url = "https://www.costco.com/";
        WebDriver driver = new EdgeDriver();
        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.manage().window().maximize();
        driver.get("https://www.costco.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("header_sign_in")).click();
        Thread.sleep(3000);
        WebElement emailAddress = driver.findElement(By.id("signInName"));
        emailAddress.sendKeys("Sokhiba");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("DIA");
        Thread.sleep(2000);
        driver.navigate().to("https://www.costco.com/");
        Thread.sleep(2000);



        driver.findElement(By.id("Home_Ancillary_0")).click();
        Thread.sleep(2000);
        //driver.navigate().back();

        driver.findElement(By.id("Home_Ancillary_1")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

//        driver.findElement(By.id("Home_Ancillary_2")).click();
//        Thread.sleep(2000);
//        driver.switchTo().window("https://www.costco.com/grocery-household.html");
//        Thread.sleep(2000);

        driver.findElement(By.id("Home_Ancillary_3")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.id("Home_Ancillary_4")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Home_Ancillary_5")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Pharmacy")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Services")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Photo")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Travel")).click();
        driver.navigate().back();
        Thread.sleep(2000);


        driver.quit();

    }
}
