package lesson15;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MyTest {

    protected WebDriver driver = null; //Global variables get the null value by default

    @BeforeTest // It runs before each test method
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        driver = new ChromeDriver();

    }
}
