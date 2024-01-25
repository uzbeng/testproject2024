package lesson16;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class ChromeRunnerTestNg extends Base {


    @Test // Annotation (it starts with @ sign and we need to place directly above method)
    public void test1() {

        driver.get("https://www.letskodeit.com/practice");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
        Point point = driver.manage().window().getPosition();
        driver.manage().window().setPosition(new Point(-1700, 50));
        Dimension dimension = driver.manage().window().getSize();
        System.out.println("Height: " + dimension.height );
        System.out.println("Width: " + dimension.width );

        driver.manage().window().setSize(new Dimension(600, 600));

        System.out.println(point.x + " : " + point.y);

        driver.findElement(By.cssSelector("input[id='bmwradio'][name=cars]")).click();
    }

}
